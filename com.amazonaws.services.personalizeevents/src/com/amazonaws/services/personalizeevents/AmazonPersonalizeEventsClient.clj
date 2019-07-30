(ns com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsClient
  "Client for accessing Amazon Personalize Events. All service calls made using this client are blocking, and will not
  return until the service call completes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeevents AmazonPersonalizeEventsClient]))

(defn *builder
  "returns: `com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsClientBuilder`"
  (^com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsClientBuilder []
    (AmazonPersonalizeEventsClient/builder )))

(defn put-events
  "Records user interaction event data.

  request - `com.amazonaws.services.personalizeevents.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.personalizeevents.model.PutEventsResult`

  throws: com.amazonaws.services.personalizeevents.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalizeevents.model.PutEventsResult [^AmazonPersonalizeEventsClient this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest request]
    (-> this (.putEvents request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPersonalizeEventsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

