(ns com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceClient
  "Client for accessing Pinpoint SMS Voice. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Pinpoint SMS and Voice Messaging public facing APIs"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointsmsvoice AmazonPinpointSMSVoiceClient]))

(defn *builder
  "returns: `com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceClientBuilder`"
  (^com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceClientBuilder []
    (AmazonPinpointSMSVoiceClient/builder )))

(defn list-configuration-sets
  "List all of the configuration sets associated with your Amazon Pinpoint account in the current region.

  request - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest`

  returns: Result of the ListConfigurationSets operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.TooManyRequestsException - TooManyRequestsException"
  (^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSets request))))

(defn get-configuration-set-event-destinations
  "Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name
   (ARN) of the destination, and the name of the event destination.

  request - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest`

  returns: Result of the GetConfigurationSetEventDestinations operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest request]
    (-> this (.getConfigurationSetEventDestinations request))))

(defn create-configuration-set-event-destination
  "Create a new event destination in a configuration set.

  request - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest`

  returns: Result of the CreateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.BadRequestException - BadRequestException"
  (^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestination request))))

(defn send-voice-message
  "Create a new voice message and send it to a recipient's phone number.

  request - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest`

  returns: Result of the SendVoiceMessage operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.TooManyRequestsException - TooManyRequestsException"
  (^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest request]
    (-> this (.sendVoiceMessage request))))

(defn delete-configuration-set-event-destination
  "Deletes an event destination in a configuration set.

  request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest`

  returns: Result of the DeleteConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestination request))))

(defn delete-configuration-set
  "Deletes an existing configuration set.

  request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest`

  returns: Result of the DeleteConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSet request))))

(defn update-configuration-set-event-destination
  "Update an event destination in a configuration set. An event destination is a location that you publish
   information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when
   a call fails.

  request - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest`

  returns: Result of the UpdateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.NotFoundException - NotFoundException"
  (^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestination request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-configuration-set
  "Create a new configuration set. After you create the configuration set, you can add one or more event
   destinations to it.

  request - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest`

  returns: Result of the CreateConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult`

  throws: com.amazonaws.services.pinpointsmsvoice.model.TooManyRequestsException - TooManyRequestsException"
  (^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult [^AmazonPinpointSMSVoiceClient this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSet request))))

