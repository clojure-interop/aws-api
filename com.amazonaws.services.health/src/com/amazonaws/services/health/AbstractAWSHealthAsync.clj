(ns com.amazonaws.services.health.AbstractAWSHealthAsync
  "Abstract implementation of AWSHealthAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.health AbstractAWSHealthAsync]))

(defn describe-affected-entities-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAffectedEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeAffectedEntitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAffectedEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest request]
    (-> this (.describeAffectedEntitiesAsync request))))

(defn describe-entity-aggregates-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEntityAggregatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEntityAggregates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEntityAggregatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEntityAggregatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest request]
    (-> this (.describeEntityAggregatesAsync request))))

(defn describe-event-aggregates-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventAggregatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventAggregates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventAggregatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventAggregatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest request]
    (-> this (.describeEventAggregatesAsync request))))

(defn describe-event-details-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventDetailsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventDetailsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest request]
    (-> this (.describeEventDetailsAsync request))))

(defn describe-event-types-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventTypesRequest request]
    (-> this (.describeEventTypesAsync request))))

(defn describe-events-async
  "Description copied from interface: AWSHealthAsync

  request - `com.amazonaws.services.health.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.health.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSHealthAsync this ^com.amazonaws.services.health.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

