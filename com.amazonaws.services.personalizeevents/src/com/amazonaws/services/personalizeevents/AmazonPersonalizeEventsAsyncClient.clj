(ns com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsAsyncClient
  "Client for accessing Amazon Personalize Events asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeevents AmazonPersonalizeEventsAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsAsyncClientBuilder`"
  (^com.amazonaws.services.personalizeevents.AmazonPersonalizeEventsAsyncClientBuilder []
    (AmazonPersonalizeEventsAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonPersonalizeEventsAsyncClient this]
    (-> this (.getExecutorService))))

(defn put-events-async
  "Description copied from interface: AmazonPersonalizeEventsAsync

  request - `com.amazonaws.services.personalizeevents.model.PutEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeevents.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeEventsAsyncClient this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeEventsAsyncClient this ^com.amazonaws.services.personalizeevents.model.PutEventsRequest request]
    (-> this (.putEventsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonPersonalizeEventsAsyncClient this]
    (-> this (.shutdown))))

