(ns com.amazonaws.services.personalizeevents.AmazonPersonalizeEvents
  "Interface for accessing Amazon Personalize Events.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPersonalizeEvents instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeevents AmazonPersonalizeEvents]))

(defn put-events
  "Records user interaction event data.

  put-events-request - `com.amazonaws.services.personalizeevents.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.personalizeevents.model.PutEventsResult`

  throws: com.amazonaws.services.personalizeevents.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalizeevents.model.PutEventsResult [^AmazonPersonalizeEvents this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest put-events-request]
    (-> this (.putEvents put-events-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonPersonalizeEvents this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPersonalizeEvents this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

