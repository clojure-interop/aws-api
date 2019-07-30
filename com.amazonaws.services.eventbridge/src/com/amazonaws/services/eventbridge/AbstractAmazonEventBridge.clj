(ns com.amazonaws.services.eventbridge.AbstractAmazonEventBridge
  "Abstract implementation of AmazonEventBridge. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eventbridge AbstractAmazonEventBridge]))

(defn put-partner-events
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest`

  returns: Result of the PutPartnerEvents operation returned by the service. - `com.amazonaws.services.eventbridge.model.PutPartnerEventsResult`"
  (^com.amazonaws.services.eventbridge.model.PutPartnerEventsResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest request]
    (-> this (.putPartnerEvents request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.eventbridge.model.ListTagsForResourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-event-buses
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListEventBusesRequest`

  returns: Result of the ListEventBuses operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListEventBusesResult`"
  (^com.amazonaws.services.eventbridge.model.ListEventBusesResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListEventBusesRequest request]
    (-> this (.listEventBuses request))))

(defn describe-event-source
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest`

  returns: Result of the DescribeEventSource operation returned by the service. - `com.amazonaws.services.eventbridge.model.DescribeEventSourceResult`"
  (^com.amazonaws.services.eventbridge.model.DescribeEventSourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest request]
    (-> this (.describeEventSource request))))

(defn enable-rule
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.EnableRuleRequest`

  returns: Result of the EnableRule operation returned by the service. - `com.amazonaws.services.eventbridge.model.EnableRuleResult`"
  (^com.amazonaws.services.eventbridge.model.EnableRuleResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.EnableRuleRequest request]
    (-> this (.enableRule request))))

(defn delete-partner-event-source
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest`

  returns: Result of the DeletePartnerEventSource operation returned by the service. - `com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceResult`"
  (^com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest request]
    (-> this (.deletePartnerEventSource request))))

(defn put-events
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.PutEventsRequest`

  returns: Result of the PutEvents operation returned by the service. - `com.amazonaws.services.eventbridge.model.PutEventsResult`"
  (^com.amazonaws.services.eventbridge.model.PutEventsResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.PutEventsRequest request]
    (-> this (.putEvents request))))

(defn list-targets-by-rule
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest`

  returns: Result of the ListTargetsByRule operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListTargetsByRuleResult`"
  (^com.amazonaws.services.eventbridge.model.ListTargetsByRuleResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest request]
    (-> this (.listTargetsByRule request))))

(defn untag-resource
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.eventbridge.model.UntagResourceResult`"
  (^com.amazonaws.services.eventbridge.model.UntagResourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn put-permission
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.PutPermissionRequest`

  returns: Result of the PutPermission operation returned by the service. - `com.amazonaws.services.eventbridge.model.PutPermissionResult`"
  (^com.amazonaws.services.eventbridge.model.PutPermissionResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.PutPermissionRequest request]
    (-> this (.putPermission request))))

(defn test-event-pattern
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.TestEventPatternRequest`

  returns: Result of the TestEventPattern operation returned by the service. - `com.amazonaws.services.eventbridge.model.TestEventPatternResult`"
  (^com.amazonaws.services.eventbridge.model.TestEventPatternResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.TestEventPatternRequest request]
    (-> this (.testEventPattern request))))

(defn delete-rule
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DeleteRuleRequest`

  returns: Result of the DeleteRule operation returned by the service. - `com.amazonaws.services.eventbridge.model.DeleteRuleResult`"
  (^com.amazonaws.services.eventbridge.model.DeleteRuleResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DeleteRuleRequest request]
    (-> this (.deleteRule request))))

(defn delete-event-bus
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DeleteEventBusRequest`

  returns: Result of the DeleteEventBus operation returned by the service. - `com.amazonaws.services.eventbridge.model.DeleteEventBusResult`"
  (^com.amazonaws.services.eventbridge.model.DeleteEventBusResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DeleteEventBusRequest request]
    (-> this (.deleteEventBus request))))

(defn describe-partner-event-source
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest`

  returns: Result of the DescribePartnerEventSource operation returned by the service. - `com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceResult`"
  (^com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest request]
    (-> this (.describePartnerEventSource request))))

(defn activate-event-source
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest`

  returns: Result of the ActivateEventSource operation returned by the service. - `com.amazonaws.services.eventbridge.model.ActivateEventSourceResult`"
  (^com.amazonaws.services.eventbridge.model.ActivateEventSourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest request]
    (-> this (.activateEventSource request))))

