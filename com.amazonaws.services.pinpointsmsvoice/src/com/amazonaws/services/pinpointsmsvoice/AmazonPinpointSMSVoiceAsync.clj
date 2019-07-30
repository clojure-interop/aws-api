(ns com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceAsync
  "Interface for accessing Pinpoint SMS Voice asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPinpointSMSVoiceAsync instead.


  Pinpoint SMS and Voice Messaging public facing APIs"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointsmsvoice AmazonPinpointSMSVoiceAsync]))

(defn create-configuration-set-async
  "Create a new configuration set. After you create the configuration set, you can add one or more event
   destinations to it.

  create-configuration-set-request - A request to create a new configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest create-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetAsync create-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest create-configuration-set-request]
    (-> this (.createConfigurationSetAsync create-configuration-set-request))))

(defn create-configuration-set-event-destination-async
  "Create a new event destination in a configuration set.

  create-configuration-set-event-destination-request - Create a new event destination in a configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest create-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetEventDestinationAsync create-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest create-configuration-set-event-destination-request]
    (-> this (.createConfigurationSetEventDestinationAsync create-configuration-set-event-destination-request))))

(defn delete-configuration-set-async
  "Deletes an existing configuration set.

  delete-configuration-set-request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest delete-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetAsync delete-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest delete-configuration-set-request]
    (-> this (.deleteConfigurationSetAsync delete-configuration-set-request))))

(defn delete-configuration-set-event-destination-async
  "Deletes an event destination in a configuration set.

  delete-configuration-set-event-destination-request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest delete-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetEventDestinationAsync delete-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest delete-configuration-set-event-destination-request]
    (-> this (.deleteConfigurationSetEventDestinationAsync delete-configuration-set-event-destination-request))))

(defn get-configuration-set-event-destinations-async
  "Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name
   (ARN) of the destination, and the name of the event destination.

  get-configuration-set-event-destinations-request - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfigurationSetEventDestinations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest get-configuration-set-event-destinations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigurationSetEventDestinationsAsync get-configuration-set-event-destinations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest get-configuration-set-event-destinations-request]
    (-> this (.getConfigurationSetEventDestinationsAsync get-configuration-set-event-destinations-request))))

(defn list-configuration-sets-async
  "List all of the configuration sets associated with your Amazon Pinpoint account in the current region.

  list-configuration-sets-request - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest list-configuration-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationSetsAsync list-configuration-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest list-configuration-sets-request]
    (-> this (.listConfigurationSetsAsync list-configuration-sets-request))))

(defn send-voice-message-async
  "Create a new voice message and send it to a recipient's phone number.

  send-voice-message-request - SendVoiceMessageRequest - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendVoiceMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest send-voice-message-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendVoiceMessageAsync send-voice-message-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest send-voice-message-request]
    (-> this (.sendVoiceMessageAsync send-voice-message-request))))

(defn update-configuration-set-event-destination-async
  "Update an event destination in a configuration set. An event destination is a location that you publish
   information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when
   a call fails.

  update-configuration-set-event-destination-request - UpdateConfigurationSetEventDestinationRequest - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest update-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetEventDestinationAsync update-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointSMSVoiceAsync this ^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest update-configuration-set-event-destination-request]
    (-> this (.updateConfigurationSetEventDestinationAsync update-configuration-set-event-destination-request))))

