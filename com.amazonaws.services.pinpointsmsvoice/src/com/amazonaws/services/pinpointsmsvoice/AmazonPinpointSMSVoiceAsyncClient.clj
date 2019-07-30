(ns com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceAsyncClient
  "Client for accessing Pinpoint SMS Voice asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Pinpoint SMS and Voice Messaging public facing APIs"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointsmsvoice AmazonPinpointSMSVoiceAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceAsyncClientBuilder`"
  (^com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceAsyncClientBuilder []
    (AmazonPinpointSMSVoiceAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonPinpointSMSVoiceAsyncClient this]
    (-> this (.getExecutorService))))

(defn list-configuration-sets-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSetsAsync request))))

(defn update-configuration-set-event-destination-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - UpdateConfigurationSetEventDestinationRequest - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestinationAsync request))))

(defn get-configuration-set-event-destinations-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfigurationSetEventDestinations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigurationSetEventDestinationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest request]
    (-> this (.getConfigurationSetEventDestinationsAsync request))))

(defn send-voice-message-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - SendVoiceMessageRequest - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendVoiceMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendVoiceMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest request]
    (-> this (.sendVoiceMessageAsync request))))

(defn create-configuration-set-event-destination-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - Create a new event destination in a configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestinationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonPinpointSMSVoiceAsyncClient this]
    (-> this (.shutdown))))

(defn create-configuration-set-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - A request to create a new configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSetAsync request))))

(defn delete-configuration-set-event-destination-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestinationAsync request))))

(defn delete-configuration-set-async
  "Description copied from interface: AmazonPinpointSMSVoiceAsync

  request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsyncClient this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSetAsync request))))

