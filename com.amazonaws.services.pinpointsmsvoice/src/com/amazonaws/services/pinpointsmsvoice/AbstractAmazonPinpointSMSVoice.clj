(ns com.amazonaws.services.pinpointsmsvoice.AbstractAmazonPinpointSMSVoice
  "Abstract implementation of AmazonPinpointSMSVoice. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointsmsvoice AbstractAmazonPinpointSMSVoice]))

(defn list-configuration-sets
  "Description copied from interface: AmazonPinpointSMSVoice

  request - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest`

  returns: Result of the ListConfigurationSets operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSets request))))

(defn get-configuration-set-event-destinations
  "Description copied from interface: AmazonPinpointSMSVoice

  request - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest`

  returns: Result of the GetConfigurationSetEventDestinations operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.GetConfigurationSetEventDestinationsRequest request]
    (-> this (.getConfigurationSetEventDestinations request))))

(defn create-configuration-set-event-destination
  "Description copied from interface: AmazonPinpointSMSVoice

  request - Create a new event destination in a configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest`

  returns: Result of the CreateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestination request))))

(defn send-voice-message
  "Description copied from interface: AmazonPinpointSMSVoice

  request - SendVoiceMessageRequest - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest`

  returns: Result of the SendVoiceMessage operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.SendVoiceMessageRequest request]
    (-> this (.sendVoiceMessage request))))

(defn delete-configuration-set-event-destination
  "Description copied from interface: AmazonPinpointSMSVoice

  request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest`

  returns: Result of the DeleteConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestination request))))

(defn delete-configuration-set
  "Description copied from interface: AmazonPinpointSMSVoice

  request - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest`

  returns: Result of the DeleteConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSet request))))

(defn shutdown
  "Description copied from interface: AmazonPinpointSMSVoice"
  ([^AbstractAmazonPinpointSMSVoice this]
    (-> this (.shutdown))))

(defn update-configuration-set-event-destination
  "Description copied from interface: AmazonPinpointSMSVoice

  request - UpdateConfigurationSetEventDestinationRequest - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest`

  returns: Result of the UpdateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestination request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonPinpointSMSVoice

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-configuration-set
  "Description copied from interface: AmazonPinpointSMSVoice

  request - A request to create a new configuration set. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest`

  returns: Result of the CreateConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult`"
  (^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetResult [^AbstractAmazonPinpointSMSVoice this ^com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSet request))))

