(ns com.amazonaws.services.chime.AmazonChimeAsync
  "Interface for accessing Amazon Chime asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonChimeAsync instead.



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
  (:import [com.amazonaws.services.chime AmazonChimeAsync]))

(defn get-account-async
  "Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.

  get-account-request - `com.amazonaws.services.chime.model.GetAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetAccountRequest get-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAsync get-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetAccountRequest get-account-request]
    (-> this (.getAccountAsync get-account-request))))

(defn get-phone-number-async
  "Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.

  get-phone-number-request - `com.amazonaws.services.chime.model.GetPhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetPhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetPhoneNumberRequest get-phone-number-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPhoneNumberAsync get-phone-number-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetPhoneNumberRequest get-phone-number-request]
    (-> this (.getPhoneNumberAsync get-phone-number-request))))

(defn get-phone-number-order-async
  "Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164
   format, product type, and order status.

  get-phone-number-order-request - `com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPhoneNumberOrder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetPhoneNumberOrderResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest get-phone-number-order-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPhoneNumberOrderAsync get-phone-number-order-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetPhoneNumberOrderRequest get-phone-number-order-request]
    (-> this (.getPhoneNumberOrderAsync get-phone-number-order-request))))

(defn list-voice-connectors-async
  "Lists the Amazon Chime Voice Connectors for the administrator's AWS account.

  list-voice-connectors-request - `com.amazonaws.services.chime.model.ListVoiceConnectorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVoiceConnectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListVoiceConnectorsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListVoiceConnectorsRequest list-voice-connectors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVoiceConnectorsAsync list-voice-connectors-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListVoiceConnectorsRequest list-voice-connectors-request]
    (-> this (.listVoiceConnectorsAsync list-voice-connectors-request))))

(defn get-account-settings-async
  "Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out
   settings. For more information about these settings, see Use the Policies Page in the Amazon Chime
   Administration Guide.

  get-account-settings-request - `com.amazonaws.services.chime.model.GetAccountSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetAccountSettingsRequest get-account-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSettingsAsync get-account-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetAccountSettingsRequest get-account-settings-request]
    (-> this (.getAccountSettingsAsync get-account-settings-request))))

(defn disassociate-phone-numbers-from-voice-connector-async
  "Disassociates the specified phone number from the specified Amazon Chime Voice Connector.

  disassociate-phone-numbers-from-voice-connector-request - `com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnector operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest disassociate-phone-numbers-from-voice-connector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociatePhoneNumbersFromVoiceConnectorAsync disassociate-phone-numbers-from-voice-connector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DisassociatePhoneNumbersFromVoiceConnectorRequest disassociate-phone-numbers-from-voice-connector-request]
    (-> this (.disassociatePhoneNumbersFromVoiceConnectorAsync disassociate-phone-numbers-from-voice-connector-request))))

(defn list-phone-number-orders-async
  "Lists the phone number orders for the administrator's Amazon Chime account.

  list-phone-number-orders-request - `com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPhoneNumberOrders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListPhoneNumberOrdersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest list-phone-number-orders-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPhoneNumberOrdersAsync list-phone-number-orders-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListPhoneNumberOrdersRequest list-phone-number-orders-request]
    (-> this (.listPhoneNumberOrdersAsync list-phone-number-orders-request))))

(defn delete-voice-connector-termination-async
  "Deletes the termination settings for the specified Amazon Chime Voice Connector.

  delete-voice-connector-termination-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnectorTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest delete-voice-connector-termination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorTerminationAsync delete-voice-connector-termination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationRequest delete-voice-connector-termination-request]
    (-> this (.deleteVoiceConnectorTerminationAsync delete-voice-connector-termination-request))))

(defn list-accounts-async
  "Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name
   prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address,
   which returns one account result.

  list-accounts-request - `com.amazonaws.services.chime.model.ListAccountsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListAccountsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListAccountsRequest list-accounts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountsAsync list-accounts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListAccountsRequest list-accounts-request]
    (-> this (.listAccountsAsync list-accounts-request))))

