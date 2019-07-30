(ns com.amazonaws.services.cloudtrail.AWSCloudTrail
  "Interface for accessing CloudTrail.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCloudTrail instead.


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
  (:import [com.amazonaws.services.cloudtrail AWSCloudTrail]))

(defn add-tags
  "Adds one or more tags to a trail, up to a limit of 50. Tags must be unique per trail. Overwrites an existing
   tag's value when a new value is specified for an existing tag key. If you specify a key without a value, the tag
   will be created with the specified key and a value of null. You can tag a trail that applies to all regions only
   from the region in which the trail was created (that is, from its home region).

  add-tags-request - Specifies the tags to add to a trail. - `com.amazonaws.services.cloudtrail.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.cloudtrail.model.AddTagsResult`

  throws: com.amazonaws.services.cloudtrail.model.ResourceNotFoundException - This exception is thrown when the specified resource is not found."
  (^com.amazonaws.services.cloudtrail.model.AddTagsResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.AddTagsRequest add-tags-request]
    (-> this (.addTags add-tags-request))))

(defn start-logging
  "Starts the recording of AWS API calls and log file delivery for a trail. For a trail that is enabled in all
   regions, this operation must be called from the region in which the trail was created. This operation cannot be
   called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.

  start-logging-request - The request to CloudTrail to start logging AWS API calls for an account. - `com.amazonaws.services.cloudtrail.model.StartLoggingRequest`

  returns: Result of the StartLogging operation returned by the service. - `com.amazonaws.services.cloudtrail.model.StartLoggingResult`

  throws: com.amazonaws.services.cloudtrail.model.TrailNotFoundException - This exception is thrown when the trail with the given name is not found."
  (^com.amazonaws.services.cloudtrail.model.StartLoggingResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.StartLoggingRequest start-logging-request]
    (-> this (.startLogging start-logging-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSCloudTrail this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn lookup-events
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

  returns: Result of the LookupEvents operation returned by the service. - `com.amazonaws.services.cloudtrail.model.LookupEventsResult`

  throws: com.amazonaws.services.cloudtrail.model.InvalidLookupAttributesException - Occurs when an invalid lookup attribute is specified."
  (^com.amazonaws.services.cloudtrail.model.LookupEventsResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.LookupEventsRequest lookup-events-request]
    (-> this (.lookupEvents lookup-events-request)))
  (^com.amazonaws.services.cloudtrail.model.LookupEventsResult [^AWSCloudTrail this]
    (-> this (.lookupEvents))))

(defn list-tags
  "Lists the tags for the trail in the current region.

  list-tags-request - Specifies a list of trail tags to return. - `com.amazonaws.services.cloudtrail.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.cloudtrail.model.ListTagsResult`

  throws: com.amazonaws.services.cloudtrail.model.ResourceNotFoundException - This exception is thrown when the specified resource is not found."
  (^com.amazonaws.services.cloudtrail.model.ListTagsResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn update-trail
  "Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the
   CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has
   previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail
   must be called from the region in which the trail was created; otherwise, an
   InvalidHomeRegionException is thrown.

  update-trail-request - Specifies settings to update for the trail. - `com.amazonaws.services.cloudtrail.model.UpdateTrailRequest`

  returns: Result of the UpdateTrail operation returned by the service. - `com.amazonaws.services.cloudtrail.model.UpdateTrailResult`

  throws: com.amazonaws.services.cloudtrail.model.UnsupportedOperationException - This exception is thrown when the requested operation is not supported."
  (^com.amazonaws.services.cloudtrail.model.UpdateTrailResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.UpdateTrailRequest update-trail-request]
    (-> this (.updateTrail update-trail-request))))

(defn remove-tags
  "Removes the specified tags from a trail.

  remove-tags-request - Specifies the tags to remove from a trail. - `com.amazonaws.services.cloudtrail.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.cloudtrail.model.RemoveTagsResult`

  throws: com.amazonaws.services.cloudtrail.model.ResourceNotFoundException - This exception is thrown when the specified resource is not found."
  (^com.amazonaws.services.cloudtrail.model.RemoveTagsResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTags remove-tags-request))))

(defn create-trail
  "Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five
   trails can exist in a region, irrespective of the region in which they were created.

  create-trail-request - Specifies the settings for each trail. - `com.amazonaws.services.cloudtrail.model.CreateTrailRequest`

  returns: Result of the CreateTrail operation returned by the service. - `com.amazonaws.services.cloudtrail.model.CreateTrailResult`

  throws: com.amazonaws.services.cloudtrail.model.UnsupportedOperationException - This exception is thrown when the requested operation is not supported."
  (^com.amazonaws.services.cloudtrail.model.CreateTrailResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.CreateTrailRequest create-trail-request]
    (-> this (.createTrail create-trail-request))))

(defn get-trail-status
  "Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery
   errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns
   trail status from a single region. To return trail status from all regions, you must call the operation on each
   region.

  get-trail-status-request - The name of a trail about which you want the current status. - `com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest`

  returns: Result of the GetTrailStatus operation returned by the service. - `com.amazonaws.services.cloudtrail.model.GetTrailStatusResult`

  throws: com.amazonaws.services.cloudtrail.model.TrailNotFoundException - This exception is thrown when the trail with the given name is not found."
  (^com.amazonaws.services.cloudtrail.model.GetTrailStatusResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.GetTrailStatusRequest get-trail-status-request]
    (-> this (.getTrailStatus get-trail-status-request))))

