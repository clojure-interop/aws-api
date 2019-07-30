(ns com.amazonaws.services.cognitoidp.AbstractAWSCognitoIdentityProviderAsync
  "Abstract implementation of AWSCognitoIdentityProviderAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cognitoidp AbstractAWSCognitoIdentityProviderAsync]))

(defn admin-update-user-attributes-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to update the user's attributes as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUpdateUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUpdateUserAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateUserAttributesRequest request]
    (-> this (.adminUpdateUserAttributesAsync request))))

(defn untag-resource-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn admin-get-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to get the specified user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminGetUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminGetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminGetUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminGetUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetUserRequest request]
    (-> this (.adminGetUserAsync request))))

(defn get-device-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to get the device. - `com.amazonaws.services.cognitoidp.model.GetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetDeviceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetDeviceRequest request]
    (-> this (.getDeviceAsync request))))

(defn delete-user-pool-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to delete a user pool. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolRequest request]
    (-> this (.deleteUserPoolAsync request))))

(defn admin-link-provider-for-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminLinkProviderForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminLinkProviderForUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminLinkProviderForUserRequest request]
    (-> this (.adminLinkProviderForUserAsync request))))

(defn admin-confirm-sign-up-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to confirm user registration. - `com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminConfirmSignUp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminConfirmSignUpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminConfirmSignUpRequest request]
    (-> this (.adminConfirmSignUpAsync request))))

(defn admin-remove-user-from-group-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminRemoveUserFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminRemoveUserFromGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRemoveUserFromGroupRequest request]
    (-> this (.adminRemoveUserFromGroupAsync request))))

(defn update-device-status-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to update the device status. - `com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDeviceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDeviceStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateDeviceStatusRequest request]
    (-> this (.updateDeviceStatusAsync request))))

(defn admin-update-auth-event-feedback-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUpdateAuthEventFeedback operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUpdateAuthEventFeedbackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateAuthEventFeedbackRequest request]
    (-> this (.adminUpdateAuthEventFeedbackAsync request))))

(defn create-group-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.CreateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn admin-initiate-auth-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Initiates the authorization request, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminInitiateAuth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminInitiateAuthResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminInitiateAuthAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminInitiateAuthRequest request]
    (-> this (.adminInitiateAuthAsync request))))

(defn describe-identity-provider-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeIdentityProviderRequest request]
    (-> this (.describeIdentityProviderAsync request))))

(defn create-user-import-job-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to create the user import job. - `com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserImportJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserImportJobRequest request]
    (-> this (.createUserImportJobAsync request))))

(defn verify-software-token-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifySoftwareToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifySoftwareTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifySoftwareTokenRequest request]
    (-> this (.verifySoftwareTokenAsync request))))

(defn confirm-sign-up-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to confirm registration of a user. - `com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmSignUp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ConfirmSignUpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmSignUpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmSignUpRequest request]
    (-> this (.confirmSignUpAsync request))))

(defn delete-user-pool-client-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to delete a user pool client. - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPoolClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolClientRequest request]
    (-> this (.deleteUserPoolClientAsync request))))

(defn list-users-in-group-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsersInGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUsersInGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersInGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersInGroupRequest request]
    (-> this (.listUsersInGroupAsync request))))

(defn admin-respond-to-auth-challenge-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - The request to respond to the authentication challenge, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminRespondToAuthChallenge operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminRespondToAuthChallengeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminRespondToAuthChallengeRequest request]
    (-> this (.adminRespondToAuthChallengeAsync request))))

(defn get-csv-header-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to get the header information for the .csv file for the user import job. - `com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCSVHeader operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetCSVHeaderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCSVHeaderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetCSVHeaderRequest request]
    (-> this (.getCSVHeaderAsync request))))

(defn admin-disable-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to disable any user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDisableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDisableUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDisableUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableUserRequest request]
    (-> this (.adminDisableUserAsync request))))

(defn update-auth-event-feedback-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthEventFeedback operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthEventFeedbackAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateAuthEventFeedbackRequest request]
    (-> this (.updateAuthEventFeedbackAsync request))))

(defn create-user-pool-domain-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserPoolDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolDomainRequest request]
    (-> this (.createUserPoolDomainAsync request))))

(defn admin-enable-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request that enables the user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminEnableUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminEnableUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminEnableUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminEnableUserRequest request]
    (-> this (.adminEnableUserAsync request))))

