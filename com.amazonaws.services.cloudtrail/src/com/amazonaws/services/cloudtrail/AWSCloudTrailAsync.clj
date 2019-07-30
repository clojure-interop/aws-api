(ns com.amazonaws.services.cloudtrail.AWSCloudTrailAsync
  "Interface for accessing CloudTrail asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCloudTrailAsync instead.


  AWS CloudTrail

  This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common
  errors for CloudTrail.


  CloudTrail is a web service that records AWS API calls for your AWS account and delivers log files to an Amazon S3
  bucket. The recorded information includes the identity of the user, the start time of the AWS API call, the source IP
  address, the request parameters, and the response elements returned by the service.



  As an alternative to the API, you can use one of the AWS SDKs, which consist of libraries and sample code for various
  programming languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to
  create programmatic access to AWSCloudTrail. For example, the SDKs take care of cryptographically signing requests,
  managing errors, and retrying requests automatically. For information about the AWS SDKs, including how to download
  and install them, see the Tools for Amazon Web Services page.



  See the AWS CloudTrail
  User Guide for information about the data that is included with each AWS API call listed in the log files."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudtrail AWSCloudTrailAsync]))

(defn update-trail-async
  "Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the
   CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has
   previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail
   must be called from the region in which the trail was created; otherwise, an
   InvalidHomeRegionException is thrown.

  update-trail-request - Specifies settings to update for the trail. - `com.amazonaws.services.cloudtrail.model.UpdateTrailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTrail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.UpdateTrailResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.UpdateTrailRequest update-trail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTrailAsync update-trail-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.UpdateTrailRequest update-trail-request]
    (-> this (.updateTrailAsync update-trail-request))))

(defn list-tags-async
  "Lists the tags for the trail in the current region.

  list-tags-request - Specifies a list of trail tags to return. - `com.amazonaws.services.cloudtrail.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn describe-trails-async
  "Retrieves settings for the trail associated with the current region for your account.

  describe-trails-request - Returns information about the trail. - `com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.DescribeTrailsResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest describe-trails-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrailsAsync describe-trails-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest describe-trails-request]
    (-> this (.describeTrailsAsync describe-trails-request)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this]
    (-> this (.describeTrailsAsync))))

(defn lookup-events-async
  "Looks up management events captured by CloudTrail. Events for a region can be looked up in that region during the
   last 90 days. Lookup supports the following attributes:




   AWS access key




   Event ID




   Event name




   Event source




   Read only




   Resource name




   Resource type




   User name




   All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The
   response includes a token that you can use to get the next page of results.



   The rate of lookup requests is limited to one per second per account. If this limit is exceeded, a throttling
   error occurs.



   Events that occurred during the selected time range will not be available for lookup if CloudTrail logging was
   not enabled when the events occurred.

  lookup-events-request - Contains a request for LookupEvents. - `com.amazonaws.services.cloudtrail.model.LookupEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LookupEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.LookupEventsResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.LookupEventsRequest lookup-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.lookupEventsAsync lookup-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.LookupEventsRequest lookup-events-request]
    (-> this (.lookupEventsAsync lookup-events-request)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this]
    (-> this (.lookupEventsAsync))))

(defn get-trail-status-async
  "Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery
   errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns
   trail status from a single region. To return trail status from all regions, you must call the operation on each
   region.

  get-trail-status-request - The name of a trail about which you want the current status. - `com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTrailStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.GetTrailStatusResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest get-trail-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTrailStatusAsync get-trail-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest get-trail-status-request]
    (-> this (.getTrailStatusAsync get-trail-status-request))))

(defn create-trail-async
  "Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five
   trails can exist in a region, irrespective of the region in which they were created.

  create-trail-request - Specifies the settings for each trail. - `com.amazonaws.services.cloudtrail.model.CreateTrailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.CreateTrailResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.CreateTrailRequest create-trail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrailAsync create-trail-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.CreateTrailRequest create-trail-request]
    (-> this (.createTrailAsync create-trail-request))))

(defn start-logging-async
  "Starts the recording of AWS API calls and log file delivery for a trail. For a trail that is enabled in all
   regions, this operation must be called from the region in which the trail was created. This operation cannot be
   called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.

  start-logging-request - The request to CloudTrail to start logging AWS API calls for an account. - `com.amazonaws.services.cloudtrail.model.StartLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.StartLoggingResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StartLoggingRequest start-logging-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startLoggingAsync start-logging-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StartLoggingRequest start-logging-request]
    (-> this (.startLoggingAsync start-logging-request))))

(defn delete-trail-async
  "Deletes a trail. This operation must be called from the region in which the trail was created.
   DeleteTrail cannot be called on the shadow trails (replicated trails in other regions) of a trail
   that is enabled in all regions.

  delete-trail-request - The request that specifies the name of a trail to delete. - `com.amazonaws.services.cloudtrail.model.DeleteTrailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.DeleteTrailResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DeleteTrailRequest delete-trail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrailAsync delete-trail-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.DeleteTrailRequest delete-trail-request]
    (-> this (.deleteTrailAsync delete-trail-request))))

