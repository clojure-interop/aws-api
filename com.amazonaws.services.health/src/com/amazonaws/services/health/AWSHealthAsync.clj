(ns com.amazonaws.services.health.AWSHealthAsync
  "Interface for accessing AWSHealth asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSHealthAsync instead.


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
  (:import [com.amazonaws.services.health AWSHealthAsync]))

(defn describe-affected-entities-async
  "Returns a list of entities that have been affected by the specified events, based on the specified filter
   criteria. Entities can refer to individual customer resources, groups of customer resources, or any other
   construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where
   the extent of impact is unknown, include at least one entity indicating this.


   At least one event ARN is required. Results are sorted by the lastUpdatedTime of the entity,
   starting with the most recent.

  describe-affected-entities-request - `com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAffectedEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeAffectedEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest describe-affected-entities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAffectedEntitiesAsync describe-affected-entities-request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest describe-affected-entities-request]
    (-> this (.describeAffectedEntitiesAsync describe-affected-entities-request))))

(defn describe-entity-aggregates-async
  "Returns the number of entities that are affected by each of the specified events. If no events are specified, the
   counts of all affected entities are returned.

  describe-entity-aggregates-request - `com.amazonaws.services.health.model.DescribeEntityAggregatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEntityAggregates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEntityAggregatesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest describe-entity-aggregates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEntityAggregatesAsync describe-entity-aggregates-request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest describe-entity-aggregates-request]
    (-> this (.describeEntityAggregatesAsync describe-entity-aggregates-request))))

(defn describe-event-aggregates-async
  "Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter
   is specified, the counts of all events in each category are returned.

  describe-event-aggregates-request - `com.amazonaws.services.health.model.DescribeEventAggregatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventAggregates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventAggregatesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest describe-event-aggregates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventAggregatesAsync describe-event-aggregates-request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest describe-event-aggregates-request]
    (-> this (.describeEventAggregatesAsync describe-event-aggregates-request))))

(defn describe-event-details-async
  "Returns detailed information about one or more specified events. Information includes standard event data
   (region, service, etc., as returned by DescribeEvents), a detailed event description, and possible
   additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve
   those, use the DescribeAffectedEntities operation.


   If a specified event cannot be retrieved, an error message is returned for that event.

  describe-event-details-request - `com.amazonaws.services.health.model.DescribeEventDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventDetailsResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest describe-event-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventDetailsAsync describe-event-details-request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest describe-event-details-request]
    (-> this (.describeEventDetailsAsync describe-event-details-request))))

(defn describe-event-types-async
  "Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event
   types are returned, in no particular order.

  describe-event-types-request - `com.amazonaws.services.health.model.DescribeEventTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventTypesResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventTypesRequest describe-event-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventTypesAsync describe-event-types-request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventTypesRequest describe-event-types-request]
    (-> this (.describeEventTypesAsync describe-event-types-request))))

(defn describe-events-async
  "Returns information about events that meet the specified filter criteria. Events are returned in a summary form
   and do not include the detailed description, any additional metadata that depends on the event type, or any
   affected resources. To retrieve that information, use the DescribeEventDetails and
   DescribeAffectedEntities operations.


   If no filter criteria are specified, all events are returned. Results are sorted by lastModifiedTime
   , starting with the most recent.

  describe-events-request - `com.amazonaws.services.health.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request))))