(defn delete-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to delete a user. - `com.amazonaws.services.cognitoidp.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn forget-device-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to forget the device. - `com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ForgetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ForgetDeviceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.forgetDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgetDeviceRequest request]
    (-> this (.forgetDeviceAsync request))))

(defn admin-delete-user-attributes-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to delete user attributes as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDeleteUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDeleteUserAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserAttributesRequest request]
    (-> this (.adminDeleteUserAttributesAsync request))))

(defn describe-user-import-job-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to describe the user import job. - `com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserImportJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserImportJobRequest request]
    (-> this (.describeUserImportJobAsync request))))

(defn set-user-mfa-preference-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUserMFAPreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUserMFAPreferenceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserMFAPreferenceRequest request]
    (-> this (.setUserMFAPreferenceAsync request))))

(defn admin-delete-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to delete a user as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDeleteUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDeleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDeleteUserRequest request]
    (-> this (.adminDeleteUserAsync request))))

(defn delete-resource-server-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteResourceServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourceServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteResourceServerRequest request]
    (-> this (.deleteResourceServerAsync request))))

(defn update-identity-provider-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIdentityProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateIdentityProviderRequest request]
    (-> this (.updateIdentityProviderAsync request))))

(defn update-resource-server-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateResourceServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateResourceServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateResourceServerRequest request]
    (-> this (.updateResourceServerAsync request))))

(defn global-sign-out-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to sign out all devices. - `com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GlobalSignOut operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GlobalSignOutResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.globalSignOutAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GlobalSignOutRequest request]
    (-> this (.globalSignOutAsync request))))

(defn admin-create-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to create a user in the specified user pool. - `com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminCreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminCreateUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminCreateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest request]
    (-> this (.adminCreateUserAsync request))))

(defn resend-confirmation-code-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to resend the confirmation code. - `com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResendConfirmationCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resendConfirmationCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ResendConfirmationCodeRequest request]
    (-> this (.resendConfirmationCodeAsync request))))

(defn set-user-settings-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to set user settings. - `com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUserSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUserSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserSettingsRequest request]
    (-> this (.setUserSettingsAsync request))))

(defn create-identity-provider-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIdentityProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateIdentityProviderRequest request]
    (-> this (.createIdentityProviderAsync request))))

(defn get-user-pool-mfa-config-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserPoolMfaConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserPoolMfaConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserPoolMfaConfigRequest request]
    (-> this (.getUserPoolMfaConfigAsync request))))

(defn list-identity-providers-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListIdentityProvidersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityProvidersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListIdentityProvidersRequest request]
    (-> this (.listIdentityProvidersAsync request))))

(defn list-resource-servers-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.ListResourceServersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourceServers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListResourceServersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListResourceServersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourceServersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListResourceServersRequest request]
    (-> this (.listResourceServersAsync request))))

(defn stop-user-import-job-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to stop the user import job. - `com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.StopUserImportJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopUserImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StopUserImportJobRequest request]
    (-> this (.stopUserImportJobAsync request))))

(defn initiate-auth-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Initiates the authentication request. - `com.amazonaws.services.cognitoidp.model.InitiateAuthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InitiateAuth operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.InitiateAuthResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.InitiateAuthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.initiateAuthAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.InitiateAuthRequest request]
    (-> this (.initiateAuthAsync request))))

(defn set-risk-configuration-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetRiskConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetRiskConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setRiskConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetRiskConfigurationRequest request]
    (-> this (.setRiskConfigurationAsync request))))

(defn confirm-device-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Confirms the device request. - `com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ConfirmDeviceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmDeviceRequest request]
    (-> this (.confirmDeviceAsync request))))

(defn delete-user-attributes-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to delete user attributes. - `com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserAttributesRequest request]
    (-> this (.deleteUserAttributesAsync request))))

(defn set-ui-customization-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUICustomization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUICustomizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUICustomizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUICustomizationRequest request]
    (-> this (.setUICustomizationAsync request))))

(defn list-user-pools-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to list user pools. - `com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserPools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUserPoolsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserPoolsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolsRequest request]
    (-> this (.listUserPoolsAsync request))))

(defn get-identity-provider-by-identifier-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityProviderByIdentifier operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityProviderByIdentifierAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetIdentityProviderByIdentifierRequest request]
    (-> this (.getIdentityProviderByIdentifierAsync request))))

