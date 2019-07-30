(ns com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeAsync
  "Interface for accessing Amazon Personalize Runtime asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPersonalizeRuntimeAsync instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeruntime AmazonPersonalizeRuntimeAsync]))

(defn get-personalized-ranking-async
  "Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely
   item to be of interest to the user.



   The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING.

  get-personalized-ranking-request - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPersonalizedRanking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest get-personalized-ranking-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPersonalizedRankingAsync get-personalized-ranking-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest get-personalized-ranking-request]
    (-> this (.getPersonalizedRankingAsync get-personalized-ranking-request))))

(defn get-recommendations-async
  "Returns a list of recommended items. The required input depends on the recipe type used to create the solution
   backing the campaign, as follows:




   RELATED_ITEMS - itemId required, userId not used




   USER_PERSONALIZATION - itemId optional, userId required





   Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API.

  get-recommendations-request - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecommendations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult>`"
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest get-recommendations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecommendationsAsync get-recommendations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest get-recommendations-request]
    (-> this (.getRecommendationsAsync get-recommendations-request))))

