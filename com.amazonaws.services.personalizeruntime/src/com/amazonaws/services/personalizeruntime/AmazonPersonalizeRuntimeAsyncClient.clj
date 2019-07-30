(ns com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeAsyncClient
  "Client for accessing Amazon Personalize Runtime asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeruntime AmazonPersonalizeRuntimeAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeAsyncClientBuilder`"
  (^com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeAsyncClientBuilder []
    (AmazonPersonalizeRuntimeAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonPersonalizeRuntimeAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-personalized-ranking-async
  "Description copied from interface: AmazonPersonalizeRuntimeAsync

  request - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPersonalizedRanking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsyncClient this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPersonalizedRankingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsyncClient this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest request]
    (-> this (.getPersonalizedRankingAsync request))))

(defn get-recommendations-async
  "Description copied from interface: AmazonPersonalizeRuntimeAsync

  request - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecommendations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsyncClient this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecommendationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsyncClient this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest request]
    (-> this (.getRecommendationsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonPersonalizeRuntimeAsyncClient this]
    (-> this (.shutdown))))

