(ns com.amazonaws.services.chime.AmazonChime
  "Interface for accessing Amazon Chime.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonChime instead.



  The Amazon Chime API (application programming interface) is designed for administrators to use to perform key tasks,
  such as creating and managing Amazon Chime accounts and users. This guide provides detailed information about the
  Amazon Chime API, including operations, types, inputs and outputs, and error codes.


  You can use an AWS SDK, the AWS Command Line Interface (AWS CLI), or the REST API to make API calls. We recommend
  using an AWS SDK or the AWS CLI. Each API operation includes links to information about using it with a
  language-specific AWS SDK or the AWS CLI.


  Using an AWS SDK


  You don't need to write code to calculate a signature for request authentication. The SDK clients authenticate your
  requests by using access keys that you provide. For more information about AWS SDKs, see the AWS Developer Center.


  Using the AWS CLI


  Use your access keys with the AWS CLI to make API calls. For information about setting up the AWS CLI, see Installing the AWS Command Line Interface
  in the AWS Command Line Interface User Guide. For a list of available Amazon Chime commands, see the Amazon Chime commands in the AWS CLI
  Command Reference.


  Using REST API


  If you use REST to make API calls, you must authenticate your request by providing a signature. Amazon Chime supports
  signature version 4. For more information, see Signature Version 4 Signing Process
  in the Amazon Web Services General Reference.


  When making REST API calls, use the service name chime and REST endpoint
  https://service.chime.aws.amazon.com.




  Administrative permissions are controlled using AWS Identity and Access Management (IAM). For more information, see
  Control Access to the Amazon Chime
  Console in the Amazon Chime Administration Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.chime AmazonChime]))

(defn invite-users
  "Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team
   account. Only Team account types are currently supported for this action.

  invite-users-request - `com.amazonaws.services.chime.model.InviteUsersRequest`

  returns: Result of the InviteUsers operation returned by the service. - `com.amazonaws.services.chime.model.InviteUsersResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.InviteUsersResult [^AmazonChime this ^com.amazonaws.services.chime.model.InviteUsersRequest invite-users-request]
    (-> this (.inviteUsers invite-users-request))))

(defn associate-phone-number-with-user
  "Associates a phone number with the specified Amazon Chime user.

  associate-phone-number-with-user-request - `com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest`

  returns: Result of the AssociatePhoneNumberWithUser operation returned by the service. - `com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest associate-phone-number-with-user-request]
    (-> this (.associatePhoneNumberWithUser associate-phone-number-with-user-request))))

(defn batch-update-phone-number
  "Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector
   product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.

  batch-update-phone-number-request - `com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest`

  returns: Result of the BatchUpdatePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.BatchUpdatePhoneNumberResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberResult [^AmazonChime this ^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest batch-update-phone-number-request]
    (-> this (.batchUpdatePhoneNumber batch-update-phone-number-request))))

(defn batch-delete-phone-number
  "Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon
   Chime Voice Connectors before they can be deleted.


   Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.

  batch-delete-phone-number-request - `com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest`

  returns: Result of the BatchDeletePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.BatchDeletePhoneNumberResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.BatchDeletePhoneNumberResult [^AmazonChime this ^com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest batch-delete-phone-number-request]
    (-> this (.batchDeletePhoneNumber batch-delete-phone-number-request))))

(defn put-events-configuration
  "Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either
   an HTTPS endpoint or a Lambda function ARN. For more information, see Bot.

  put-events-configuration-request - `com.amazonaws.services.chime.model.PutEventsConfigurationRequest`

  returns: Result of the PutEventsConfiguration operation returned by the service. - `com.amazonaws.services.chime.model.PutEventsConfigurationResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.PutEventsConfigurationResult [^AmazonChime this ^com.amazonaws.services.chime.model.PutEventsConfigurationRequest put-events-configuration-request]
    (-> this (.putEventsConfiguration put-events-configuration-request))))

(defn reset-personal-pin
  "Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object
   with the updated personal meeting PIN.

  reset-personal-pin-request - `com.amazonaws.services.chime.model.ResetPersonalPINRequest`

  returns: Result of the ResetPersonalPIN operation returned by the service. - `com.amazonaws.services.chime.model.ResetPersonalPINResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.ResetPersonalPINResult [^AmazonChime this ^com.amazonaws.services.chime.model.ResetPersonalPINRequest reset-personal-pin-request]
    (-> this (.resetPersonalPIN reset-personal-pin-request))))

