(ns com.amazonaws.services.cloudtrail.AbstractAWSCloudTrailAsync
  "Abstract implementation of AWSCloudTrailAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudtrail AbstractAWSCloudTrailAsync]))

(defn update-trail-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Specifies settings to update for the trail. - `com.amazonaws.services.cloudtrail.model.UpdateTrailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.UpdateTrailResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.UpdateTrailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.UpdateTrailRequest request]
    (-> this (.updateTrailAsync request))))

(defn list-tags-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Specifies a list of trail tags to return. - `com.amazonaws.services.cloudtrail.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn describe-trails-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Returns information about the trail. - `com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.DescribeTrailsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest request]
    (-> this (.describeTrailsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this]
    (-> this (.describeTrailsAsync))))

(defn lookup-events-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Contains a request for LookupEvents. - `com.amazonaws.services.cloudtrail.model.LookupEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LookupEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.LookupEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.LookupEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.lookupEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.LookupEventsRequest request]
    (-> this (.lookupEventsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this]
    (-> this (.lookupEventsAsync))))

(defn get-trail-status-async
  "Description copied from interface: AWSCloudTrailAsync

  request - The name of a trail about which you want the current status. - `com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrailStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.GetTrailStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrailStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest request]
    (-> this (.getTrailStatusAsync request))))

(defn create-trail-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Specifies the settings for each trail. - `com.amazonaws.services.cloudtrail.model.CreateTrailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.CreateTrailResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.CreateTrailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.CreateTrailRequest request]
    (-> this (.createTrailAsync request))))

(defn start-logging-async
  "Description copied from interface: AWSCloudTrailAsync

  request - The request to CloudTrail to start logging AWS API calls for an account. - `com.amazonaws.services.cloudtrail.model.StartLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.StartLoggingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StartLoggingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startLoggingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StartLoggingRequest request]
    (-> this (.startLoggingAsync request))))

(defn delete-trail-async
  "Description copied from interface: AWSCloudTrailAsync

  request - The request that specifies the name of a trail to delete. - `com.amazonaws.services.cloudtrail.model.DeleteTrailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.DeleteTrailResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DeleteTrailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DeleteTrailRequest request]
    (-> this (.deleteTrailAsync request))))

(defn remove-tags-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Specifies the tags to remove from a trail. - `com.amazonaws.services.cloudtrail.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.RemoveTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.RemoveTagsRequest request]
    (-> this (.removeTagsAsync request))))

(defn list-public-keys-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Requests the public keys for a specified time range. - `com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPublicKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.ListPublicKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPublicKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest request]
    (-> this (.listPublicKeysAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this]
    (-> this (.listPublicKeysAsync))))

(defn put-event-selectors-async
  "Description copied from interface: AWSCloudTrailAsync

  request - `com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEventSelectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.PutEventSelectorsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventSelectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest request]
    (-> this (.putEventSelectorsAsync request))))

(defn stop-logging-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Passes the request to CloudTrail to stop logging AWS API calls for the specified account. - `com.amazonaws.services.cloudtrail.model.StopLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.StopLoggingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StopLoggingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopLoggingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StopLoggingRequest request]
    (-> this (.stopLoggingAsync request))))

(defn get-event-selectors-async
  "Description copied from interface: AWSCloudTrailAsync

  request - `com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventSelectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.GetEventSelectorsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventSelectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest request]
    (-> this (.getEventSelectorsAsync request))))

(defn add-tags-async
  "Description copied from interface: AWSCloudTrailAsync

  request - Specifies the tags to add to a trail. - `com.amazonaws.services.cloudtrail.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