(defn get-voice-connector-async
  "Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and
   encryption requirements.

  get-voice-connector-request - `com.amazonaws.services.chime.model.GetVoiceConnectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorRequest get-voice-connector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorAsync get-voice-connector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorRequest get-voice-connector-request]
    (-> this (.getVoiceConnectorAsync get-voice-connector-request))))

(defn batch-update-user-async
  "Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon
   Chime account. Currently, only LicenseType updates are supported for this action.

  batch-update-user-request - `com.amazonaws.services.chime.model.BatchUpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchUpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchUpdateUserRequest batch-update-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdateUserAsync batch-update-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchUpdateUserRequest batch-update-user-request]
    (-> this (.batchUpdateUserAsync batch-update-user-request))))

(defn list-phone-numbers-async
  "Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice
   Connector.

  list-phone-numbers-request - `com.amazonaws.services.chime.model.ListPhoneNumbersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPhoneNumbers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListPhoneNumbersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListPhoneNumbersRequest list-phone-numbers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPhoneNumbersAsync list-phone-numbers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListPhoneNumbersRequest list-phone-numbers-request]
    (-> this (.listPhoneNumbersAsync list-phone-numbers-request))))

(defn reset-personal-pin-async
  "Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object
   with the updated personal meeting PIN.

  reset-personal-pin-request - `com.amazonaws.services.chime.model.ResetPersonalPINRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetPersonalPIN operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ResetPersonalPINResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ResetPersonalPINRequest reset-personal-pin-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetPersonalPINAsync reset-personal-pin-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ResetPersonalPINRequest reset-personal-pin-request]
    (-> this (.resetPersonalPINAsync reset-personal-pin-request))))

(defn search-available-phone-numbers-async
  "Searches phone numbers that can be ordered.

  search-available-phone-numbers-request - `com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest search-available-phone-numbers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAvailablePhoneNumbersAsync search-available-phone-numbers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.SearchAvailablePhoneNumbersRequest search-available-phone-numbers-request]
    (-> this (.searchAvailablePhoneNumbersAsync search-available-phone-numbers-request))))

(defn create-voice-connector-async
  "Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling
   CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS
   transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted
   outbound calls are blocked.

  create-voice-connector-request - `com.amazonaws.services.chime.model.CreateVoiceConnectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreateVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreateVoiceConnectorRequest create-voice-connector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVoiceConnectorAsync create-voice-connector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreateVoiceConnectorRequest create-voice-connector-request]
    (-> this (.createVoiceConnectorAsync create-voice-connector-request))))

(defn put-voice-connector-origination-async
  "Adds origination settings for the specified Amazon Chime Voice Connector.

  put-voice-connector-origination-request - `com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutVoiceConnectorOrigination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutVoiceConnectorOriginationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest put-voice-connector-origination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putVoiceConnectorOriginationAsync put-voice-connector-origination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutVoiceConnectorOriginationRequest put-voice-connector-origination-request]
    (-> this (.putVoiceConnectorOriginationAsync put-voice-connector-origination-request))))

(defn get-global-settings-async
  "Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
   Chime Voice Connector settings.

  get-global-settings-request - `com.amazonaws.services.chime.model.GetGlobalSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGlobalSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetGlobalSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetGlobalSettingsRequest get-global-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGlobalSettingsAsync get-global-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetGlobalSettingsRequest get-global-settings-request]
    (-> this (.getGlobalSettingsAsync get-global-settings-request))))

(defn delete-voice-connector-origination-async
  "Deletes the origination settings for the specified Amazon Chime Voice Connector.

  delete-voice-connector-origination-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnectorOrigination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest delete-voice-connector-origination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorOriginationAsync delete-voice-connector-origination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorOriginationRequest delete-voice-connector-origination-request]
    (-> this (.deleteVoiceConnectorOriginationAsync delete-voice-connector-origination-request))))

