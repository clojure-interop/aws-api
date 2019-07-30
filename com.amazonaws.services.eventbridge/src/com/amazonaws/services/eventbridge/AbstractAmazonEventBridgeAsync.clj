(ns com.amazonaws.services.eventbridge.AbstractAmazonEventBridgeAsync
  "Abstract implementation of AmazonEventBridgeAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eventbridge AbstractAmazonEventBridgeAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn describe-partner-event-source-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePartnerEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest request]
    (-> this (.describePartnerEventSourceAsync request))))

(defn list-event-sources-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListEventSourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListEventSourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventSourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventSourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventSourcesRequest request]
    (-> this (.listEventSourcesAsync request))))

(defn create-event-bus-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.CreateEventBusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.CreateEventBusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreateEventBusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventBusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreateEventBusRequest request]
    (-> this (.createEventBusAsync request))))

(defn list-rule-names-by-target-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRuleNamesByTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest request]
    (-> this (.listRuleNamesByTargetAsync request))))

(defn delete-partner-event-source-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePartnerEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest request]
    (-> this (.deletePartnerEventSourceAsync request))))

(defn enable-rule-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.EnableRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.EnableRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.EnableRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.EnableRuleRequest request]
    (-> this (.enableRuleAsync request))))

(defn remove-permission-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.RemovePermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemovePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemovePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemovePermissionRequest request]
    (-> this (.removePermissionAsync request))))

(defn put-targets-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.PutTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutTargetsRequest request]
    (-> this (.putTargetsAsync request))))

(defn test-event-pattern-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.TestEventPatternRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestEventPattern operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.TestEventPatternResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TestEventPatternRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testEventPatternAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TestEventPatternRequest request]
    (-> this (.testEventPatternAsync request))))

(defn describe-event-bus-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DescribeEventBusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribeEventBusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventBusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventBusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventBusRequest request]
    (-> this (.describeEventBusAsync request))))

(defn remove-targets-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.RemoveTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.RemoveTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemoveTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemoveTargetsRequest request]
    (-> this (.removeTargetsAsync request))))

(defn put-events-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.PutEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutEventsRequest request]
    (-> this (.putEventsAsync request))))

(defn put-permission-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.PutPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutPermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPermissionRequest request]
    (-> this (.putPermissionAsync request))))

(defn delete-rule-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DeleteRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeleteRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteRuleRequest request]
    (-> this (.deleteRuleAsync request))))

(defn list-targets-by-rule-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsByRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListTargetsByRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsByRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest request]
    (-> this (.listTargetsByRuleAsync request))))

(defn put-rule-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.PutRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutRuleRequest request]
    (-> this (.putRuleAsync request))))

(defn deactivate-event-source-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivateEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeactivateEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivateEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest request]
    (-> this (.deactivateEventSourceAsync request))))

(defn activate-event-source-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivateEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ActivateEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activateEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest request]
    (-> this (.activateEventSourceAsync request))))

(defn create-partner-event-source-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPartnerEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest request]
    (-> this (.createPartnerEventSourceAsync request))))

(defn put-partner-events-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPartnerEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutPartnerEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPartnerEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest request]
    (-> this (.putPartnerEventsAsync request))))

(defn list-partner-event-source-accounts-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPartnerEventSourceAccounts operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPartnerEventSourceAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest request]
    (-> this (.listPartnerEventSourceAccountsAsync request))))

(defn list-partner-event-sources-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPartnerEventSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPartnerEventSourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest request]
    (-> this (.listPartnerEventSourcesAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-event-bus-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DeleteEventBusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeleteEventBusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteEventBusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventBusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteEventBusRequest request]
    (-> this (.deleteEventBusAsync request))))

(defn disable-rule-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DisableRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DisableRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DisableRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DisableRuleRequest request]
    (-> this (.disableRuleAsync request))))

(defn describe-event-source-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribeEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest request]
    (-> this (.describeEventSourceAsync request))))

(defn list-rules-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRulesRequest request]
    (-> this (.listRulesAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-rule-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.DescribeRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribeRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeRuleRequest request]
    (-> this (.describeRuleAsync request))))

(defn list-event-buses-async
  "Description copied from interface: AmazonEventBridgeAsync

  request - `com.amazonaws.services.eventbridge.model.ListEventBusesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventBuses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListEventBusesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventBusesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventBusesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventBusesRequest request]
    (-> this (.listEventBusesAsync request))))

