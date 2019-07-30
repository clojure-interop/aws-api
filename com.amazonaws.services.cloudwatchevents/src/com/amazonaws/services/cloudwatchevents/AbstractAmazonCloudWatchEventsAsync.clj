(ns com.amazonaws.services.cloudwatchevents.AbstractAmazonCloudWatchEventsAsync
  "Abstract implementation of AmazonCloudWatchEventsAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatchevents AbstractAmazonCloudWatchEventsAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn describe-partner-event-source-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePartnerEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribePartnerEventSourceRequest request]
    (-> this (.describePartnerEventSourceAsync request))))

(defn list-event-sources-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListEventSourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListEventSourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListEventSourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventSourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListEventSourcesRequest request]
    (-> this (.listEventSourcesAsync request))))

(defn create-event-bus-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.CreateEventBusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.CreateEventBusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.CreateEventBusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventBusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.CreateEventBusRequest request]
    (-> this (.createEventBusAsync request))))

(defn list-rule-names-by-target-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRuleNamesByTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListRuleNamesByTargetRequest request]
    (-> this (.listRuleNamesByTargetAsync request))))

(defn delete-partner-event-source-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePartnerEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeletePartnerEventSourceRequest request]
    (-> this (.deletePartnerEventSourceAsync request))))

(defn enable-rule-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.EnableRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.EnableRuleRequest request]
    (-> this (.enableRuleAsync request))))

(defn remove-permission-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemovePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.RemovePermissionRequest request]
    (-> this (.removePermissionAsync request))))

(defn put-targets-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.PutTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutTargetsRequest request]
    (-> this (.putTargetsAsync request))))

(defn test-event-pattern-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestEventPattern operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.TestEventPatternResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testEventPatternAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.TestEventPatternRequest request]
    (-> this (.testEventPatternAsync request))))

(defn describe-event-bus-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DescribeEventBusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventBusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribeEventBusRequest request]
    (-> this (.describeEventBusAsync request))))

(defn remove-targets-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.RemoveTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.RemoveTargetsRequest request]
    (-> this (.removeTargetsAsync request))))

(defn put-events-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.PutEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutEventsRequest request]
    (-> this (.putEventsAsync request))))

(defn put-permission-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.PutPermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutPermissionRequest request]
    (-> this (.putPermissionAsync request))))

(defn delete-rule-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DeleteRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeleteRuleRequest request]
    (-> this (.deleteRuleAsync request))))

(defn list-targets-by-rule-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsByRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsByRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListTargetsByRuleRequest request]
    (-> this (.listTargetsByRuleAsync request))))

(defn put-rule-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.PutRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.PutRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutRuleRequest request]
    (-> this (.putRuleAsync request))))

(defn deactivate-event-source-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivateEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivateEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeactivateEventSourceRequest request]
    (-> this (.deactivateEventSourceAsync request))))

(defn activate-event-source-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivateEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activateEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ActivateEventSourceRequest request]
    (-> this (.activateEventSourceAsync request))))

(defn create-partner-event-source-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPartnerEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.CreatePartnerEventSourceRequest request]
    (-> this (.createPartnerEventSourceAsync request))))

(defn put-partner-events-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPartnerEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPartnerEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.PutPartnerEventsRequest request]
    (-> this (.putPartnerEventsAsync request))))

(defn list-partner-event-source-accounts-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPartnerEventSourceAccounts operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPartnerEventSourceAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourceAccountsRequest request]
    (-> this (.listPartnerEventSourceAccountsAsync request))))

(defn list-partner-event-sources-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPartnerEventSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPartnerEventSourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListPartnerEventSourcesRequest request]
    (-> this (.listPartnerEventSourcesAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn delete-event-bus-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DeleteEventBusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DeleteEventBusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeleteEventBusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventBusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DeleteEventBusRequest request]
    (-> this (.deleteEventBusAsync request))))

(defn disable-rule-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DisableRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DisableRuleRequest request]
    (-> this (.disableRuleAsync request))))

(defn describe-event-source-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribeEventSourceRequest request]
    (-> this (.describeEventSourceAsync request))))

(defn list-rules-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListRulesRequest request]
    (-> this (.listRulesAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-rule-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.DescribeRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.DescribeRuleRequest request]
    (-> this (.describeRuleAsync request))))

(defn list-event-buses-async
  "Description copied from interface: AmazonCloudWatchEventsAsync

  request - `com.amazonaws.services.cloudwatchevents.model.ListEventBusesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventBuses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatchevents.model.ListEventBusesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListEventBusesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventBusesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchEventsAsync this ^com.amazonaws.services.cloudwatchevents.model.ListEventBusesRequest request]
    (-> this (.listEventBusesAsync request))))

