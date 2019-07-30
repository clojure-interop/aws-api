(ns com.amazonaws.services.health.AWSHealthClient
  "Client for accessing AWSHealth. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.health AWSHealthClient]))

(defn ->aws-health-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWSHealth (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSHealthClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSHealthClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSHealthClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSHealthClient aws-credentials client-configuration))
  (^AWSHealthClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSHealthClient client-configuration))
  (^AWSHealthClient []
    (new AWSHealthClient )))

(defn *builder
  "returns: `com.amazonaws.services.health.AWSHealthClientBuilder`"
  (^com.amazonaws.services.health.AWSHealthClientBuilder []
    (AWSHealthClient/builder )))

(defn describe-affected-entities
  "Returns a list of entities that have been affected by the specified events, based on the specified filter
   criteria. Entities can refer to individual customer resources, groups of customer resources, or any other
   construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where
   the extent of impact is unknown, include at least one entity indicating this.


   At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity,
   starting with the most recent.

  request - `com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest`

  returns: Result of the DescribeAffectedEntities operation returned by the service. - `com.amazonaws.services.health.model.DescribeAffectedEntitiesResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeAffectedEntitiesResult [^AWSHealthClient this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest request]
    (-> this (.describeAffectedEntities request))))

(defn describe-entity-aggregates
  "Returns the number of entities that are affected by each of the specified events. If no events are specified, the
   counts of all affected entities are returned.

  request - `com.amazonaws.services.health.model.DescribeEntityAggregatesRequest`

  returns: Result of the DescribeEntityAggregates operation returned by the service. - `com.amazonaws.services.health.model.DescribeEntityAggregatesResult`"
  (^com.amazonaws.services.health.model.DescribeEntityAggregatesResult [^AWSHealthClient this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest request]
    (-> this (.describeEntityAggregates request))))

(defn describe-event-aggregates
  "Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter
   is specified, the counts of all events in each category are returned.

  request - `com.amazonaws.services.health.model.DescribeEventAggregatesRequest`

  returns: Result of the DescribeEventAggregates operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventAggregatesResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeEventAggregatesResult [^AWSHealthClient this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest request]
    (-> this (.describeEventAggregates request))))

(defn describe-event-details
  "Returns detailed information about one or more specified events. Information includes standard event data
   (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible
   additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve
   those, use the DescribeAffectedEntities operation.


   If a specified event cannot be retrieved, an error message is returned for that event.

  request - `com.amazonaws.services.health.model.DescribeEventDetailsRequest`

  returns: Result of the DescribeEventDetails operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventDetailsResult`

  throws: com.amazonaws.services.health.model.UnsupportedLocaleException - The specified locale is not supported."
  (^com.amazonaws.services.health.model.DescribeEventDetailsResult [^AWSHealthClient this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest request]
    (-> this (.describeEventDetails request))))

(defn describe-event-types
  "Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event
   types are returned, in no particular order.

  request - `com.amazonaws.services.health.model.DescribeEventTypesRequest`

  returns: Result of the DescribeEventTypes operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventTypesResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeEventTypesResult [^AWSHealthClient this ^com.amazonaws.services.health.model.DescribeEventTypesRequest request]
    (-> this (.describeEventTypes request))))

(defn describe-events
  "Returns information about events that meet the specified filter criteria. Events are returned in a summary form
   and do not include the detailed description, any additional metadata that depends on the event type, or any
   affected resources. To retrieve that information, use the DescribeEventDetails and
   DescribeAffectedEntities operations.


   If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime
   , starting with the most recent.

  request - `com.amazonaws.services.health.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventsResult`

  throws: com.amazonaws.services.health.model.InvalidPaginationTokenException - The specified pagination token (nextToken) is not valid."
  (^com.amazonaws.services.health.model.DescribeEventsResult [^AWSHealthClient this ^com.amazonaws.services.health.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSHealthClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