(defn get-voice-connector
  "Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and
   encryption requirements.

  get-voice-connector-request - `com.amazonaws.services.chime.model.GetVoiceConnectorRequest`

  returns: Result of the GetVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetVoiceConnectorResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorRequest get-voice-connector-request]
    (-> this (.getVoiceConnector get-voice-connector-request))))

(defn put-voice-connector-termination
  "Adds termination settings for the specified Amazon Chime Voice Connector.

  put-voice-connector-termination-request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest`

  returns: Result of the PutVoiceConnectorTermination operation returned by the service. - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationResult [^AmazonChime this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest put-voice-connector-termination-request]
    (-> this (.putVoiceConnectorTermination put-voice-connector-termination-request))))

(defn get-phone-number
  "Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.

  get-phone-number-request - `com.amazonaws.services.chime.model.GetPhoneNumberRequest`

  returns: Result of the GetPhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.GetPhoneNumberResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetPhoneNumberResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetPhoneNumberRequest get-phone-number-request]
    (-> this (.getPhoneNumber get-phone-number-request))))

(defn disassociate-phone-numbers-from-voice-connector
  "Disassociates the specified phone number from the specified Amazon Chime Voice Connector.

  disassociate-phone-numbers-from-voice-connector-request - `com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest`

  returns: Result of the DisassociatePhoneNumbersFromVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorResult [^AmazonChime this ^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest disassociate-phone-numbers-from-voice-connector-request]
    (-> this (.disassociatePhoneNumbersFromVoiceConnector disassociate-phone-numbers-from-voice-connector-request))))

(defn update-voice-connector
  "Updates details for the specified Amazon Chime Voice Connector.

  update-voice-connector-request - `com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest`

  returns: Result of the UpdateVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.UpdateVoiceConnectorResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.UpdateVoiceConnectorResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest update-voice-connector-request]
    (-> this (.updateVoiceConnector update-voice-connector-request))))

(defn get-voice-connector-origination
  "Retrieves origination setting details for the specified Amazon Chime Voice Connector.

  get-voice-connector-origination-request - `com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest`

  returns: Result of the GetVoiceConnectorOrigination operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorOriginationResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest get-voice-connector-origination-request]
    (-> this (.getVoiceConnectorOrigination get-voice-connector-origination-request))))

(defn create-bot
  "Creates a bot for an Amazon Chime Enterprise account.

  create-bot-request - `com.amazonaws.services.chime.model.CreateBotRequest`

  returns: Result of the CreateBot operation returned by the service. - `com.amazonaws.services.chime.model.CreateBotResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.CreateBotResult [^AmazonChime this ^com.amazonaws.services.chime.model.CreateBotRequest create-bot-request]
    (-> this (.createBot create-bot-request))))

(defn update-user
  "Updates user details for a specified user ID. Currently, only LicenseType updates are supported for
   this action.

  update-user-request - `com.amazonaws.services.chime.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.chime.model.UpdateUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.UpdateUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdateUserRequest update-user-request]
    (-> this (.updateUser update-user-request))))

(defn get-bot
  "Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.

  get-bot-request - `com.amazonaws.services.chime.model.GetBotRequest`

  returns: Result of the GetBot operation returned by the service. - `com.amazonaws.services.chime.model.GetBotResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.GetBotResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetBotRequest get-bot-request]
    (-> this (.getBot get-bot-request))))