(defn remove-permission
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.RemovePermissionRequest`

  returns: Result of the RemovePermission operation returned by the service. - `com.amazonaws.services.eventbridge.model.RemovePermissionResult`"
  (^com.amazonaws.services.eventbridge.model.RemovePermissionResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.RemovePermissionRequest request]
    (-> this (.removePermission request))))

(defn remove-targets
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.RemoveTargetsRequest`

  returns: Result of the RemoveTargets operation returned by the service. - `com.amazonaws.services.eventbridge.model.RemoveTargetsResult`"
  (^com.amazonaws.services.eventbridge.model.RemoveTargetsResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.RemoveTargetsRequest request]
    (-> this (.removeTargets request))))

(defn shutdown
  "Description copied from interface: AmazonEventBridge"
  ([^AbstractAmazonEventBridge this]
    (-> this (.shutdown))))

(defn describe-rule
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DescribeRuleRequest`

  returns: Result of the DescribeRule operation returned by the service. - `com.amazonaws.services.eventbridge.model.DescribeRuleResult`"
  (^com.amazonaws.services.eventbridge.model.DescribeRuleResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DescribeRuleRequest request]
    (-> this (.describeRule request))))

(defn list-partner-event-sources
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest`

  returns: Result of the ListPartnerEventSources operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesResult`"
  (^com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest request]
    (-> this (.listPartnerEventSources request))))

(defn disable-rule
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DisableRuleRequest`

  returns: Result of the DisableRule operation returned by the service. - `com.amazonaws.services.eventbridge.model.DisableRuleResult`"
  (^com.amazonaws.services.eventbridge.model.DisableRuleResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DisableRuleRequest request]
    (-> this (.disableRule request))))

(defn create-event-bus
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.CreateEventBusRequest`

  returns: Result of the CreateEventBus operation returned by the service. - `com.amazonaws.services.eventbridge.model.CreateEventBusResult`"
  (^com.amazonaws.services.eventbridge.model.CreateEventBusResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.CreateEventBusRequest request]
    (-> this (.createEventBus request))))

(defn list-event-sources
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListEventSourcesRequest`

  returns: Result of the ListEventSources operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListEventSourcesResult`"
  (^com.amazonaws.services.eventbridge.model.ListEventSourcesResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListEventSourcesRequest request]
    (-> this (.listEventSources request))))

(defn deactivate-event-source
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest`

  returns: Result of the DeactivateEventSource operation returned by the service. - `com.amazonaws.services.eventbridge.model.DeactivateEventSourceResult`"
  (^com.amazonaws.services.eventbridge.model.DeactivateEventSourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest request]
    (-> this (.deactivateEventSource request))))

(defn create-partner-event-source
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest`

  returns: Result of the CreatePartnerEventSource operation returned by the service. - `com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceResult`"
  (^com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest request]
    (-> this (.createPartnerEventSource request))))

(defn list-rule-names-by-target
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest`

  returns: Result of the ListRuleNamesByTarget operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetResult`"
  (^com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest request]
    (-> this (.listRuleNamesByTarget request))))

(defn describe-event-bus
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.DescribeEventBusRequest`

  returns: Result of the DescribeEventBus operation returned by the service. - `com.amazonaws.services.eventbridge.model.DescribeEventBusResult`"
  (^com.amazonaws.services.eventbridge.model.DescribeEventBusResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.DescribeEventBusRequest request]
    (-> this (.describeEventBus request))))

(defn list-partner-event-source-accounts
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest`

  returns: Result of the ListPartnerEventSourceAccounts operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsResult`"
  (^com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest request]
    (-> this (.listPartnerEventSourceAccounts request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonEventBridge

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonEventBridge this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-targets
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.PutTargetsRequest`

  returns: Result of the PutTargets operation returned by the service. - `com.amazonaws.services.eventbridge.model.PutTargetsResult`"
  (^com.amazonaws.services.eventbridge.model.PutTargetsResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.PutTargetsRequest request]
    (-> this (.putTargets request))))

(defn put-rule
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.PutRuleRequest`

  returns: Result of the PutRule operation returned by the service. - `com.amazonaws.services.eventbridge.model.PutRuleResult`"
  (^com.amazonaws.services.eventbridge.model.PutRuleResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.PutRuleRequest request]
    (-> this (.putRule request))))

(defn list-rules
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.ListRulesRequest`

  returns: Result of the ListRules operation returned by the service. - `com.amazonaws.services.eventbridge.model.ListRulesResult`"
  (^com.amazonaws.services.eventbridge.model.ListRulesResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.ListRulesRequest request]
    (-> this (.listRules request))))

(defn tag-resource
  "Description copied from interface: AmazonEventBridge

  request - `com.amazonaws.services.eventbridge.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.eventbridge.model.TagResourceResult`"
  (^com.amazonaws.services.eventbridge.model.TagResourceResult [^AbstractAmazonEventBridge this ^com.amazonaws.services.eventbridge.model.TagResourceRequest request]
    (-> this (.tagResource request))))