(defn put-events-configuration-async
  "Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either
   an HTTPS endpoint or a Lambda function ARN. For more information, see Bot.

  put-events-configuration-request - `com.amazonaws.services.chime.model.PutEventsConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEventsConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutEventsConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutEventsConfigurationRequest put-events-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsConfigurationAsync put-events-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutEventsConfigurationRequest put-events-configuration-request]
    (-> this (.putEventsConfigurationAsync put-events-configuration-request))))

(defn disassociate-phone-number-from-user-async
  "Disassociates the primary provisioned phone number from the specified Amazon Chime user.

  disassociate-phone-number-from-user-request - `com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociatePhoneNumberFromUser operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest disassociate-phone-number-from-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociatePhoneNumberFromUserAsync disassociate-phone-number-from-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DisassociatePhoneNumberFromUserRequest disassociate-phone-number-from-user-request]
    (-> this (.disassociatePhoneNumberFromUserAsync disassociate-phone-number-from-user-request))))

(defn list-voice-connector-termination-credentials-async
  "Lists the SIP credentials for the specified Amazon Chime Voice Connector.

  list-voice-connector-termination-credentials-request - `com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVoiceConnectorTerminationCredentials operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest list-voice-connector-termination-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVoiceConnectorTerminationCredentialsAsync list-voice-connector-termination-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListVoiceConnectorTerminationCredentialsRequest list-voice-connector-termination-credentials-request]
    (-> this (.listVoiceConnectorTerminationCredentialsAsync list-voice-connector-termination-credentials-request))))

(defn batch-unsuspend-user-async
  "Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime
   EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using
   this action. For more information about different account types, see Managing Your Amazon Chime
   Accounts in the Amazon Chime Administration Guide.


   Previously suspended users who are unsuspended using this action are returned to Registered status.
   Users who are not previously suspended are ignored.

  batch-unsuspend-user-request - `com.amazonaws.services.chime.model.BatchUnsuspendUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUnsuspendUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchUnsuspendUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchUnsuspendUserRequest batch-unsuspend-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUnsuspendUserAsync batch-unsuspend-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchUnsuspendUserRequest batch-unsuspend-user-request]
    (-> this (.batchUnsuspendUserAsync batch-unsuspend-user-request))))

(defn restore-phone-number-async
  "Moves a phone number from the Deletion queue back into the phone number Inventory.

  restore-phone-number-request - `com.amazonaws.services.chime.model.RestorePhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestorePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.RestorePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.RestorePhoneNumberRequest restore-phone-number-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restorePhoneNumberAsync restore-phone-number-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.RestorePhoneNumberRequest restore-phone-number-request]
    (-> this (.restorePhoneNumberAsync restore-phone-number-request))))

(defn update-user-settings-async
  "Updates the settings for the specified user, such as phone number settings.

  update-user-settings-request - `com.amazonaws.services.chime.model.UpdateUserSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateUserSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateUserSettingsRequest update-user-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserSettingsAsync update-user-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateUserSettingsRequest update-user-settings-request]
    (-> this (.updateUserSettingsAsync update-user-settings-request))))

(defn update-bot-async
  "Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime
   Enterprise account.

  update-bot-request - `com.amazonaws.services.chime.model.UpdateBotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateBotResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateBotRequest update-bot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBotAsync update-bot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateBotRequest update-bot-request]
    (-> this (.updateBotAsync update-bot-request))))

(defn delete-events-configuration-async
  "Deletes the events configuration that allows a bot to receive outgoing events.

  delete-events-configuration-request - `com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventsConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteEventsConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest delete-events-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventsConfigurationAsync delete-events-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteEventsConfigurationRequest delete-events-configuration-request]
    (-> this (.deleteEventsConfigurationAsync delete-events-configuration-request))))

(defn delete-account-async
  "Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team
   account. You can use the BatchSuspendUser action to do so.


   For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for
   your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are
   suspended.


   Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account
   from your Disabled accounts list, you must contact AWS Support.


   After 90 days, deleted accounts are permanently removed from your Disabled accounts list.

  delete-account-request - `com.amazonaws.services.chime.model.DeleteAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteAccountRequest delete-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountAsync delete-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteAccountRequest delete-account-request]
    (-> this (.deleteAccountAsync delete-account-request))))

(defn batch-update-phone-number-async
  "Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector
   product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.

  batch-update-phone-number-request - `com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchUpdatePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchUpdatePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest batch-update-phone-number-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchUpdatePhoneNumberAsync batch-update-phone-number-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchUpdatePhoneNumberRequest batch-update-phone-number-request]
    (-> this (.batchUpdatePhoneNumberAsync batch-update-phone-number-request))))

