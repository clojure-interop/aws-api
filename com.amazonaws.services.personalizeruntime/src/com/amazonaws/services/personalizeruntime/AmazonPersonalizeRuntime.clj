(ns com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntime
  "Interface for accessing Amazon Personalize Runtime.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPersonalizeRuntime instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeruntime AmazonPersonalizeRuntime]))

(defn get-personalized-ranking
  "Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely
   item to be of interest to the user.



   The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING.

  get-personalized-ranking-request - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest`

  returns: Result of the GetPersonalizedRanking operation returned by the service. - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult`

  throws: com.amazonaws.services.personalizeruntime.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult [^AmazonPersonalizeRuntime this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest get-personalized-ranking-request]
    (-> this (.getPersonalizedRanking get-personalized-ranking-request))))

(defn get-recommendations
  "Returns a list of recommended items. The required input depends on the recipe type used to create the solution
   backing the campaign, as follows:




   RELATED_ITEMS - itemId required, userId not used




   USER_PERSONALIZATION - itemId optional, userId required





   Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API.

  get-recommendations-request - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest`

  returns: Result of the GetRecommendations operation returned by the service. - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult`

  throws: com.amazonaws.services.personalizeruntime.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult [^AmazonPersonalizeRuntime this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest get-recommendations-request]
    (-> this (.getRecommendations get-recommendations-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonPersonalizeRuntime this]
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
  (^com.amazonaws.ResponseMetadata [^AmazonPersonalizeRuntime this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