(defn update-bot
  "Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime
   Enterprise account.

  update-bot-request - `com.amazonaws.services.chime.model.UpdateBotRequest`

  returns: Result of the UpdateBot operation returned by the service. - `com.amazonaws.services.chime.model.UpdateBotResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.UpdateBotResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdateBotRequest update-bot-request]
    (-> this (.updateBot update-bot-request))))

(defn update-global-settings
  "Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
   Chime Voice Connector settings.

  update-global-settings-request - `com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest`

  returns: Result of the UpdateGlobalSettings operation returned by the service. - `com.amazonaws.services.chime.model.UpdateGlobalSettingsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.UpdateGlobalSettingsResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest update-global-settings-request]
    (-> this (.updateGlobalSettings update-global-settings-request))))

(defn delete-phone-number
  "Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any
   users or Amazon Chime Voice Connectors before it can be deleted.


   Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.

  delete-phone-number-request - `com.amazonaws.services.chime.model.DeletePhoneNumberRequest`

  returns: Result of the DeletePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.DeletePhoneNumberResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DeletePhoneNumberResult [^AmazonChime this ^com.amazonaws.services.chime.model.DeletePhoneNumberRequest delete-phone-number-request]
    (-> this (.deletePhoneNumber delete-phone-number-request))))

(defn logout-user
  "Logs out the specified user from all of the devices they are currently logged into.

  logout-user-request - `com.amazonaws.services.chime.model.LogoutUserRequest`

  returns: Result of the LogoutUser operation returned by the service. - `com.amazonaws.services.chime.model.LogoutUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.LogoutUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.LogoutUserRequest logout-user-request]
    (-> this (.logoutUser logout-user-request))))

(defn list-users
  "Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only
   the user that the email address belongs to.

  list-users-request - `com.amazonaws.services.chime.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.chime.model.ListUsersResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.ListUsersResult [^AmazonChime this ^com.amazonaws.services.chime.model.ListUsersRequest list-users-request]
    (-> this (.listUsers list-users-request))))

(defn get-voice-connector-termination-health
  "Retrieves information about the last time a SIP OPTIONS ping was received from your SIP
   infrastructure for the specified Amazon Chime Voice Connector.

  get-voice-connector-termination-health-request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest`

  returns: Result of the GetVoiceConnectorTerminationHealth operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest get-voice-connector-termination-health-request]
    (-> this (.getVoiceConnectorTerminationHealth get-voice-connector-termination-health-request))))

(defn batch-unsuspend-user
  "Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime
   EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using
   this action. For more information about different account types, see Managing Your Amazon Chime
   Accounts in the Amazon Chime Administration Guide.


   Previously suspended users who are unsuspended using this action are returned to Registered status.
   Users who are not previously suspended are ignored.

  batch-unsuspend-user-request - `com.amazonaws.services.chime.model.BatchUnsuspendUserRequest`

  returns: Result of the BatchUnsuspendUser operation returned by the service. - `com.amazonaws.services.chime.model.BatchUnsuspendUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.BatchUnsuspendUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.BatchUnsuspendUserRequest batch-unsuspend-user-request]
    (-> this (.batchUnsuspendUser batch-unsuspend-user-request))))

(defn list-voice-connectors
  "Lists the Amazon Chime Voice Connectors for the administrator's AWS account.

  list-voice-connectors-request - `com.amazonaws.services.chime.model.ListVoiceConnectorsRequest`

  returns: Result of the ListVoiceConnectors operation returned by the service. - `com.amazonaws.services.chime.model.ListVoiceConnectorsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.ListVoiceConnectorsResult [^AmazonChime this ^com.amazonaws.services.chime.model.ListVoiceConnectorsRequest list-voice-connectors-request]
    (-> this (.listVoiceConnectors list-voice-connectors-request))))

(defn list-bots
  "Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.

  list-bots-request - `com.amazonaws.services.chime.model.ListBotsRequest`

  returns: Result of the ListBots operation returned by the service. - `com.amazonaws.services.chime.model.ListBotsResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.ListBotsResult [^AmazonChime this ^com.amazonaws.services.chime.model.ListBotsRequest list-bots-request]
    (-> this (.listBots list-bots-request))))

