(ns com.amazonaws.services.personalizeevents.AbstractAmazonPersonalizeEvents
  "Abstract implementation of AmazonPersonalizeEvents. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeevents AbstractAmazonPersonalizeEvents]))

(defn put-events
  "Description copied from interface: AmazonPersonalizeEvents

  request - `com.amazonaws.services.personalizeevents.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.personalizeevents.model.PutEventsResult`"
  (^com.amazonaws.services.personalizeevents.model.PutEventsResult [^AbstractAmazonPersonalizeEvents this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest request]
    (-> this (.putEvents request))))

(defn shutdown
  "Description copied from interface: AmazonPersonalizeEvents"
  ([^AbstractAmazonPersonalizeEvents this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonPersonalizeEvents

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonPersonalizeEvents this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

