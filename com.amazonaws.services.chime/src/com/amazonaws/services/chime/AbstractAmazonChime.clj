(ns com.amazonaws.services.chime.AbstractAmazonChime
  "Abstract implementation of AmazonChime. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.chime AbstractAmazonChime]))

(defn invite-users
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.InviteUsersRequest`

  returns: Result of the InviteUsers operation returned by the service. - `com.amazonaws.services.chime.model.InviteUsersResult`"
  (^com.amazonaws.services.chime.model.InviteUsersResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.InviteUsersRequest request]
    (-> this (.inviteUsers request))))

(defn associate-phone-number-with-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest`

  returns: Result of the AssociatePhoneNumberWithUser operation returned by the service. - `com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserResult`"
  (^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest request]
    (-> this (.associatePhoneNumberWithUser request))))

(defn batch-update-phone-number
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest`

  returns: Result of the BatchUpdatePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.BatchUpdatePhoneNumberResult`"
  (^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest request]
    (-> this (.batchUpdatePhoneNumber request))))

(defn batch-delete-phone-number
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest`

  returns: Result of the BatchDeletePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.BatchDeletePhoneNumberResult`"
  (^com.amazonaws.services.chime.model.BatchDeletePhoneNumberResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest request]
    (-> this (.batchDeletePhoneNumber request))))

(defn put-events-configuration
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.PutEventsConfigurationRequest`

  returns: Result of the PutEventsConfiguration operation returned by the service. - `com.amazonaws.services.chime.model.PutEventsConfigurationResult`"
  (^com.amazonaws.services.chime.model.PutEventsConfigurationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.PutEventsConfigurationRequest request]
    (-> this (.putEventsConfiguration request))))

(defn reset-personal-pin
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ResetPersonalPINRequest`

  returns: Result of the ResetPersonalPIN operation returned by the service. - `com.amazonaws.services.chime.model.ResetPersonalPINResult`"
  (^com.amazonaws.services.chime.model.ResetPersonalPINResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ResetPersonalPINRequest request]
    (-> this (.resetPersonalPIN request))))

(defn get-voice-connector
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorRequest`

  returns: Result of the GetVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorResult`"
  (^com.amazonaws.services.chime.model.GetVoiceConnectorResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorRequest request]
    (-> this (.getVoiceConnector request))))

(defn put-voice-connector-termination
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest`

  returns: Result of the PutVoiceConnectorTermination operation returned by the service. - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationResult`"
  (^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest request]
    (-> this (.putVoiceConnectorTermination request))))

(defn get-phone-number
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetPhoneNumberRequest`

  returns: Result of the GetPhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.GetPhoneNumberResult`"
  (^com.amazonaws.services.chime.model.GetPhoneNumberResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetPhoneNumberRequest request]
    (-> this (.getPhoneNumber request))))

(defn disassociate-phone-numbers-from-voice-connector
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest`

  returns: Result of the DisassociatePhoneNumbersFromVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorResult`"
  (^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest request]
    (-> this (.disassociatePhoneNumbersFromVoiceConnector request))))

(defn update-voice-connector
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest`

  returns: Result of the UpdateVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.UpdateVoiceConnectorResult`"
  (^com.amazonaws.services.chime.model.UpdateVoiceConnectorResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest request]
    (-> this (.updateVoiceConnector request))))

(defn get-voice-connector-origination
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest`

  returns: Result of the GetVoiceConnectorOrigination operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorOriginationResult`"
  (^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest request]
    (-> this (.getVoiceConnectorOrigination request))))

(defn create-bot
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.CreateBotRequest`

  returns: Result of the CreateBot operation returned by the service. - `com.amazonaws.services.chime.model.CreateBotResult`"
  (^com.amazonaws.services.chime.model.CreateBotResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.CreateBotRequest request]
    (-> this (.createBot request))))

(defn update-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.chime.model.UpdateUserResult`"
  (^com.amazonaws.services.chime.model.UpdateUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn get-bot
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetBotRequest`

  returns: Result of the GetBot operation returned by the service. - `com.amazonaws.services.chime.model.GetBotResult`"
  (^com.amazonaws.services.chime.model.GetBotResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetBotRequest request]
    (-> this (.getBot request))))

(defn update-bot
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdateBotRequest`

  returns: Result of the UpdateBot operation returned by the service. - `com.amazonaws.services.chime.model.UpdateBotResult`"
  (^com.amazonaws.services.chime.model.UpdateBotResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdateBotRequest request]
    (-> this (.updateBot request))))

