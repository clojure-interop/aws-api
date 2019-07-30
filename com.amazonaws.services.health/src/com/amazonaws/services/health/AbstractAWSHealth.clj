(ns com.amazonaws.services.health.AbstractAWSHealth
  "Abstract implementation of AWSHealth. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.health AbstractAWSHealth]))

(defn set-region
  "Description copied from interface: AWSHealth

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSHealth this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-entity-aggregates
  "Description copied from interface: AWSHealth

  request - `com.amazonaws.services.health.model.DescribeEntityAggregatesRequest`

  returns: Result of the DescribeEntityAggregates operation returned by the service. - `com.amazonaws.services.health.model.DescribeEntityAggregatesResult`"
  (^com.amazonaws.services.health.model.DescribeEntityAggregatesResult [^AbstractAWSHealth this ^com.amazonaws.services.health.model.DescribeEntityAggregatesRequest request]
    (-> this (.describeEntityAggregates request))))

(defn describe-event-details
  "Description copied from interface: AWSHealth

  request - `com.amazonaws.services.health.model.DescribeEventDetailsRequest`

  returns: Result of the DescribeEventDetails operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventDetailsResult`"
  (^com.amazonaws.services.health.model.DescribeEventDetailsResult [^AbstractAWSHealth this ^com.amazonaws.services.health.model.DescribeEventDetailsRequest request]
    (-> this (.describeEventDetails request))))

(defn shutdown
  "Description copied from interface: AWSHealth"
  ([^AbstractAWSHealth this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AWSHealth

  request - `com.amazonaws.services.health.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventsResult`"
  (^com.amazonaws.services.health.model.DescribeEventsResult [^AbstractAWSHealth this ^com.amazonaws.services.health.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn describe-affected-entities
  "Description copied from interface: AWSHealth

  request - `com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest`

  returns: Result of the DescribeAffectedEntities operation returned by the service. - `com.amazonaws.services.health.model.DescribeAffectedEntitiesResult`"
  (^com.amazonaws.services.health.model.DescribeAffectedEntitiesResult [^AbstractAWSHealth this ^com.amazonaws.services.health.model.DescribeAffectedEntitiesRequest request]
    (-> this (.describeAffectedEntities request))))

(defn set-endpoint
  "Description copied from interface: AWSHealth

  endpoint - The endpoint (ex: \"health.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"health.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSHealth this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-event-aggregates
  "Description copied from interface: AWSHealth

  request - `com.amazonaws.services.health.model.DescribeEventAggregatesRequest`

  returns: Result of the DescribeEventAggregates operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventAggregatesResult`"
  (^com.amazonaws.services.health.model.DescribeEventAggregatesResult [^AbstractAWSHealth this ^com.amazonaws.services.health.model.DescribeEventAggregatesRequest request]
    (-> this (.describeEventAggregates request))))

(defn describe-event-types
  "Description copied from interface: AWSHealth

  request - `com.amazonaws.services.health.model.DescribeEventTypesRequest`

  returns: Result of the DescribeEventTypes operation returned by the service. - `com.amazonaws.services.health.model.DescribeEventTypesResult`"
  (^com.amazonaws.services.health.model.DescribeEventTypesResult [^AbstractAWSHealth this ^com.amazonaws.services.health.model.DescribeEventTypesRequest request]
    (-> this (.describeEventTypes request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSHealth

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSHealth this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