(defn batch-update-user
  "Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon
   Chime account. Currently, only LicenseType updates are supported for this action.

  batch-update-user-request - `com.amazonaws.services.chime.model.BatchUpdateUserRequest`

  returns: Result of the BatchUpdateUser operation returned by the service. - `com.amazonaws.services.chime.model.BatchUpdateUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.BatchUpdateUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.BatchUpdateUserRequest batch-update-user-request]
    (-> this (.batchUpdateUser batch-update-user-request))))

(defn get-voice-connector-termination
  "Retrieves termination setting details for the specified Amazon Chime Voice Connector.

  get-voice-connector-termination-request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest`

  returns: Result of the GetVoiceConnectorTermination operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest get-voice-connector-termination-request]
    (-> this (.getVoiceConnectorTermination get-voice-connector-termination-request))))

(defn list-voice-connector-termination-credentials
  "Lists the SIP credentials for the specified Amazon Chime Voice Connector.

  list-voice-connector-termination-credentials-request - `com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest`

  returns: Result of the ListVoiceConnectorTerminationCredentials operation returned by the service. - `com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsResult [^AmazonChime this ^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest list-voice-connector-termination-credentials-request]
    (-> this (.listVoiceConnectorTerminationCredentials list-voice-connector-termination-credentials-request))))

(defn associate-phone-numbers-with-voice-connector
  "Associates a phone number with the specified Amazon Chime Voice Connector.

  associate-phone-numbers-with-voice-connector-request - `com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest`

  returns: Result of the AssociatePhoneNumbersWithVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorResult [^AmazonChime this ^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest associate-phone-numbers-with-voice-connector-request]
    (-> this (.associatePhoneNumbersWithVoiceConnector associate-phone-numbers-with-voice-connector-request))))

(defn put-voice-connector-termination-credentials
  "Adds termination SIP credentials for the specified Amazon Chime Voice Connector.

  put-voice-connector-termination-credentials-request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest`

  returns: Result of the PutVoiceConnectorTerminationCredentials operation returned by the service. - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsResult [^AmazonChime this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest put-voice-connector-termination-credentials-request]
    (-> this (.putVoiceConnectorTerminationCredentials put-voice-connector-termination-credentials-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonChime this]
    (-> this (.shutdown))))

(defn regenerate-security-token
  "Regenerates the security token for a bot.

  regenerate-security-token-request - `com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest`

  returns: Result of the RegenerateSecurityToken operation returned by the service. - `com.amazonaws.services.chime.model.RegenerateSecurityTokenResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.RegenerateSecurityTokenResult [^AmazonChime this ^com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest regenerate-security-token-request]
    (-> this (.regenerateSecurityToken regenerate-security-token-request))))

(defn get-events-configuration
  "Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint
   or Lambda function ARN.

  get-events-configuration-request - `com.amazonaws.services.chime.model.GetEventsConfigurationRequest`

  returns: Result of the GetEventsConfiguration operation returned by the service. - `com.amazonaws.services.chime.model.GetEventsConfigurationResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.GetEventsConfigurationResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetEventsConfigurationRequest get-events-configuration-request]
    (-> this (.getEventsConfiguration get-events-configuration-request))))

(defn get-user
  "Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting
   PIN.


   To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then
   filter by email address.

  get-user-request - `com.amazonaws.services.chime.model.GetUserRequest`

  returns: Result of the GetUser operation returned by the service. - `com.amazonaws.services.chime.model.GetUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetUserRequest get-user-request]
    (-> this (.getUser get-user-request))))

(defn restore-phone-number
  "Moves a phone number from the Deletion queue back into the phone number Inventory.

  restore-phone-number-request - `com.amazonaws.services.chime.model.RestorePhoneNumberRequest`

  returns: Result of the RestorePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.RestorePhoneNumberResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.RestorePhoneNumberResult [^AmazonChime this ^com.amazonaws.services.chime.model.RestorePhoneNumberRequest restore-phone-number-request]
    (-> this (.restorePhoneNumber restore-phone-number-request))))

(defn create-voice-connector
  "Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling
   CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS
   transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted
   outbound calls are blocked.

  create-voice-connector-request - `com.amazonaws.services.chime.model.CreateVoiceConnectorRequest`

  returns: Result of the CreateVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.CreateVoiceConnectorResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.CreateVoiceConnectorResult [^AmazonChime this ^com.amazonaws.services.chime.model.CreateVoiceConnectorRequest create-voice-connector-request]
    (-> this (.createVoiceConnector create-voice-connector-request))))

(defn delete-voice-connector-termination
  "Deletes the termination settings for the specified Amazon Chime Voice Connector.

  delete-voice-connector-termination-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest`

  returns: Result of the DeleteVoiceConnectorTermination operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationResult [^AmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest delete-voice-connector-termination-request]
    (-> this (.deleteVoiceConnectorTermination delete-voice-connector-termination-request))))