(defn update-global-settings
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest`

  returns: Result of the UpdateGlobalSettings operation returned by the service. - `com.amazonaws.services.chime.model.UpdateGlobalSettingsResult`"
  (^com.amazonaws.services.chime.model.UpdateGlobalSettingsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest request]
    (-> this (.updateGlobalSettings request))))

(defn delete-phone-number
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DeletePhoneNumberRequest`

  returns: Result of the DeletePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.DeletePhoneNumberResult`"
  (^com.amazonaws.services.chime.model.DeletePhoneNumberResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DeletePhoneNumberRequest request]
    (-> this (.deletePhoneNumber request))))

(defn logout-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.LogoutUserRequest`

  returns: Result of the LogoutUser operation returned by the service. - `com.amazonaws.services.chime.model.LogoutUserResult`"
  (^com.amazonaws.services.chime.model.LogoutUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.LogoutUserRequest request]
    (-> this (.logoutUser request))))

(defn list-users
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.chime.model.ListUsersResult`"
  (^com.amazonaws.services.chime.model.ListUsersResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ListUsersRequest request]
    (-> this (.listUsers request))))

(defn get-voice-connector-termination-health
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest`

  returns: Result of the GetVoiceConnectorTerminationHealth operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthResult`"
  (^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest request]
    (-> this (.getVoiceConnectorTerminationHealth request))))

(defn batch-unsuspend-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.BatchUnsuspendUserRequest`

  returns: Result of the BatchUnsuspendUser operation returned by the service. - `com.amazonaws.services.chime.model.BatchUnsuspendUserResult`"
  (^com.amazonaws.services.chime.model.BatchUnsuspendUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.BatchUnsuspendUserRequest request]
    (-> this (.batchUnsuspendUser request))))

(defn list-voice-connectors
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ListVoiceConnectorsRequest`

  returns: Result of the ListVoiceConnectors operation returned by the service. - `com.amazonaws.services.chime.model.ListVoiceConnectorsResult`"
  (^com.amazonaws.services.chime.model.ListVoiceConnectorsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ListVoiceConnectorsRequest request]
    (-> this (.listVoiceConnectors request))))

(defn list-bots
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ListBotsRequest`

  returns: Result of the ListBots operation returned by the service. - `com.amazonaws.services.chime.model.ListBotsResult`"
  (^com.amazonaws.services.chime.model.ListBotsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ListBotsRequest request]
    (-> this (.listBots request))))

(defn batch-update-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.BatchUpdateUserRequest`

  returns: Result of the BatchUpdateUser operation returned by the service. - `com.amazonaws.services.chime.model.BatchUpdateUserResult`"
  (^com.amazonaws.services.chime.model.BatchUpdateUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.BatchUpdateUserRequest request]
    (-> this (.batchUpdateUser request))))

(defn get-voice-connector-termination
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest`

  returns: Result of the GetVoiceConnectorTermination operation returned by the service. - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationResult`"
  (^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest request]
    (-> this (.getVoiceConnectorTermination request))))

(defn list-voice-connector-termination-credentials
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest`

  returns: Result of the ListVoiceConnectorTerminationCredentials operation returned by the service. - `com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsResult`"
  (^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest request]
    (-> this (.listVoiceConnectorTerminationCredentials request))))

(defn associate-phone-numbers-with-voice-connector
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest`

  returns: Result of the AssociatePhoneNumbersWithVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorResult`"
  (^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest request]
    (-> this (.associatePhoneNumbersWithVoiceConnector request))))

(defn put-voice-connector-termination-credentials
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest`

  returns: Result of the PutVoiceConnectorTerminationCredentials operation returned by the service. - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsResult`"
  (^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest request]
    (-> this (.putVoiceConnectorTerminationCredentials request))))

(defn shutdown
  "Description copied from interface: AmazonChime"
  ([^AbstractAmazonChime this]
    (-> this (.shutdown))))

(defn regenerate-security-token
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest`

  returns: Result of the RegenerateSecurityToken operation returned by the service. - `com.amazonaws.services.chime.model.RegenerateSecurityTokenResult`"
  (^com.amazonaws.services.chime.model.RegenerateSecurityTokenResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest request]
    (-> this (.regenerateSecurityToken request))))

(defn get-events-configuration
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetEventsConfigurationRequest`

  returns: Result of the GetEventsConfiguration operation returned by the service. - `com.amazonaws.services.chime.model.GetEventsConfigurationResult`"
  (^com.amazonaws.services.chime.model.GetEventsConfigurationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetEventsConfigurationRequest request]
    (-> this (.getEventsConfiguration request))))