(defn list-public-keys
  "Returns all public keys whose private keys were used to sign the digest files within the specified time range.
   The public key is needed to validate digest files that were signed with its corresponding private key.



   CloudTrail uses different private/public key pairs per region. Each digest file is signed with a private key
   unique to its region. Therefore, when you validate a digest file from a particular region, you must look in the
   same region for its corresponding public key.

  list-public-keys-request - Requests the public keys for a specified time range. - `com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest`

  returns: Result of the ListPublicKeys operation returned by the service. - `com.amazonaws.services.cloudtrail.model.ListPublicKeysResult`

  throws: com.amazonaws.services.cloudtrail.model.InvalidTimeRangeException - Occurs if the timestamp values are invalid. Either the start time occurs after the end time or the time range is outside the range of possible values."
  (^com.amazonaws.services.cloudtrail.model.ListPublicKeysResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.ListPublicKeysRequest list-public-keys-request]
    (-> this (.listPublicKeys list-public-keys-request)))
  (^com.amazonaws.services.cloudtrail.model.ListPublicKeysResult [^AWSCloudTrail this]
    (-> this (.listPublicKeys))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCloudTrail this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cloudtrail.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"cloudtrail.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSCloudTrail this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn put-event-selectors
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

  returns: Result of the PutEventSelectors operation returned by the service. - `com.amazonaws.services.cloudtrail.model.PutEventSelectorsResult`

  throws: com.amazonaws.services.cloudtrail.model.TrailNotFoundException - This exception is thrown when the trail with the given name is not found."
  (^com.amazonaws.services.cloudtrail.model.PutEventSelectorsResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest put-event-selectors-request]
    (-> this (.putEventSelectors put-event-selectors-request))))

(defn describe-trails
  "Retrieves settings for the trail associated with the current region for your account.

  describe-trails-request - Returns information about the trail. - `com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest`

  returns: Result of the DescribeTrails operation returned by the service. - `com.amazonaws.services.cloudtrail.model.DescribeTrailsResult`

  throws: com.amazonaws.services.cloudtrail.model.UnsupportedOperationException - This exception is thrown when the requested operation is not supported."
  (^com.amazonaws.services.cloudtrail.model.DescribeTrailsResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.DescribeTrailsRequest describe-trails-request]
    (-> this (.describeTrails describe-trails-request)))
  (^com.amazonaws.services.cloudtrail.model.DescribeTrailsResult [^AWSCloudTrail this]
    (-> this (.describeTrails))))

(defn stop-logging
  "Suspends the recording of AWS API calls and log file delivery for the specified trail. Under most circumstances,
   there is no need to use this action. You can update a trail without stopping it first. This action is the only
   way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which
   the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called
   on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.

  stop-logging-request - Passes the request to CloudTrail to stop logging AWS API calls for the specified account. - `com.amazonaws.services.cloudtrail.model.StopLoggingRequest`

  returns: Result of the StopLogging operation returned by the service. - `com.amazonaws.services.cloudtrail.model.StopLoggingResult`

  throws: com.amazonaws.services.cloudtrail.model.TrailNotFoundException - This exception is thrown when the trail with the given name is not found."
  (^com.amazonaws.services.cloudtrail.model.StopLoggingResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.StopLoggingRequest stop-logging-request]
    (-> this (.stopLogging stop-logging-request))))

(defn get-event-selectors
  "Describes the settings for the event selectors that you configured for your trail. The information returned for
   your event selectors includes the following:




   If your event selector includes read-only events, write-only events, or all events. This applies to both
   management events and data events.




   If your event selector includes management events.




   If your event selector includes data events, the Amazon S3 objects or AWS Lambda functions that you are logging
   for data events.




   For more information, see Logging Data and Management Events for Trails  in the AWS CloudTrail User Guide.

  get-event-selectors-request - `com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest`

  returns: Result of the GetEventSelectors operation returned by the service. - `com.amazonaws.services.cloudtrail.model.GetEventSelectorsResult`

  throws: com.amazonaws.services.cloudtrail.model.TrailNotFoundException - This exception is thrown when the trail with the given name is not found."
  (^com.amazonaws.services.cloudtrail.model.GetEventSelectorsResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.GetEventSelectorsRequest get-event-selectors-request]
    (-> this (.getEventSelectors get-event-selectors-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCloudTrail this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-trail
  "Deletes a trail. This operation must be called from the region in which the trail was created.
   DeleteTrail cannot be called on the shadow trails (replicated trails in other regions) of a trail
   that is enabled in all regions.

  delete-trail-request - The request that specifies the name of a trail to delete. - `com.amazonaws.services.cloudtrail.model.DeleteTrailRequest`

  returns: Result of the DeleteTrail operation returned by the service. - `com.amazonaws.services.cloudtrail.model.DeleteTrailResult`

  throws: com.amazonaws.services.cloudtrail.model.TrailNotFoundException - This exception is thrown when the trail with the given name is not found."
  (^com.amazonaws.services.cloudtrail.model.DeleteTrailResult [^AWSCloudTrail this ^com.amazonaws.services.cloudtrail.model.DeleteTrailRequest delete-trail-request]
    (-> this (.deleteTrail delete-trail-request))))