(defn remove-tags-async
  "Removes the specified tags from a trail.

  remove-tags-request - Specifies the tags to remove from a trail. - `com.amazonaws.services.cloudtrail.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.RemoveTagsRequest remove-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync remove-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTagsAsync remove-tags-request))))

(defn list-public-keys-async
  "Returns all public keys whose private keys were used to sign the digest files within the specified time range.
   The public key is needed to validate digest files that were signed with its corresponding private key.



   CloudTrail uses different private/public key pairs per region. Each digest file is signed with a private key
   unique to its region. Therefore, when you validate a digest file from a particular region, you must look in the
   same region for its corresponding public key.

  list-public-keys-request - Requests the public keys for a specified time range. - `com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPublicKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.ListPublicKeysResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest list-public-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPublicKeysAsync list-public-keys-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest list-public-keys-request]
    (-> this (.listPublicKeysAsync list-public-keys-request)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this]
    (-> this (.listPublicKeysAsync))))

(defn put-event-selectors-async
  "Configures an event selector for your trail. Use event selectors to further specify the management and data event
   settings for your trail. By default, trails created without specific event selectors will be configured to log
   all read and write management events, and no data events.


   When an event occurs in your account, CloudTrail evaluates the event selectors in all trails. For each trail, if
   the event matches any event selector, the trail processes and logs the event. If the event doesn't match any
   event selector, the trail doesn't log the event.


   Example




   You create an event selector for a trail and specify that you want write-only events.




   The EC2 GetConsoleOutput and RunInstances API operations occur in your account.




   CloudTrail evaluates whether the events match your event selectors.




   The RunInstances is a write-only event and it matches your event selector. The trail logs the event.




   The GetConsoleOutput is a read-only event but it doesn't match your event selector. The trail
   doesn't log the event.




   The PutEventSelectors operation must be called from the region in which the trail was created;
   otherwise, an InvalidHomeRegionException is thrown.


   You can configure up to five event selectors for each trail. For more information, see Logging Data and Management Events for Trails  and Limits in AWS
   CloudTrail in the AWS CloudTrail User Guide.

  put-event-selectors-request - `com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEventSelectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.PutEventSelectorsResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest put-event-selectors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventSelectorsAsync put-event-selectors-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest put-event-selectors-request]
    (-> this (.putEventSelectorsAsync put-event-selectors-request))))

(defn stop-logging-async
  "Suspends the recording of AWS API calls and log file delivery for the specified trail. Under most circumstances,
   there is no need to use this action. You can update a trail without stopping it first. This action is the only
   way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which
   the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called
   on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.

  stop-logging-request - Passes the request to CloudTrail to stop logging AWS API calls for the specified account. - `com.amazonaws.services.cloudtrail.model.StopLoggingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopLogging operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.StopLoggingResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StopLoggingRequest stop-logging-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopLoggingAsync stop-logging-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.StopLoggingRequest stop-logging-request]
    (-> this (.stopLoggingAsync stop-logging-request))))

(defn get-event-selectors-async
  "Describes the settings for the event selectors that you configured for your trail. The information returned for
   your event selectors includes the following:




   If your event selector includes read-only events, write-only events, or all events. This applies to both
   management events and data events.




   If your event selector includes management events.




   If your event selector includes data events, the Amazon S3 objects or AWS Lambda functions that you are logging
   for data events.




   For more information, see Logging Data and Management Events for Trails  in the AWS CloudTrail User Guide.

  get-event-selectors-request - `com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEventSelectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.GetEventSelectorsResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest get-event-selectors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEventSelectorsAsync get-event-selectors-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest get-event-selectors-request]
    (-> this (.getEventSelectorsAsync get-event-selectors-request))))

(defn add-tags-async
  "Adds one or more tags to a trail, up to a limit of 50. Tags must be unique per trail. Overwrites an existing
   tag's value when a new value is specified for an existing tag key. If you specify a key without a value, the tag
   will be created with the specified key and a value of null. You can tag a trail that applies to all regions only
   from the region in which the trail was created (that is, from its home region).

  add-tags-request - Specifies the tags to add to a trail. - `com.amazonaws.services.cloudtrail.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudtrail.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.AddTagsRequest add-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync add-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudTrailAsync this ^com.amazonaws.services.cloudtrail.model.AddTagsRequest add-tags-request]
    (-> this (.addTagsAsync add-tags-request))))