(defn get-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetUserRequest`

  returns: Result of the GetUser operation returned by the service. - `com.amazonaws.services.chime.model.GetUserResult`"
  (^com.amazonaws.services.chime.model.GetUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetUserRequest request]
    (-> this (.getUser request))))

(defn restore-phone-number
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.RestorePhoneNumberRequest`

  returns: Result of the RestorePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.RestorePhoneNumberResult`"
  (^com.amazonaws.services.chime.model.RestorePhoneNumberResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.RestorePhoneNumberRequest request]
    (-> this (.restorePhoneNumber request))))

(defn create-voice-connector
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.CreateVoiceConnectorRequest`

  returns: Result of the CreateVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.CreateVoiceConnectorResult`"
  (^com.amazonaws.services.chime.model.CreateVoiceConnectorResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.CreateVoiceConnectorRequest request]
    (-> this (.createVoiceConnector request))))

(defn delete-voice-connector-termination
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest`

  returns: Result of the DeleteVoiceConnectorTermination operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationResult`"
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest request]
    (-> this (.deleteVoiceConnectorTermination request))))

(defn list-phone-numbers
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ListPhoneNumbersRequest`

  returns: Result of the ListPhoneNumbers operation returned by the service. - `com.amazonaws.services.chime.model.ListPhoneNumbersResult`"
  (^com.amazonaws.services.chime.model.ListPhoneNumbersResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ListPhoneNumbersRequest request]
    (-> this (.listPhoneNumbers request))))

(defn delete-events-configuration
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest`

  returns: Result of the DeleteEventsConfiguration operation returned by the service. - `com.amazonaws.services.chime.model.DeleteEventsConfigurationResult`"
  (^com.amazonaws.services.chime.model.DeleteEventsConfigurationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest request]
    (-> this (.deleteEventsConfiguration request))))

(defn batch-suspend-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.BatchSuspendUserRequest`

  returns: Result of the BatchSuspendUser operation returned by the service. - `com.amazonaws.services.chime.model.BatchSuspendUserResult`"
  (^com.amazonaws.services.chime.model.BatchSuspendUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.BatchSuspendUserRequest request]
    (-> this (.batchSuspendUser request))))

(defn delete-account
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DeleteAccountRequest`

  returns: Result of the DeleteAccount operation returned by the service. - `com.amazonaws.services.chime.model.DeleteAccountResult`"
  (^com.amazonaws.services.chime.model.DeleteAccountResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DeleteAccountRequest request]
    (-> this (.deleteAccount request))))

(defn disassociate-phone-number-from-user
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest`

  returns: Result of the DisassociatePhoneNumberFromUser operation returned by the service. - `com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserResult`"
  (^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest request]
    (-> this (.disassociatePhoneNumberFromUser request))))

(defn list-phone-number-orders
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest`

  returns: Result of the ListPhoneNumberOrders operation returned by the service. - `com.amazonaws.services.chime.model.ListPhoneNumberOrdersResult`"
  (^com.amazonaws.services.chime.model.ListPhoneNumberOrdersResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest request]
    (-> this (.listPhoneNumberOrders request))))

(defn update-phone-number
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdatePhoneNumberRequest`

  returns: Result of the UpdatePhoneNumber operation returned by the service. - `com.amazonaws.services.chime.model.UpdatePhoneNumberResult`"
  (^com.amazonaws.services.chime.model.UpdatePhoneNumberResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdatePhoneNumberRequest request]
    (-> this (.updatePhoneNumber request))))

(defn list-accounts
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.ListAccountsRequest`

  returns: Result of the ListAccounts operation returned by the service. - `com.amazonaws.services.chime.model.ListAccountsResult`"
  (^com.amazonaws.services.chime.model.ListAccountsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.ListAccountsRequest request]
    (-> this (.listAccounts request))))

(defn update-user-settings
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdateUserSettingsRequest`

  returns: Result of the UpdateUserSettings operation returned by the service. - `com.amazonaws.services.chime.model.UpdateUserSettingsResult`"
  (^com.amazonaws.services.chime.model.UpdateUserSettingsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdateUserSettingsRequest request]
    (-> this (.updateUserSettings request))))