(defn get-user-async
  "Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting
   PIN.


   To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then
   filter by email address.

  get-user-request - `com.amazonaws.services.chime.model.GetUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetUserRequest get-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAsync get-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetUserRequest get-user-request]
    (-> this (.getUserAsync get-user-request))))

(defn batch-suspend-user-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchSuspendUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchSuspendUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchSuspendUserRequest batch-suspend-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchSuspendUserAsync batch-suspend-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchSuspendUserRequest batch-suspend-user-request]
    (-> this (.batchSuspendUserAsync batch-suspend-user-request))))

(defn put-voice-connector-termination-async
  "Adds termination settings for the specified Amazon Chime Voice Connector.

  put-voice-connector-termination-request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutVoiceConnectorTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutVoiceConnectorTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest put-voice-connector-termination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putVoiceConnectorTerminationAsync put-voice-connector-termination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationRequest put-voice-connector-termination-request]
    (-> this (.putVoiceConnectorTerminationAsync put-voice-connector-termination-request))))

(defn create-bot-async
  "Creates a bot for an Amazon Chime Enterprise account.

  create-bot-request - `com.amazonaws.services.chime.model.CreateBotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreateBotResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreateBotRequest create-bot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBotAsync create-bot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreateBotRequest create-bot-request]
    (-> this (.createBotAsync create-bot-request))))

(defn delete-voice-connector-async
  "Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice
   Connector must be unassigned from it before it can be deleted.

  delete-voice-connector-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest delete-voice-connector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorAsync delete-voice-connector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorRequest delete-voice-connector-request]
    (-> this (.deleteVoiceConnectorAsync delete-voice-connector-request))))

(defn list-bots-async
  "Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.

  list-bots-request - `com.amazonaws.services.chime.model.ListBotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListBotsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListBotsRequest list-bots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBotsAsync list-bots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListBotsRequest list-bots-request]
    (-> this (.listBotsAsync list-bots-request))))

(defn get-user-settings-async
  "Retrieves settings for the specified user ID, such as any associated phone number settings.

  get-user-settings-request - `com.amazonaws.services.chime.model.GetUserSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetUserSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetUserSettingsRequest get-user-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserSettingsAsync get-user-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetUserSettingsRequest get-user-settings-request]
    (-> this (.getUserSettingsAsync get-user-settings-request))))

(defn logout-user-async
  "Logs out the specified user from all of the devices they are currently logged into.

  logout-user-request - `com.amazonaws.services.chime.model.LogoutUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LogoutUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.LogoutUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.LogoutUserRequest logout-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.logoutUserAsync logout-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.LogoutUserRequest logout-user-request]
    (-> this (.logoutUserAsync logout-user-request))))

(defn get-voice-connector-termination-health-async
  "Retrieves information about the last time a SIP OPTIONS ping was received from your SIP
   infrastructure for the specified Amazon Chime Voice Connector.

  get-voice-connector-termination-health-request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnectorTerminationHealth operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest get-voice-connector-termination-health-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorTerminationHealthAsync get-voice-connector-termination-health-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationHealthRequest get-voice-connector-termination-health-request]
    (-> this (.getVoiceConnectorTerminationHealthAsync get-voice-connector-termination-health-request))))

(defn put-voice-connector-termination-credentials-async
  "Adds termination SIP credentials for the specified Amazon Chime Voice Connector.

  put-voice-connector-termination-credentials-request - `com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutVoiceConnectorTerminationCredentials operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest put-voice-connector-termination-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putVoiceConnectorTerminationCredentialsAsync put-voice-connector-termination-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.PutVoiceConnectorTerminationCredentialsRequest put-voice-connector-termination-credentials-request]
    (-> this (.putVoiceConnectorTerminationCredentialsAsync put-voice-connector-termination-credentials-request))))

