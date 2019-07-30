(ns com.amazonaws.services.cloudwatchevents.AbstractAmazonCloudWatchEvents
  "Abstract implementation of AmazonCloudWatchEvents. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatchevents AbstractAmazonCloudWatchEvents]))

(defn put-partner-events
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsRequest`

  returns: Result of the PutPartnerEvents operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsResult`"
  (^com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsRequest request]
    (-> this (.putPartnerEvents request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn set-region
  "Description copied from interface: AmazonCloudWatchEvents

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCloudWatchEvents this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-event-buses
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListEventBusesRequest`

  returns: Result of the ListEventBuses operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListEventBusesResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListEventBusesResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListEventBusesRequest request]
    (-> this (.listEventBuses request))))

(defn describe-event-source
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceRequest`

  returns: Result of the DescribeEventSource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceRequest request]
    (-> this (.describeEventSource request))))

(defn enable-rule
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest`

  returns: Result of the EnableRule operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.EnableRuleResult`"
  (^com.amazonaws.services.cloudwatchevents.model.EnableRuleResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest request]
    (-> this (.enableRule request))))

(defn delete-partner-event-source
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceRequest`

  returns: Result of the DeletePartnerEventSource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceRequest request]
    (-> this (.deletePartnerEventSource request))))

(defn put-events
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.PutEventsResult`"
  (^com.amazonaws.services.cloudwatchevents.model.PutEventsResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.PutEventsRequest request]
    (-> this (.putEvents request))))

(defn list-targets-by-rule
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest`

  returns: Result of the ListTargetsByRule operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest request]
    (-> this (.listTargetsByRule request))))

(defn untag-resource
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.UntagResourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.UntagResourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn put-permission
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest`

  returns: Result of the PutPermission operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.PutPermissionResult`"
  (^com.amazonaws.services.cloudwatchevents.model.PutPermissionResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest request]
    (-> this (.putPermission request))))

(defn test-event-pattern
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest`

  returns: Result of the TestEventPattern operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult`"
  (^com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest request]
    (-> this (.testEventPattern request))))

(defn delete-rule
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest`

  returns: Result of the DeleteRule operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest request]
    (-> this (.deleteRule request))))

(defn delete-event-bus
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DeleteEventBusRequest`

  returns: Result of the DeleteEventBus operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DeleteEventBusResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DeleteEventBusResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DeleteEventBusRequest request]
    (-> this (.deleteEventBus request))))

(defn describe-partner-event-source
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceRequest`

  returns: Result of the DescribePartnerEventSource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceRequest request]
    (-> this (.describePartnerEventSource request))))

(defn activate-event-source
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceRequest`

  returns: Result of the ActivateEventSource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceRequest request]
    (-> this (.activateEventSource request))))

(defn remove-permission
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest`

  returns: Result of the RemovePermission operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult`"
  (^com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest request]
    (-> this (.removePermission request))))

(defn remove-targets
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest`

  returns: Result of the RemoveTargets operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult`"
  (^com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest request]
    (-> this (.removeTargets request))))

(defn shutdown
  "Description copied from interface: AmazonCloudWatchEvents"
  ([^AbstractAmazonCloudWatchEvents this]
    (-> this (.shutdown))))

(defn describe-rule
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest`

  returns: Result of the DescribeRule operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest request]
    (-> this (.describeRule request))))

(defn list-partner-event-sources
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesRequest`

  returns: Result of the ListPartnerEventSources operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesRequest request]
    (-> this (.listPartnerEventSources request))))

(defn disable-rule
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest`

  returns: Result of the DisableRule operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DisableRuleResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DisableRuleResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest request]
    (-> this (.disableRule request))))

(defn set-endpoint
  "Description copied from interface: AmazonCloudWatchEvents

  endpoint - The endpoint (ex: \"events.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"events.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCloudWatchEvents this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-event-bus
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.CreateEventBusRequest`

  returns: Result of the CreateEventBus operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.CreateEventBusResult`"
  (^com.amazonaws.services.cloudwatchevents.model.CreateEventBusResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.CreateEventBusRequest request]
    (-> this (.createEventBus request))))

(defn list-event-sources
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListEventSourcesRequest`

  returns: Result of the ListEventSources operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListEventSourcesResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListEventSourcesResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListEventSourcesRequest request]
    (-> this (.listEventSources request))))

(defn deactivate-event-source
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceRequest`

  returns: Result of the DeactivateEventSource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceRequest request]
    (-> this (.deactivateEventSource request))))

(defn create-partner-event-source
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceRequest`

  returns: Result of the CreatePartnerEventSource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceRequest request]
    (-> this (.createPartnerEventSource request))))

(defn list-rule-names-by-target
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest`

  returns: Result of the ListRuleNamesByTarget operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest request]
    (-> this (.listRuleNamesByTarget request))))

(defn describe-event-bus
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest`

  returns: Result of the DescribeEventBus operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult`"
  (^com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest request]
    (-> this (.describeEventBus request))))

(defn list-partner-event-source-accounts
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsRequest`

  returns: Result of the ListPartnerEventSourceAccounts operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsRequest request]
    (-> this (.listPartnerEventSourceAccounts request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCloudWatchEvents

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-targets
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest`

  returns: Result of the PutTargets operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.PutTargetsResult`"
  (^com.amazonaws.services.cloudwatchevents.model.PutTargetsResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest request]
    (-> this (.putTargets request))))

(defn put-rule
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.PutRuleRequest`

  returns: Result of the PutRule operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.PutRuleResult`"
  (^com.amazonaws.services.cloudwatchevents.model.PutRuleResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.PutRuleRequest request]
    (-> this (.putRule request))))

(defn list-rules
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.ListRulesRequest`

  returns: Result of the ListRules operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.ListRulesResult`"
  (^com.amazonaws.services.cloudwatchevents.model.ListRulesResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.ListRulesRequest request]
    (-> this (.listRules request))))

(defn tag-resource
  "Description copied from interface: AmazonCloudWatchEvents

  request - `com.amazonaws.services.cloudwatchevents.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudwatchevents.model.TagResourceResult`"
  (^com.amazonaws.services.cloudwatchevents.model.TagResourceResult [^AbstractAmazonCloudWatchEvents this ^com.amazonaws.services.cloudwatchevents.model.TagResourceRequest request]
    (-> this (.tagResource request))))

