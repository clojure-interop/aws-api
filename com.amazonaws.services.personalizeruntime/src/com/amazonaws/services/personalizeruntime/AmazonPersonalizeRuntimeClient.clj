(ns com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeClient
  "Client for accessing Amazon Personalize Runtime. All service calls made using this client are blocking, and will not
  return until the service call completes."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.personalizeruntime AmazonPersonalizeRuntimeClient]))

(defn *builder
  "returns: `com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeClientBuilder`"
  (^com.amazonaws.services.personalizeruntime.AmazonPersonalizeRuntimeClientBuilder []
    (AmazonPersonalizeRuntimeClient/builder )))

(defn get-personalized-ranking
  "Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely
   item to be of interest to the user.



   The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING.

  request - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest`

  returns: Result of the GetPersonalizedRanking operation returned by the service. - `com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult`

  throws: com.amazonaws.services.personalizeruntime.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingResult [^AmazonPersonalizeRuntimeClient this ^com.amazonaws.services.personalizeruntime.model.GetPersonalizedRankingRequest request]
    (-> this (.getPersonalizedRanking request))))

(defn get-recommendations
  "Returns a list of recommended items. The required input depends on the recipe type used to create the solution
   backing the campaign, as follows:




   RELATED_ITEMS - itemId required, userId not used




   USER_PERSONALIZATION - itemId optional, userId required





   Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API.

  request - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest`

  returns: Result of the GetRecommendations operation returned by the service. - `com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult`

  throws: com.amazonaws.services.personalizeruntime.model.InvalidInputException - Provide a valid value for the field or parameter."
  (^com.amazonaws.services.personalizeruntime.model.GetRecommendationsResult [^AmazonPersonalizeRuntimeClient this ^com.amazonaws.services.personalizeruntime.model.GetRecommendationsRequest request]
    (-> this (.getRecommendations request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPersonalizeRuntimeClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

