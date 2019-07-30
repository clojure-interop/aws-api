(ns com.amazonaws.services.personalizeruntime.AbstractAmazonPersonalizeRuntime
  "Abstract implementation of AmazonPersonalizeRuntime. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeruntime AbstractAmazonPersonalizeRuntime]))

(defn get-personalized-ranking
  "Description copied from interface: AmazonPersonalizeRuntime

  request - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest`

  returns: Result of the GetPersonalizedRanking operation returned by the service. - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult`"
  (^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult [^AbstractAmazonPersonalizeRuntime this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest request]
    (-> this (.getPersonalizedRanking request))))

(defn get-recommendations
  "Description copied from interface: AmazonPersonalizeRuntime

  request - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest`

  returns: Result of the GetRecommendations operation returned by the service. - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult`"
  (^com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult [^AbstractAmazonPersonalizeRuntime this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest request]
    (-> this (.getRecommendations request))))

(defn shutdown
  "Description copied from interface: AmazonPersonalizeRuntime"
  ([^AbstractAmazonPersonalizeRuntime this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonPersonalizeRuntime

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonPersonalizeRuntime this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

