(ns com.amazonaws.services.personalizeevents.AbstractAmazonPersonalizeEventsAsync
  "Abstract implementation of AmazonPersonalizeEventsAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeevents AbstractAmazonPersonalizeEventsAsync]))

(defn put-events-async
  "Description copied from interface: AmazonPersonalizeEventsAsync

  request - `com.amazonaws.services.personalizeevents.model.PutEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeevents.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeEventsAsync this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeEventsAsync this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest request]
    (-> this (.putEventsAsync request))))