(defn batch-delete-phone-number-async
  "Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon
   Chime Voice Connectors before they can be deleted.


   Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.

  batch-delete-phone-number-request - `com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeletePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.BatchDeletePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest batch-delete-phone-number-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeletePhoneNumberAsync batch-delete-phone-number-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.BatchDeletePhoneNumberRequest batch-delete-phone-number-request]
    (-> this (.batchDeletePhoneNumberAsync batch-delete-phone-number-request))))

(defn create-account-async
  "Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are
   currently supported for this action. For more information about different account types, see Managing Your Amazon Chime
   Accounts in the Amazon Chime Administration Guide.

  create-account-request - `com.amazonaws.services.chime.model.CreateAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreateAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreateAccountRequest create-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccountAsync create-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreateAccountRequest create-account-request]
    (-> this (.createAccountAsync create-account-request))))

(defn regenerate-security-token-async
  "Regenerates the security token for a bot.

  regenerate-security-token-request - `com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegenerateSecurityToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.RegenerateSecurityTokenResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest regenerate-security-token-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.regenerateSecurityTokenAsync regenerate-security-token-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.RegenerateSecurityTokenRequest regenerate-security-token-request]
    (-> this (.regenerateSecurityTokenAsync regenerate-security-token-request))))

(defn update-phone-number-async
  "Updates phone number details, such as product type, for the specified phone number ID. For toll-free numbers, you
   can use only the Amazon Chime Voice Connector product type.

  update-phone-number-request - `com.amazonaws.services.chime.model.UpdatePhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdatePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdatePhoneNumberRequest update-phone-number-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePhoneNumberAsync update-phone-number-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdatePhoneNumberRequest update-phone-number-request]
    (-> this (.updatePhoneNumberAsync update-phone-number-request))))

(defn delete-voice-connector-termination-credentials-async
  "Deletes the specified SIP credentials used by your equipment to authenticate during call termination.

  delete-voice-connector-termination-credentials-request - `com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVoiceConnectorTerminationCredentials operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest delete-voice-connector-termination-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVoiceConnectorTerminationCredentialsAsync delete-voice-connector-termination-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeleteVoiceConnectorTerminationCredentialsRequest delete-voice-connector-termination-credentials-request]
    (-> this (.deleteVoiceConnectorTerminationCredentialsAsync delete-voice-connector-termination-credentials-request))))

(defn invite-users-async
  "Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team
   account. Only Team account types are currently supported for this action.

  invite-users-request - `com.amazonaws.services.chime.model.InviteUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.InviteUsersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.InviteUsersRequest invite-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteUsersAsync invite-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.InviteUsersRequest invite-users-request]
    (-> this (.inviteUsersAsync invite-users-request))))

(defn update-account-settings-async
  "Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared
   screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime
   Administration Guide.

  update-account-settings-request - `com.amazonaws.services.chime.model.UpdateAccountSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateAccountSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateAccountSettingsRequest update-account-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountSettingsAsync update-account-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateAccountSettingsRequest update-account-settings-request]
    (-> this (.updateAccountSettingsAsync update-account-settings-request))))

(defn delete-phone-number-async
  "Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any
   users or Amazon Chime Voice Connectors before it can be deleted.


   Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.

  delete-phone-number-request - `com.amazonaws.services.chime.model.DeletePhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.DeletePhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeletePhoneNumberRequest delete-phone-number-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePhoneNumberAsync delete-phone-number-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.DeletePhoneNumberRequest delete-phone-number-request]
    (-> this (.deletePhoneNumberAsync delete-phone-number-request))))

(defn get-bot-async
  "Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.

  get-bot-request - `com.amazonaws.services.chime.model.GetBotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetBotResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetBotRequest get-bot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAsync get-bot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetBotRequest get-bot-request]
    (-> this (.getBotAsync get-bot-request))))

(defn associate-phone-number-with-user-async
  "Associates a phone number with the specified Amazon Chime user.

  associate-phone-number-with-user-request - `com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociatePhoneNumberWithUser operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest associate-phone-number-with-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associatePhoneNumberWithUserAsync associate-phone-number-with-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.AssociatePhoneNumberWithUserRequest associate-phone-number-with-user-request]
    (-> this (.associatePhoneNumberWithUserAsync associate-phone-number-with-user-request))))

