(ns com.amazonaws.services.chime.AmazonChimeAsyncClient
  "Client for accessing Amazon Chime asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.chime AmazonChimeAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.chime.AmazonChimeAsyncClientBuilder`"
  (^com.amazonaws.services.chime.AmazonChimeAsyncClientBuilder []
    (AmazonChimeAsyncClient/asyncBuilder )))

(defn get-account-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetAccountRequest request]
    (-> this (.getAccountAsync request))))

(defn get-phone-number-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetPhoneNumberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetPhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetPhoneNumberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPhoneNumberAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetPhoneNumberRequest request]
    (-> this (.getPhoneNumberAsync request))))

(defn get-phone-number-order-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPhoneNumberOrder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetPhoneNumberOrderResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPhoneNumberOrderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest request]
    (-> this (.getPhoneNumberOrderAsync request))))

(defn list-voice-connectors-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ListVoiceConnectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVoiceConnectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListVoiceConnectorsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListVoiceConnectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVoiceConnectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListVoiceConnectorsRequest request]
    (-> this (.listVoiceConnectorsAsync request))))

(defn get-account-settings-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetAccountSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetAccountSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetAccountSettingsRequest request]
    (-> this (.getAccountSettingsAsync request))))

(defn disassociate-phone-numbers-from-voice-connector-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnector operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociatePhoneNumbersFromVoiceConnectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest request]
    (-> this (.disassociatePhoneNumbersFromVoiceConnectorAsync request))))

(defn list-phone-number-orders-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPhoneNumberOrders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListPhoneNumberOrdersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPhoneNumberOrdersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest request]
    (-> this (.listPhoneNumberOrdersAsync request))))

(defn delete-voice-connector-termination-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnectorTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorTerminationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest request]
    (-> this (.deleteVoiceConnectorTerminationAsync request))))

(defn list-accounts-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ListAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListAccountsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListAccountsRequest request]
    (-> this (.listAccountsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonChimeAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-voice-connector-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorRequest request]
    (-> this (.getVoiceConnectorAsync request))))

(defn batch-update-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.BatchUpdateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchUpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchUpdateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchUpdateUserRequest request]
    (-> this (.batchUpdateUserAsync request))))

(defn list-phone-numbers-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ListPhoneNumbersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPhoneNumbers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListPhoneNumbersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListPhoneNumbersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPhoneNumbersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListPhoneNumbersRequest request]
    (-> this (.listPhoneNumbersAsync request))))

(defn reset-personal-pin-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ResetPersonalPINRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetPersonalPIN operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ResetPersonalPINResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ResetPersonalPINRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetPersonalPINAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ResetPersonalPINRequest request]
    (-> this (.resetPersonalPINAsync request))))

(defn search-available-phone-numbers-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAvailablePhoneNumbersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest request]
    (-> this (.searchAvailablePhoneNumbersAsync request))))

(defn create-voice-connector-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.CreateVoiceConnectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreateVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreateVoiceConnectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVoiceConnectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreateVoiceConnectorRequest request]
    (-> this (.createVoiceConnectorAsync request))))

(defn put-voice-connector-origination-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutVoiceConnectorOrigination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutVoiceConnectorOriginationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putVoiceConnectorOriginationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest request]
    (-> this (.putVoiceConnectorOriginationAsync request))))

(defn get-global-settings-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetGlobalSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGlobalSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetGlobalSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetGlobalSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGlobalSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetGlobalSettingsRequest request]
    (-> this (.getGlobalSettingsAsync request))))

(defn delete-voice-connector-origination-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnectorOrigination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorOriginationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest request]
    (-> this (.deleteVoiceConnectorOriginationAsync request))))

(defn put-events-configuration-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.PutEventsConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEventsConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutEventsConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutEventsConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutEventsConfigurationRequest request]
    (-> this (.putEventsConfigurationAsync request))))

(defn disassociate-phone-number-from-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociatePhoneNumberFromUser operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociatePhoneNumberFromUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest request]
    (-> this (.disassociatePhoneNumberFromUserAsync request))))

(defn list-voice-connector-termination-credentials-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVoiceConnectorTerminationCredentials operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVoiceConnectorTerminationCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest request]
    (-> this (.listVoiceConnectorTerminationCredentialsAsync request))))

(defn batch-unsuspend-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.BatchUnsuspendUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUnsuspendUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchUnsuspendUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchUnsuspendUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUnsuspendUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchUnsuspendUserRequest request]
    (-> this (.batchUnsuspendUserAsync request))))

(defn restore-phone-number-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.RestorePhoneNumberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestorePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.RestorePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.RestorePhoneNumberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restorePhoneNumberAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.RestorePhoneNumberRequest request]
    (-> this (.restorePhoneNumberAsync request))))

(defn update-user-settings-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdateUserSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateUserSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateUserSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateUserSettingsRequest request]
    (-> this (.updateUserSettingsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonChimeAsyncClient this]
    (-> this (.shutdown))))

(defn update-bot-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdateBotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateBotResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateBotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateBotRequest request]
    (-> this (.updateBotAsync request))))

(defn delete-events-configuration-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventsConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteEventsConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventsConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest request]
    (-> this (.deleteEventsConfigurationAsync request))))