(defn search-available-phone-numbers
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest`

  returns: Result of the SearchAvailablePhoneNumbers operation returned by the service. - `com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersResult`"
  (^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest request]
    (-> this (.searchAvailablePhoneNumbers request))))

(defn update-account-settings
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdateAccountSettingsRequest`

  returns: Result of the UpdateAccountSettings operation returned by the service. - `com.amazonaws.services.chime.model.UpdateAccountSettingsResult`"
  (^com.amazonaws.services.chime.model.UpdateAccountSettingsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdateAccountSettingsRequest request]
    (-> this (.updateAccountSettings request))))

(defn get-phone-number-order
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest`

  returns: Result of the GetPhoneNumberOrder operation returned by the service. - `com.amazonaws.services.chime.model.GetPhoneNumberOrderResult`"
  (^com.amazonaws.services.chime.model.GetPhoneNumberOrderResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest request]
    (-> this (.getPhoneNumberOrder request))))

(defn get-account
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetAccountRequest`

  returns: Result of the GetAccount operation returned by the service. - `com.amazonaws.services.chime.model.GetAccountResult`"
  (^com.amazonaws.services.chime.model.GetAccountResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetAccountRequest request]
    (-> this (.getAccount request))))

(defn update-account
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.UpdateAccountRequest`

  returns: Result of the UpdateAccount operation returned by the service. - `com.amazonaws.services.chime.model.UpdateAccountResult`"
  (^com.amazonaws.services.chime.model.UpdateAccountResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.UpdateAccountRequest request]
    (-> this (.updateAccount request))))

(defn delete-voice-connector-termination-credentials
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest`

  returns: Result of the DeleteVoiceConnectorTerminationCredentials operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsResult`"
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest request]
    (-> this (.deleteVoiceConnectorTerminationCredentials request))))

(defn get-user-settings
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetUserSettingsRequest`

  returns: Result of the GetUserSettings operation returned by the service. - `com.amazonaws.services.chime.model.GetUserSettingsResult`"
  (^com.amazonaws.services.chime.model.GetUserSettingsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetUserSettingsRequest request]
    (-> this (.getUserSettings request))))

(defn get-global-settings
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetGlobalSettingsRequest`

  returns: Result of the GetGlobalSettings operation returned by the service. - `com.amazonaws.services.chime.model.GetGlobalSettingsResult`"
  (^com.amazonaws.services.chime.model.GetGlobalSettingsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetGlobalSettingsRequest request]
    (-> this (.getGlobalSettings request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonChime

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonChime this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-voice-connector-origination
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest`

  returns: Result of the PutVoiceConnectorOrigination operation returned by the service. - `com.amazonaws.services.chime.model.PutVoiceConnectorOriginationResult`"
  (^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest request]
    (-> this (.putVoiceConnectorOrigination request))))

(defn delete-voice-connector-origination
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest`

  returns: Result of the DeleteVoiceConnectorOrigination operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationResult`"
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest request]
    (-> this (.deleteVoiceConnectorOrigination request))))

(defn get-account-settings
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.GetAccountSettingsRequest`

  returns: Result of the GetAccountSettings operation returned by the service. - `com.amazonaws.services.chime.model.GetAccountSettingsResult`"
  (^com.amazonaws.services.chime.model.GetAccountSettingsResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettings request))))

(defn create-phone-number-order
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest`

  returns: Result of the CreatePhoneNumberOrder operation returned by the service. - `com.amazonaws.services.chime.model.CreatePhoneNumberOrderResult`"
  (^com.amazonaws.services.chime.model.CreatePhoneNumberOrderResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest request]
    (-> this (.createPhoneNumberOrder request))))

(defn delete-voice-connector
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest`

  returns: Result of the DeleteVoiceConnector operation returned by the service. - `com.amazonaws.services.chime.model.DeleteVoiceConnectorResult`"
  (^com.amazonaws.services.chime.model.DeleteVoiceConnectorResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest request]
    (-> this (.deleteVoiceConnector request))))

(defn create-account
  "Description copied from interface: AmazonChime

  request - `com.amazonaws.services.chime.model.CreateAccountRequest`

  returns: Result of the CreateAccount operation returned by the service. - `com.amazonaws.services.chime.model.CreateAccountResult`"
  (^com.amazonaws.services.chime.model.CreateAccountResult [^AbstractAmazonChime this ^com.amazonaws.services.chime.model.CreateAccountRequest request]
    (-> this (.createAccount request))))