(defn get-events-configuration-async
  "Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint
   or Lambda function ARN.

  get-events-configuration-request - `com.amazonaws.services.chime.model.GetEventsConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventsConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetEventsConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetEventsConfigurationRequest get-events-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventsConfigurationAsync get-events-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetEventsConfigurationRequest get-events-configuration-request]
    (-> this (.getEventsConfigurationAsync get-events-configuration-request))))

(defn get-voice-connector-termination-async
  "Retrieves termination setting details for the specified Amazon Chime Voice Connector.

  get-voice-connector-termination-request - `com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnectorTermination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorTerminationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest get-voice-connector-termination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorTerminationAsync get-voice-connector-termination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorTerminationRequest get-voice-connector-termination-request]
    (-> this (.getVoiceConnectorTerminationAsync get-voice-connector-termination-request))))

(defn update-voice-connector-async
  "Updates details for the specified Amazon Chime Voice Connector.

  update-voice-connector-request - `com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateVoiceConnector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest update-voice-connector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateVoiceConnectorAsync update-voice-connector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateVoiceConnectorRequest update-voice-connector-request]
    (-> this (.updateVoiceConnectorAsync update-voice-connector-request))))

(defn associate-phone-numbers-with-voice-connector-async
  "Associates a phone number with the specified Amazon Chime Voice Connector.

  associate-phone-numbers-with-voice-connector-request - `com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnector operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest associate-phone-numbers-with-voice-connector-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associatePhoneNumbersWithVoiceConnectorAsync associate-phone-numbers-with-voice-connector-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.AssociatePhoneNumbersWithVoiceConnectorRequest associate-phone-numbers-with-voice-connector-request]
    (-> this (.associatePhoneNumbersWithVoiceConnectorAsync associate-phone-numbers-with-voice-connector-request))))

(defn list-users-async
  "Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only
   the user that the email address belongs to.

  list-users-request - `com.amazonaws.services.chime.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request))))

(defn update-account-async
  "Updates account details for the specified Amazon Chime account. Currently, only account name updates are
   supported for this action.

  update-account-request - `com.amazonaws.services.chime.model.UpdateAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateAccountResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateAccountRequest update-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountAsync update-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateAccountRequest update-account-request]
    (-> this (.updateAccountAsync update-account-request))))

(defn create-phone-number-order-async
  "Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime
   Voice Connector product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product
   type.

  create-phone-number-order-request - `com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePhoneNumberOrder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.CreatePhoneNumberOrderResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest create-phone-number-order-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPhoneNumberOrderAsync create-phone-number-order-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.CreatePhoneNumberOrderRequest create-phone-number-order-request]
    (-> this (.createPhoneNumberOrderAsync create-phone-number-order-request))))

(defn update-global-settings-async
  "Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
   Chime Voice Connector settings.

  update-global-settings-request - `com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGlobalSettings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateGlobalSettingsResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest update-global-settings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGlobalSettingsAsync update-global-settings-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateGlobalSettingsRequest update-global-settings-request]
    (-> this (.updateGlobalSettingsAsync update-global-settings-request))))

(defn update-user-async
  "Updates user details for a specified user ID. Currently, only LicenseType updates are supported for
   this action.

  update-user-request - `com.amazonaws.services.chime.model.UpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateUserRequest update-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync update-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.UpdateUserRequest update-user-request]
    (-> this (.updateUserAsync update-user-request))))

(defn get-voice-connector-origination-async
  "Retrieves origination setting details for the specified Amazon Chime Voice Connector.

  get-voice-connector-origination-request - `com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetVoiceConnectorOrigination operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.chime.model.GetVoiceConnectorOriginationResult>`"
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest get-voice-connector-origination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getVoiceConnectorOriginationAsync get-voice-connector-origination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonChimeAsync this ^com.amazonaws.services.chime.model.GetVoiceConnectorOriginationRequest get-voice-connector-origination-request]
    (-> this (.getVoiceConnectorOriginationAsync get-voice-connector-origination-request))))