(defn delete-account-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DeleteAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteAccountRequest request]
    (-> this (.deleteAccountAsync request))))

(defn batch-update-phone-number-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdatePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchUpdatePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdatePhoneNumberAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest request]
    (-> this (.batchUpdatePhoneNumberAsync request))))

(defn get-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetUserRequest request]
    (-> this (.getUserAsync request))))

(defn batch-suspend-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.BatchSuspendUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchSuspendUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchSuspendUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchSuspendUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchSuspendUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchSuspendUserRequest request]
    (-> this (.batchSuspendUserAsync request))))

(defn put-voice-connector-termination-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutVoiceConnectorTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutVoiceConnectorTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putVoiceConnectorTerminationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest request]
    (-> this (.putVoiceConnectorTerminationAsync request))))

(defn create-bot-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.CreateBotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreateBotResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreateBotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreateBotRequest request]
    (-> this (.createBotAsync request))))

(defn delete-voice-connector-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest request]
    (-> this (.deleteVoiceConnectorAsync request))))

(defn list-bots-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ListBotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListBotsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListBotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListBotsRequest request]
    (-> this (.listBotsAsync request))))

(defn get-user-settings-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetUserSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetUserSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetUserSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetUserSettingsRequest request]
    (-> this (.getUserSettingsAsync request))))

(defn logout-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.LogoutUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LogoutUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.LogoutUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.LogoutUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.logoutUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.LogoutUserRequest request]
    (-> this (.logoutUserAsync request))))

(defn get-voice-connector-termination-health-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnectorTerminationHealth operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorTerminationHealthAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest request]
    (-> this (.getVoiceConnectorTerminationHealthAsync request))))

(defn put-voice-connector-termination-credentials-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutVoiceConnectorTerminationCredentials operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putVoiceConnectorTerminationCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest request]
    (-> this (.putVoiceConnectorTerminationCredentialsAsync request))))

(defn batch-delete-phone-number-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeletePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchDeletePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeletePhoneNumberAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest request]
    (-> this (.batchDeletePhoneNumberAsync request))))

(defn create-account-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.CreateAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreateAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreateAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreateAccountRequest request]
    (-> this (.createAccountAsync request))))

(defn regenerate-security-token-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegenerateSecurityToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.RegenerateSecurityTokenResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.regenerateSecurityTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest request]
    (-> this (.regenerateSecurityTokenAsync request))))

(defn update-phone-number-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdatePhoneNumberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdatePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdatePhoneNumberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePhoneNumberAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdatePhoneNumberRequest request]
    (-> this (.updatePhoneNumberAsync request))))

(defn delete-voice-connector-termination-credentials-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnectorTerminationCredentials operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorTerminationCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest request]
    (-> this (.deleteVoiceConnectorTerminationCredentialsAsync request))))

(defn invite-users-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.InviteUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.InviteUsersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.InviteUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.InviteUsersRequest request]
    (-> this (.inviteUsersAsync request))))

(defn update-account-settings-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdateAccountSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateAccountSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateAccountSettingsRequest request]
    (-> this (.updateAccountSettingsAsync request))))

(defn delete-phone-number-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.DeletePhoneNumberRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeletePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeletePhoneNumberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePhoneNumberAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.DeletePhoneNumberRequest request]
    (-> this (.deletePhoneNumberAsync request))))

(defn get-bot-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetBotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetBotResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetBotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetBotRequest request]
    (-> this (.getBotAsync request))))

(defn associate-phone-number-with-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociatePhoneNumberWithUser operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associatePhoneNumberWithUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest request]
    (-> this (.associatePhoneNumberWithUserAsync request))))

(defn get-events-configuration-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetEventsConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventsConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetEventsConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetEventsConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventsConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetEventsConfigurationRequest request]
    (-> this (.getEventsConfigurationAsync request))))

(defn get-voice-connector-termination-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnectorTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorTerminationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest request]
    (-> this (.getVoiceConnectorTerminationAsync request))))

(defn update-voice-connector-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVoiceConnectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest request]
    (-> this (.updateVoiceConnectorAsync request))))

(defn associate-phone-numbers-with-voice-connector-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnector operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associatePhoneNumbersWithVoiceConnectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest request]
    (-> this (.associatePhoneNumbersWithVoiceConnectorAsync request))))

(defn list-users-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.ListUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.ListUsersRequest request]
    (-> this (.listUsersAsync request))))

(defn update-account-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdateAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateAccountRequest request]
    (-> this (.updateAccountAsync request))))

(defn create-phone-number-order-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePhoneNumberOrder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreatePhoneNumberOrderResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPhoneNumberOrderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest request]
    (-> this (.createPhoneNumberOrderAsync request))))

(defn update-global-settings-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGlobalSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateGlobalSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGlobalSettingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest request]
    (-> this (.updateGlobalSettingsAsync request))))

(defn update-user-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.UpdateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.UpdateUserRequest request]
    (-> this (.updateUserAsync request))))

(defn get-voice-connector-origination-async
  "Description copied from interface: AmazonChimeAsync

  request - `com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnectorOrigination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorOriginationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorOriginationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsyncClient this ^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest request]
    (-> this (.getVoiceConnectorOriginationAsync request))))