(defn update-group-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.UpdateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateGroupRequest request]
    (-> this (.updateGroupAsync request))))

(defn admin-disable-provider-for-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminDisableProviderForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminDisableProviderForUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminDisableProviderForUserRequest request]
    (-> this (.adminDisableProviderForUserAsync request))))

(defn admin-list-user-auth-events-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminListUserAuthEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminListUserAuthEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListUserAuthEventsRequest request]
    (-> this (.adminListUserAuthEventsAsync request))))

(defn admin-add-user-to-group-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminAddUserToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminAddUserToGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminAddUserToGroupRequest request]
    (-> this (.adminAddUserToGroupAsync request))))

(defn get-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to get information about the user. - `com.amazonaws.services.cognitoidp.model.GetUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserRequest request]
    (-> this (.getUserAsync request))))

(defn create-user-pool-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to create a user pool. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolRequest request]
    (-> this (.createUserPoolAsync request))))

(defn list-user-import-jobs-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to list the user import jobs. - `com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserImportJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUserImportJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserImportJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserImportJobsRequest request]
    (-> this (.listUserImportJobsAsync request))))

(defn describe-risk-configuration-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRiskConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRiskConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeRiskConfigurationRequest request]
    (-> this (.describeRiskConfigurationAsync request))))

(defn forgot-password-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to reset a user's password. - `com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ForgotPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ForgotPasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.forgotPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ForgotPasswordRequest request]
    (-> this (.forgotPasswordAsync request))))

(defn confirm-forgot-password-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - The request representing the confirmation for a password reset. - `com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmForgotPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmForgotPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ConfirmForgotPasswordRequest request]
    (-> this (.confirmForgotPasswordAsync request))))

(defn update-user-pool-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to update the user pool. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolRequest request]
    (-> this (.updateUserPoolAsync request))))

(defn describe-resource-server-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeResourceServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourceServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeResourceServerRequest request]
    (-> this (.describeResourceServerAsync request))))

(defn admin-set-user-mfa-preference-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminSetUserMFAPreference operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminSetUserMFAPreferenceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserMFAPreferenceRequest request]
    (-> this (.adminSetUserMFAPreferenceAsync request))))

(defn admin-reset-user-password-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to reset a user's password as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminResetUserPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminResetUserPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminResetUserPasswordRequest request]
    (-> this (.adminResetUserPasswordAsync request))))

(defn associate-software-token-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSoftwareToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSoftwareTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AssociateSoftwareTokenRequest request]
    (-> this (.associateSoftwareTokenAsync request))))

(defn create-resource-server-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateResourceServer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateResourceServerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createResourceServerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateResourceServerRequest request]
    (-> this (.createResourceServerAsync request))))

(defn describe-user-pool-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to describe the user pool. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolRequest request]
    (-> this (.describeUserPoolAsync request))))

(defn admin-forget-device-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Sends the forgot device request, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminForgetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminForgetDeviceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminForgetDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminForgetDeviceRequest request]
    (-> this (.adminForgetDeviceAsync request))))

(defn admin-list-devices-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to list devices, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminListDevicesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminListDevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListDevicesRequest request]
    (-> this (.adminListDevicesAsync request))))

(defn list-devices-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to list the devices. - `com.amazonaws.services.cognitoidp.model.ListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListDevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListDevicesRequest request]
    (-> this (.listDevicesAsync request))))

(defn create-user-pool-client-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to create a user pool client. - `com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.CreateUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserPoolClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.CreateUserPoolClientRequest request]
    (-> this (.createUserPoolClientAsync request))))

(defn get-group-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.GetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetGroupRequest request]
    (-> this (.getGroupAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn respond-to-auth-challenge-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - The request to respond to an authentication challenge. - `com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RespondToAuthChallenge operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.respondToAuthChallengeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.RespondToAuthChallengeRequest request]
    (-> this (.respondToAuthChallengeAsync request))))

(defn verify-user-attribute-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to verify user attributes. - `com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyUserAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.VerifyUserAttributeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyUserAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.VerifyUserAttributeRequest request]
    (-> this (.verifyUserAttributeAsync request))))

(defn admin-list-groups-for-user-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminListGroupsForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminListGroupsForUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminListGroupsForUserRequest request]
    (-> this (.adminListGroupsForUserAsync request))))

(defn start-user-import-job-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to start the user import job. - `com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartUserImportJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.StartUserImportJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startUserImportJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.StartUserImportJobRequest request]
    (-> this (.startUserImportJobAsync request))))