(defn list-phone-numbers
  "Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice
   Connector.

  list-phone-numbers-request - `com.amazonaws.services.chime.model.ListPhoneNumbersRequest`

  returns: Result of the ListPhoneNumbers operation returned by the service. - `com.amazonaws.services.chime.model.ListPhoneNumbersResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.ListPhoneNumbersResult [^AmazonChime this ^com.amazonaws.services.chime.model.ListPhoneNumbersRequest list-phone-numbers-request]
    (-> this (.listPhoneNumbers list-phone-numbers-request))))

(defn delete-events-configuration
  "Deletes the events configuration that allows a bot to receive outgoing events.

  delete-events-configuration-request - `com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest`

  returns: Result of the DeleteEventsConfiguration operation returned by the service. - `com.amazonaws.services.chime.model.DeleteEventsConfigurationResult`

  throws: com.amazonaws.services.chime.model.ServiceUnavailableException - The service is currently unavailable."
  (^com.amazonaws.services.chime.model.DeleteEventsConfigurationResult [^AmazonChime this ^com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest delete-events-configuration-request]
    (-> this (.deleteEventsConfiguration delete-events-configuration-request))))

(defn batch-suspend-user
  "Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more
   information about different account types, see Managing Your Amazon Chime
   Accounts in the Amazon Chime Administration Guide.


   Users suspended from a Team account are dissasociated from the account, but they can continue to use
   Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them
   to the Team account again. You can use the InviteUsers action to do so.


   Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no
   longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the
   BatchUnsuspendUser action.


   To sign out users without suspending them, use the LogoutUser action.

  batch-suspend-user-request - `com.amazonaws.services.chime.model.BatchSuspendUserRequest`

  returns: Result of the BatchSuspendUser operation returned by the service. - `com.amazonaws.services.chime.model.BatchSuspendUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.BatchSuspendUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.BatchSuspendUserRequest batch-suspend-user-request]
    (-> this (.batchSuspendUser batch-suspend-user-request))))

(defn delete-account
  "Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team
   account. You can use the BatchSuspendUser action to do so.


   For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for
   your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are
   suspended.


   Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account
   from your Disabled accounts list, you must contact AWS Support.


   After 90 days, deleted accounts are permanently removed from your Disabled accounts list.

  delete-account-request - `com.amazonaws.services.chime.model.DeleteAccountRequest`

  returns: Result of the DeleteAccount operation returned by the service. - `com.amazonaws.services.chime.model.DeleteAccountResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DeleteAccountResult [^AmazonChime this ^com.amazonaws.services.chime.model.DeleteAccountRequest delete-account-request]
    (-> this (.deleteAccount delete-account-request))))

(defn disassociate-phone-number-from-user
  "Disassociates the primary provisioned phone number from the specified Amazon Chime user.

  disassociate-phone-number-from-user-request - `com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest`

  returns: Result of the DisassociatePhoneNumberFromUser operation returned by the service. - `com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserResult [^AmazonChime this ^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest disassociate-phone-number-from-user-request]
    (-> this (.disassociatePhoneNumberFromUser disassociate-phone-number-from-user-request))))

