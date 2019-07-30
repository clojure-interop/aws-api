(ns com.amazonaws.services.health.AWSHealth
  "Interface for accessing AWSHealth.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSHealth instead.


  AWS Health

  The AWS Health API provides programmatic access to the AWS Health information that is presented in the AWS Personal Health Dashboard. You can get information about events
  that affect your AWS resources:




  DescribeEvents: Summary information about events.




  DescribeEventDetails: Detailed information about one or more events.




  DescribeAffectedEntities: Information about AWS resources that are affected by one or more events.




  In addition, these operations provide information about event types and summary counts of events or affected
  entities:




  DescribeEventTypes: Information about the kinds of events that AWS Health tracks.




  DescribeEventAggregates: A count of the number of events that meet specified criteria.




  DescribeEntityAggregates: A count of the number of affected entities that meet specified criteria.




  The Health API requires a Business or Enterprise support plan from AWS Support. Calling the Health API from an account that does not
  have a Business or Enterprise support plan causes a SubscriptionRequiredException.


  For authentication of requests, AWS Health uses the Signature Version 4 Signing
  Process.


  See the AWS Health User Guide for
  information about how to use the API.


  Service Endpoint


  The HTTP endpoint for the AWS Health API is:




  https://health.us-east-1.amazonaws.com"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.health AWSHealth]))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSHealth this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-entity-aggregates
  "Returns the number of entities that are affected by each of the specified events. If no events are specified, the
   counts of all affected entities are returned.

  describe-entity-aggregates-request - `com.amazonaws.services.health.model.DescribeEntityAggregatesRequest`

  returns: Result of the DescribeEntityAggregates operation returned by the service. - `com.amazonaws.services.health.model.DescribeEntityAggregatesResult`"
  (^com.amazonaws.services.health.model.DescribeEntityAggregatesResult [^AWSHealth this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest describe-entity-aggregates-request]
    (-> this (.describeEntityAggregates describe-entity-aggregates-request))))

(defn describe-event-details
  "Returns detailed information about one or more specified events. Information includes standard event data
   (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible
   additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve
   those, use the DescribeAffectedEntities operation.


   If a specified event cannot be retrieved, an error message is returned for that event.

  describe-event-details-request - `com.amazonaws.services.health.model.DescribeEventDetailsRequest`

  returns: Result of the DescribeEventDetails operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventDetailsResult`

  throws: com.amazonaws.services.health.model.UnsupportedLocaleException - The specified locale is not supported."
  (^com.amazonaws.services.health.model.DescribeEventDetailsResult [^AWSHealth this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest describe-event-details-request]
    (-> this (.describeEventDetails describe-event-details-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSHealth this]
    (-> this (.shutdown))))

(defn describe-events
  "Returns information about events that meet the specified filter criteria. Events are returned in a summary form
   and do not include the detailed description, any additional metadata that depends on the event type, or any
   affected resources. To retrieve that information, use the DescribeEventDetails and
   DescribeAffectedEntities operations.


   If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime
   , starting with the most recent.

  describe-events-request - `com.amazonaws.services.health.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventsResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeEventsResult [^AWSHealth this ^com.amazonaws.services.health.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEvents describe-events-request))))

(defn describe-affected-entities
  "Returns a list of entities that have been affected by the specified events, based on the specified filter
   criteria. Entities can refer to individual customer resources, groups of customer resources, or any other
   construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where
   the extent of impact is unknown, include at least one entity indicating this.


   At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity,
   starting with the most recent.

  describe-affected-entities-request - `com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest`

  returns: Result of the DescribeAffectedEntities operation returned by the service. - `com.amazonaws.services.health.model.DescribeAffectedEntitiesResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeAffectedEntitiesResult [^AWSHealth this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest describe-affected-entities-request]
    (-> this (.describeAffectedEntities describe-affected-entities-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"health.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"health.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSHealth this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-event-aggregates
  "Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter
   is specified, the counts of all events in each category are returned.

  describe-event-aggregates-request - `com.amazonaws.services.health.model.DescribeEventAggregatesRequest`

  returns: Result of the DescribeEventAggregates operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventAggregatesResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeEventAggregatesResult [^AWSHealth this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest describe-event-aggregates-request]
    (-> this (.describeEventAggregates describe-event-aggregates-request))))

(defn describe-event-types
  "Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event
   types are returned, in no particular order.

  describe-event-types-request - `com.amazonaws.services.health.model.DescribeEventTypesRequest`

  returns: Result of the DescribeEventTypes operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventTypesResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeEventTypesResult [^AWSHealth this ^com.amazonaws.services.health.model.DescribeEventTypesRequest describe-event-types-request]
    (-> this (.describeEventTypes describe-event-types-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSHealth this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

