(ns com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoice
  "Interface for accessing Pinpoint SMS Voice.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPinpointSMSVoice instead.


  Pinpoint SMS and Voice Messaging public facing APIs"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointsmsvoice AmazonPinpointSMSVoice]))

(defn list-configuration-sets
  "List all of the configuration sets associated with your Amazon Pinpoint account in the current region.

  list-configuration-sets-request - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest`

  returns: Result of the ListConfigurationSets operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.TooManyRequestsException - TooManyRequestsException"
  (^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest list-configuration-sets-request]
    (-> this (.listConfigurationSets list-configuration-sets-request))))

(defn get-configuration-set-event-destinations
  "Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name
   (ARN) of the destination, and the name of the event destination.

  get-configuration-set-event-destinations-request - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest`

  returns: Result of the GetConfigurationSetEventDestinations operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest get-configuration-set-event-destinations-request]
    (-> this (.getConfigurationSetEventDestinations get-configuration-set-event-destinations-request))))

(defn create-configuration-set-event-destination
  "Create a new event destination in a configuration set.

  create-configuration-set-event-destination-request - Create a new event destination in a configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest`

  returns: Result of the CreateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.BadRequestException - BadRequestException"
  (^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest create-configuration-set-event-destination-request]
    (-> this (.createConfigurationSetEventDestination create-configuration-set-event-destination-request))))

(defn send-voice-message
  "Create a new voice message and send it to a recipient's phone number.

  send-voice-message-request - SendVoiceMessageRequest - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest`

  returns: Result of the SendVoiceMessage operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.TooManyRequestsException - TooManyRequestsException"
  (^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest send-voice-message-request]
    (-> this (.sendVoiceMessage send-voice-message-request))))

(defn delete-configuration-set-event-destination
  "Deletes an event destination in a configuration set.

  delete-configuration-set-event-destination-request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest`

  returns: Result of the DeleteConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest delete-configuration-set-event-destination-request]
    (-> this (.deleteConfigurationSetEventDestination delete-configuration-set-event-destination-request))))

(defn delete-configuration-set
  "Deletes an existing configuration set.

  delete-configuration-set-request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest`

  returns: Result of the DeleteConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest delete-configuration-set-request]
    (-> this (.deleteConfigurationSet delete-configuration-set-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonPinpointSMSVoice this]
    (-> this (.shutdown))))

(defn update-configuration-set-event-destination
  "Update an event destination in a configuration set. An event destination is a location that you publish
   information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when
   a call fails.

  update-configuration-set-event-destination-request - UpdateConfigurationSetEventDestinationRequest - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest`

  returns: Result of the UpdateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest update-configuration-set-event-destination-request]
    (-> this (.updateConfigurationSetEventDestination update-configuration-set-event-destination-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPinpointSMSVoice this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-configuration-set
  "Create a new configuration set. After you create the configuration set, you can add one or more event
   destinations to it.

  create-configuration-set-request - A request to create a new configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest`

  returns: Result of the CreateConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.TooManyRequestsException - TooManyRequestsException"
  (^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult [^AmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest create-configuration-set-request]
    (-> this (.createConfigurationSet create-configuration-set-request))))