(defn list-phone-number-orders
  "Lists the phone number orders for the administrator's Amazon Chime account.

  list-phone-number-orders-request - `com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest`

  returns: Result of the ListPhoneNumberOrders operation returned by the service. - `com.amazonaws.services.chime.model.ListPhoneNumberOrdersResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.ListPhoneNumberOrdersResult [^AmazonChime this ^com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest list-phone-number-orders-request]
    (-> this (.listPhoneNumberOrders list-phone-number-orders-request))))

(defn update-phone-number
  "Updates phone number details, such as product type, for the specified phone number ID. For toll-free numbers, you
   can use only the Amazon Chime Voice Connector product type.

  update-phone-number-request - `com.amazonaws.services.chime.model.UpdatePhoneNumberRequest`

  returns: Result of the UpdatePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.UpdatePhoneNumberResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.UpdatePhoneNumberResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdatePhoneNumberRequest update-phone-number-request]
    (-> this (.updatePhoneNumber update-phone-number-request))))

(defn list-accounts
  "Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name
   prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address,
   which returns one account result.

  list-accounts-request - `com.amazonaws.services.chime.model.ListAccountsRequest`

  returns: Result of the ListAccounts operation returned by the service. - `com.amazonaws.services.chime.model.ListAccountsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.ListAccountsResult [^AmazonChime this ^com.amazonaws.services.chime.model.ListAccountsRequest list-accounts-request]
    (-> this (.listAccounts list-accounts-request))))

(defn update-user-settings
  "Updates the settings for the specified user, such as phone number settings.

  update-user-settings-request - `com.amazonaws.services.chime.model.UpdateUserSettingsRequest`

  returns: Result of the UpdateUserSettings operation returned by the service. - `com.amazonaws.services.chime.model.UpdateUserSettingsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.UpdateUserSettingsResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdateUserSettingsRequest update-user-settings-request]
    (-> this (.updateUserSettings update-user-settings-request))))

(defn search-available-phone-numbers
  "Searches phone numbers that can be ordered.

  search-available-phone-numbers-request - `com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest`

  returns: Result of the SearchAvailablePhoneNumbers operation returned by the service. - `com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersResult [^AmazonChime this ^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest search-available-phone-numbers-request]
    (-> this (.searchAvailablePhoneNumbers search-available-phone-numbers-request))))

(defn update-account-settings
  "Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared
   screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime
   Administration Guide.

  update-account-settings-request - `com.amazonaws.services.chime.model.UpdateAccountSettingsRequest`

  returns: Result of the UpdateAccountSettings operation returned by the service. - `com.amazonaws.services.chime.model.UpdateAccountSettingsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.UpdateAccountSettingsResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdateAccountSettingsRequest update-account-settings-request]
    (-> this (.updateAccountSettings update-account-settings-request))))

(defn get-phone-number-order
  "Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164
   format, product type, and order status.

  get-phone-number-order-request - `com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest`

  returns: Result of the GetPhoneNumberOrder operation returned by the service. - `com.amazonaws.services.chime.model.GetPhoneNumberOrderResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetPhoneNumberOrderResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest get-phone-number-order-request]
    (-> this (.getPhoneNumberOrder get-phone-number-order-request))))

(defn get-account
  "Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.

  get-account-request - `com.amazonaws.services.chime.model.GetAccountRequest`

  returns: Result of the GetAccount operation returned by the service. - `com.amazonaws.services.chime.model.GetAccountResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetAccountResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetAccountRequest get-account-request]
    (-> this (.getAccount get-account-request))))

(defn update-account
  "Updates account details for the specified Amazon Chime account. Currently, only account name updates are
   supported for this action.

  update-account-request - `com.amazonaws.services.chime.model.UpdateAccountRequest`

  returns: Result of the UpdateAccount operation returned by the service. - `com.amazonaws.services.chime.model.UpdateAccountResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.UpdateAccountResult [^AmazonChime this ^com.amazonaws.services.chime.model.UpdateAccountRequest update-account-request]
    (-> this (.updateAccount update-account-request))))

