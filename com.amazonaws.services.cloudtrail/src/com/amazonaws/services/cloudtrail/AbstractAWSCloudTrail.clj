(ns com.amazonaws.services.cloudtrail.AbstractAWSCloudTrail
  "Abstract implementation of AWSCloudTrail. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudtrail AbstractAWSCloudTrail]))

(defn add-tags
  "Description copied from interface: AWSCloudTrail

  request - Specifies the tags to add to a trail. - `com.amazonaws.services.cloudtrail.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.cloudtrail.model.AddTagsResult`"
  (^com.amazonaws.services.cloudtrail.model.AddTagsResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn start-logging
  "Description copied from interface: AWSCloudTrail

  request - The request to CloudTrail to start logging AWS API calls for an account. - `com.amazonaws.services.cloudtrail.model.StartLoggingRequest`

  returns: Result of the StartLogging operation returned by the service. - `com.amazonaws.services.cloudtrail.model.StartLoggingResult`"
  (^com.amazonaws.services.cloudtrail.model.StartLoggingResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.StartLoggingRequest request]
    (-> this (.startLogging request))))

(defn set-region
  "Description copied from interface: AWSCloudTrail

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCloudTrail this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn lookup-events
  "Description copied from interface: AWSCloudTrail

  request - Contains a request for LookupEvents. - `com.amazonaws.services.cloudtrail.model.LookupEventsRequest`

  returns: Result of the LookupEvents operation returned by the service. - `com.amazonaws.services.cloudtrail.model.LookupEventsResult`"
  (^com.amazonaws.services.cloudtrail.model.LookupEventsResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.LookupEventsRequest request]
    (-> this (.lookupEvents request)))
  (^com.amazonaws.services.cloudtrail.model.LookupEventsResult [^AbstractAWSCloudTrail this]
    (-> this (.lookupEvents))))

(defn list-tags
  "Description copied from interface: AWSCloudTrail

  request - Specifies a list of trail tags to return. - `com.amazonaws.services.cloudtrail.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.cloudtrail.model.ListTagsResult`"
  (^com.amazonaws.services.cloudtrail.model.ListTagsResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn update-trail
  "Description copied from interface: AWSCloudTrail

  request - Specifies settings to update for the trail. - `com.amazonaws.services.cloudtrail.model.UpdateTrailRequest`

  returns: Result of the UpdateTrail operation returned by the service. - `com.amazonaws.services.cloudtrail.model.UpdateTrailResult`"
  (^com.amazonaws.services.cloudtrail.model.UpdateTrailResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.UpdateTrailRequest request]
    (-> this (.updateTrail request))))

(defn remove-tags
  "Description copied from interface: AWSCloudTrail

  request - Specifies the tags to remove from a trail. - `com.amazonaws.services.cloudtrail.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.cloudtrail.model.RemoveTagsResult`"
  (^com.amazonaws.services.cloudtrail.model.RemoveTagsResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn create-trail
  "Description copied from interface: AWSCloudTrail

  request - Specifies the settings for each trail. - `com.amazonaws.services.cloudtrail.model.CreateTrailRequest`

  returns: Result of the CreateTrail operation returned by the service. - `com.amazonaws.services.cloudtrail.model.CreateTrailResult`"
  (^com.amazonaws.services.cloudtrail.model.CreateTrailResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.CreateTrailRequest request]
    (-> this (.createTrail request))))

(defn get-trail-status
  "Description copied from interface: AWSCloudTrail

  request - The name of a trail about which you want the current status. - `com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest`

  returns: Result of the GetTrailStatus operation returned by the service. - `com.amazonaws.services.cloudtrail.model.GetTrailStatusResult`"
  (^com.amazonaws.services.cloudtrail.model.GetTrailStatusResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest request]
    (-> this (.getTrailStatus request))))

(defn list-public-keys
  "Description copied from interface: AWSCloudTrail

  request - Requests the public keys for a specified time range. - `com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest`

  returns: Result of the ListPublicKeys operation returned by the service. - `com.amazonaws.services.cloudtrail.model.ListPublicKeysResult`"
  (^com.amazonaws.services.cloudtrail.model.ListPublicKeysResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest request]
    (-> this (.listPublicKeys request)))
  (^com.amazonaws.services.cloudtrail.model.ListPublicKeysResult [^AbstractAWSCloudTrail this]
    (-> this (.listPublicKeys))))

(defn shutdown
  "Description copied from interface: AWSCloudTrail"
  ([^AbstractAWSCloudTrail this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AWSCloudTrail

  endpoint - The endpoint (ex: \"cloudtrail.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"cloudtrail.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCloudTrail this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn put-event-selectors
  "Description copied from interface: AWSCloudTrail

  request - `com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest`

  returns: Result of the PutEventSelectors operation returned by the service. - `com.amazonaws.services.cloudtrail.model.PutEventSelectorsResult`"
  (^com.amazonaws.services.cloudtrail.model.PutEventSelectorsResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest request]
    (-> this (.putEventSelectors request))))

(defn describe-trails
  "Description copied from interface: AWSCloudTrail

  request - Returns information about the trail. - `com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest`

  returns: Result of the DescribeTrails operation returned by the service. - `com.amazonaws.services.cloudtrail.model.DescribeTrailsResult`"
  (^com.amazonaws.services.cloudtrail.model.DescribeTrailsResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest request]
    (-> this (.describeTrails request)))
  (^com.amazonaws.services.cloudtrail.model.DescribeTrailsResult [^AbstractAWSCloudTrail this]
    (-> this (.describeTrails))))

(defn stop-logging
  "Description copied from interface: AWSCloudTrail

  request - Passes the request to CloudTrail to stop logging AWS API calls for the specified account. - `com.amazonaws.services.cloudtrail.model.StopLoggingRequest`

  returns: Result of the StopLogging operation returned by the service. - `com.amazonaws.services.cloudtrail.model.StopLoggingResult`"
  (^com.amazonaws.services.cloudtrail.model.StopLoggingResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.StopLoggingRequest request]
    (-> this (.stopLogging request))))

(defn get-event-selectors
  "Description copied from interface: AWSCloudTrail

  request - `com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest`

  returns: Result of the GetEventSelectors operation returned by the service. - `com.amazonaws.services.cloudtrail.model.GetEventSelectorsResult`"
  (^com.amazonaws.services.cloudtrail.model.GetEventSelectorsResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest request]
    (-> this (.getEventSelectors request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCloudTrail

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCloudTrail this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-trail
  "Description copied from interface: AWSCloudTrail

  request - The request that specifies the name of a trail to delete. - `com.amazonaws.services.cloudtrail.model.DeleteTrailRequest`

  returns: Result of the DeleteTrail operation returned by the service. - `com.amazonaws.services.cloudtrail.model.DeleteTrailResult`"
  (^com.amazonaws.services.cloudtrail.model.DeleteTrailResult [^AbstractAWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.DeleteTrailRequest request]
    (-> this (.deleteTrail request))))

