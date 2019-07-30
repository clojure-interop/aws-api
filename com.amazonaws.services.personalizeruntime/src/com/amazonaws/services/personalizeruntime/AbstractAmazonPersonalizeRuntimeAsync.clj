(ns com.amazonaws.services.personalizeruntime.AbstractAmazonPersonalizeRuntimeAsync
  "Abstract implementation of AmazonPersonalizeRuntimeAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeruntime AbstractAmazonPersonalizeRuntimeAsync]))

(defn get-personalized-ranking-async
  "Description copied from interface: AmazonPersonalizeRuntimeAsync

  request - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPersonalizedRanking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPersonalizedRankingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest request]
    (-> this (.getPersonalizedRankingAsync request))))

(defn get-recommendations-async
  "Description copied from interface: AmazonPersonalizeRuntimeAsync

  request - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRecommendations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRecommendationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPersonalizeRuntimeAsync this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest request]
    (-> this (.getRecommendationsAsync request))))