(defn delete-voice-connector-termination-credentials
  "Deletes the specified SIP credentials used by your equipment to authenticate during call termination.

  delete-voice-connector-termination-credentials-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest`

  returns: Result of the DeleteVoiceConnectorTerminationCredentials operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsResult [^AmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest delete-voice-connector-termination-credentials-request]
    (-> this (.deleteVoiceConnectorTerminationCredentials delete-voice-connector-termination-credentials-request))))

(defn get-user-settings
  "Retrieves settings for the specified user ID, such as any associated phone number settings.

  get-user-settings-request - `com.amazonaws.services.chime.model.GetUserSettingsRequest`

  returns: Result of the GetUserSettings operation returned by the service. - `com.amazonaws.services.chime.model.GetUserSettingsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetUserSettingsResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetUserSettingsRequest get-user-settings-request]
    (-> this (.getUserSettings get-user-settings-request))))

(defn get-global-settings
  "Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
   Chime Voice Connector settings.

  get-global-settings-request - `com.amazonaws.services.chime.model.GetGlobalSettingsRequest`

  returns: Result of the GetGlobalSettings operation returned by the service. - `com.amazonaws.services.chime.model.GetGlobalSettingsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetGlobalSettingsResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetGlobalSettingsRequest get-global-settings-request]
    (-> this (.getGlobalSettings get-global-settings-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonChime this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-voice-connector-origination
  "Adds origination settings for the specified Amazon Chime Voice Connector.

  put-voice-connector-origination-request - `com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest`

  returns: Result of the PutVoiceConnectorOrigination operation returned by the service. - `com.amazonaws.services.chime.model.PutVoiceConnectorOriginationResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationResult [^AmazonChime this ^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest put-voice-connector-origination-request]
    (-> this (.putVoiceConnectorOrigination put-voice-connector-origination-request))))

(defn delete-voice-connector-origination
  "Deletes the origination settings for the specified Amazon Chime Voice Connector.

  delete-voice-connector-origination-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest`

  returns: Result of the DeleteVoiceConnectorOrigination operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationResult [^AmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest delete-voice-connector-origination-request]
    (-> this (.deleteVoiceConnectorOrigination delete-voice-connector-origination-request))))

(defn get-account-settings
  "Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out
   settings. For more information about these settings, see Use the Policies Page in the Amazon Chime
   Administration Guide.

  get-account-settings-request - `com.amazonaws.services.chime.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.chime.model.GetAccountSettingsResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.GetAccountSettingsResult [^AmazonChime this ^com.amazonaws.services.chime.model.GetAccountSettingsRequest get-account-settings-request]
    (-> this (.getAccountSettings get-account-settings-request))))

(defn create-phone-number-order
  "Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime
   Voice Connector product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product
   type.

  create-phone-number-order-request - `com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest`

  returns: Result of the CreatePhoneNumberOrder operation returned by the service. - `com.amazonaws.services.chime.model.CreatePhoneNumberOrderResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.CreatePhoneNumberOrderResult [^AmazonChime this ^com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest create-phone-number-order-request]
    (-> this (.createPhoneNumberOrder create-phone-number-order-request))))

(defn delete-voice-connector
  "Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice
   Connector must be unassigned from it before it can be deleted.

  delete-voice-connector-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest`

  returns: Result of the DeleteVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorResult [^AmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest delete-voice-connector-request]
    (-> this (.deleteVoiceConnector delete-voice-connector-request))))

(defn create-account
  "Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are
   currently supported for this action. For more information about different account types, see Managing Your Amazon Chime
   Accounts in the Amazon Chime Administration Guide.

  create-account-request - `com.amazonaws.services.chime.model.CreateAccountRequest`

  returns: Result of the CreateAccount operation returned by the service. - `com.amazonaws.services.chime.model.CreateAccountResult`

  throws: com.amazonaws.services.chime.model.UnauthorizedClientException - The client is not currently authorized to make the request."
  (^com.amazonaws.services.chime.model.CreateAccountResult [^AmazonChime this ^com.amazonaws.services.chime.model.CreateAccountRequest create-account-request]
    (-> this (.createAccount create-account-request))))