(defn admin-get-device-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to get the device, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminGetDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminGetDeviceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminGetDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminGetDeviceRequest request]
    (-> this (.adminGetDeviceAsync request))))

(defn update-user-attributes-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to update user attributes. - `com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserAttributesRequest request]
    (-> this (.updateUserAttributesAsync request))))

(defn sign-up-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to register a user. - `com.amazonaws.services.cognitoidp.model.SignUpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SignUp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SignUpResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SignUpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.signUpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SignUpRequest request]
    (-> this (.signUpAsync request))))

(defn admin-update-device-status-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - The request to update the device status, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUpdateDeviceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUpdateDeviceStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUpdateDeviceStatusRequest request]
    (-> this (.adminUpdateDeviceStatusAsync request))))

(defn describe-user-pool-domain-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserPoolDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolDomainRequest request]
    (-> this (.describeUserPoolDomainAsync request))))

(defn list-user-pool-clients-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to list the user pool clients. - `com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserPoolClients operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUserPoolClientsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserPoolClientsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUserPoolClientsRequest request]
    (-> this (.listUserPoolClientsAsync request))))

(defn describe-user-pool-client-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to describe a user pool client. - `com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeUserPoolClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DescribeUserPoolClientRequest request]
    (-> this (.describeUserPoolClientAsync request))))

(defn get-user-attribute-verification-code-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to get user attribute verification. - `com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserAttributeVerificationCode operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAttributeVerificationCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUserAttributeVerificationCodeRequest request]
    (-> this (.getUserAttributeVerificationCodeAsync request))))

(defn update-user-pool-domain-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - The UpdateUserPoolDomain request input. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPoolDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolDomainRequest request]
    (-> this (.updateUserPoolDomainAsync request))))

(defn admin-set-user-password-async
  "request - `com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminSetUserPassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminSetUserPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserPasswordRequest request]
    (-> this (.adminSetUserPasswordAsync request))))

(defn get-signing-certificate-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Request to get a signing certificate from Cognito. - `com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetSigningCertificateRequest request]
    (-> this (.getSigningCertificateAsync request))))

(defn change-password-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to change a user password. - `com.amazonaws.services.cognitoidp.model.ChangePasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangePassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ChangePasswordResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ChangePasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changePasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ChangePasswordRequest request]
    (-> this (.changePasswordAsync request))))

(defn update-user-pool-client-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to update the user pool client. - `com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserPoolClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserPoolClientAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.UpdateUserPoolClientRequest request]
    (-> this (.updateUserPoolClientAsync request))))

(defn get-ui-customization-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUICustomization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.GetUICustomizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUICustomizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.GetUICustomizationRequest request]
    (-> this (.getUICustomizationAsync request))))

(defn delete-user-pool-domain-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPoolDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPoolDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteUserPoolDomainRequest request]
    (-> this (.deleteUserPoolDomainAsync request))))

(defn list-users-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to list users. - `com.amazonaws.services.cognitoidp.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListUsersRequest request]
    (-> this (.listUsersAsync request))))

(defn list-groups-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.ListGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.ListGroupsRequest request]
    (-> this (.listGroupsAsync request))))

(defn set-user-pool-mfa-config-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetUserPoolMfaConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setUserPoolMfaConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.SetUserPoolMfaConfigRequest request]
    (-> this (.setUserPoolMfaConfigAsync request))))

(defn delete-group-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn add-custom-attributes-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to add custom attributes. - `com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddCustomAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AddCustomAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addCustomAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AddCustomAttributesRequest request]
    (-> this (.addCustomAttributesAsync request))))

(defn admin-user-global-sign-out-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - The request to sign out of all devices, as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminUserGlobalSignOut operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminUserGlobalSignOutAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminUserGlobalSignOutRequest request]
    (-> this (.adminUserGlobalSignOutAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-identity-provider-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - `com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentityProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.DeleteIdentityProviderRequest request]
    (-> this (.deleteIdentityProviderAsync request))))

(defn admin-set-user-settings-async
  "Description copied from interface: AWSCognitoIdentityProviderAsync

  request - Represents the request to set user settings as an administrator. - `com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdminSetUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.adminSetUserSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCognitoIdentityProviderAsync this ^com.amazonaws.services.cognitoidp.model.AdminSetUserSettingsRequest request]
    (-> this (.adminSetUserSettingsAsync request))))

