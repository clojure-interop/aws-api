(ns com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsAsync
  "Interface for accessing Amazon Personalize Events asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPersonalizeEventsAsync instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeevents AmazonPersonalizeEventsAsync]))

(defn put-events-async
  "Records user interaction event data.

  put-events-request - `com.amazonaws.services.personalizeevents.model.PutEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeevents.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeEventsAsync this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest put-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync put-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeEventsAsync this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest put-events-request]
    (-> this (.putEventsAsync put-events-request))))

