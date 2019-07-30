(ns com.amazonaws.services.eventbridge.AmazonEventBridgeAsync
  "Interface for accessing Amazon EventBridge asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonEventBridgeAsync instead.



  Amazon EventBridge helps you to respond to state changes in your AWS resources. When your resources change state,
  they automatically send events into an event stream. You can create rules that match selected events in the stream
  and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For
  example, you can configure rules to:




  Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance
  enters the running state




  Direct specific API records from AWS CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential
  security or availability risks




  Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume




  For more information about the features of Amazon EventBridge, see the Amazon EventBridge User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.eventbridge AmazonEventBridgeAsync]))

(defn untag-resource-async
  "Removes one or more tags from the specified EventBridge resource. In EventBridge, rules can be tagged.

  untag-resource-request - `com.amazonaws.services.eventbridge.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn describe-partner-event-source-async
  "An SaaS partner can use this operation to list details about a partner event source that they have created.



   AWS customers do not use this operation. Instead, AWS customers can use DescribeEventSource to see details
   about a partner event source that is shared with them.

  describe-partner-event-source-request - `com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest describe-partner-event-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePartnerEventSourceAsync describe-partner-event-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribePartnerEventSourceRequest describe-partner-event-source-request]
    (-> this (.describePartnerEventSourceAsync describe-partner-event-source-request))))

(defn list-event-sources-async
  "You can use this to see all the partner event sources that have been shared with your AWS account. For more
   information about partner event sources, see CreateEventBus.



   This operation is run by AWS customers, not by SaaS partners.

  list-event-sources-request - `com.amazonaws.services.eventbridge.model.ListEventSourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListEventSourcesResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventSourcesRequest list-event-sources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventSourcesAsync list-event-sources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventSourcesRequest list-event-sources-request]
    (-> this (.listEventSourcesAsync list-event-sources-request))))

(defn create-event-bus-async
  "Creates a new event bus within your account. This can be a custom event bus which you can use to receive events
   from your own custom applications and services, or it can be a partner event bus which can be matched to a
   partner event source.



   This operation is used by AWS customers, not by SaaS partners.

  create-event-bus-request - `com.amazonaws.services.eventbridge.model.CreateEventBusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.CreateEventBusResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreateEventBusRequest create-event-bus-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventBusAsync create-event-bus-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreateEventBusRequest create-event-bus-request]
    (-> this (.createEventBusAsync create-event-bus-request))))

(defn list-rule-names-by-target-async
  "Lists the rules for the specified target. You can see which rules can invoke a specific target in your account.

  list-rule-names-by-target-request - `com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest list-rule-names-by-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRuleNamesByTargetAsync list-rule-names-by-target-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRuleNamesByTargetRequest list-rule-names-by-target-request]
    (-> this (.listRuleNamesByTargetAsync list-rule-names-by-target-request))))

(defn delete-partner-event-source-async
  "This operation is used by SaaS partners to delete a partner event source. AWS customers don't use this operation.


   When you delete an event source, the status of the corresponding partner event bus in the AWS customer account
   becomes DELETED.

  delete-partner-event-source-request - `com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest delete-partner-event-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePartnerEventSourceAsync delete-partner-event-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeletePartnerEventSourceRequest delete-partner-event-source-request]
    (-> this (.deletePartnerEventSourceAsync delete-partner-event-source-request))))

(defn enable-rule-async
  "Enables the specified rule. If the rule doesn't exist, the operation fails.


   When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a
   short period of time for changes to take effect.

  enable-rule-request - `com.amazonaws.services.eventbridge.model.EnableRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.EnableRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.EnableRuleRequest enable-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableRuleAsync enable-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.EnableRuleRequest enable-rule-request]
    (-> this (.enableRuleAsync enable-rule-request))))

(defn remove-permission-async
  "Revokes the permission of another AWS account to be able to put events to the specified event bus. Specify the
   account to revoke by the StatementId value that you associated with the account when you granted it
   permission with PutPermission. You can find the StatementId by using
   DescribeEventBus.

  remove-permission-request - `com.amazonaws.services.eventbridge.model.RemovePermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemovePermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemovePermissionRequest remove-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync remove-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemovePermissionRequest remove-permission-request]
    (-> this (.removePermissionAsync remove-permission-request))))

(defn put-targets-async
  "Adds the specified targets to the specified rule, or updates the targets if they're already associated with the
   rule.


   Targets are the resources that are invoked when a rule is triggered.


   You can configure the following as targets in EventBridge:




   EC2 instances




   SSM Run Command




   SSM Automation




   AWS Lambda functions




   Data streams in Amazon Kinesis Data Streams




   Data delivery streams in Amazon Kinesis Data Firehose




   Amazon ECS tasks




   AWS Step Functions state machines




   AWS Batch jobs




   AWS CodeBuild projects




   Pipelines in AWS CodePipeline




   Amazon Inspector assessment templates




   Amazon SNS topics




   Amazon SQS queues, including FIFO queues




   The default event bus of another AWS account




   Creating rules with built-in targets is supported only on the AWS Management Console. The built-in targets are
   EC2 CreateSnapshot API call, EC2 RebootInstances API call,
   EC2 StopInstances API call, and EC2 TerminateInstances API call.


   For some target types, PutTargets provides target-specific parameters. If the target is a Kinesis
   data stream, you can optionally specify which shard the event goes to by using the KinesisParameters
   argument. To invoke a command on multiple EC2 instances with one rule, you can use the
   RunCommandParameters field.


   To be able to make API calls against the resources that you own, Amazon EventBridge needs the appropriate
   permissions. For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies. For EC2
   instances, Kinesis data streams, and AWS Step Functions state machines, EventBridge relies on IAM roles that you
   specify in the RoleARN argument in PutTargets. For more information, see Authentication and Access Control in the Amazon EventBridge User Guide.


   If another AWS account is in the same Region and has granted you permission (using PutPermission),
   you can send events to that account. Set that account's event bus as a target of the rules in your account. To
   send the matched events to the other account, specify that account's event bus as the Arn value when
   you run PutTargets. If your account sends events to another account, your account is charged for
   each sent event. Each event sent to another account is charged as a custom event. The account receiving the event
   isn't charged. For more information, see Amazon EventBridge
   Pricing.


   If you're setting an event bus in another account as the target and that account granted permission to your
   account through an organization instead of directly by the account ID, you must specify a RoleArn
   with proper permissions in the Target structure. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon EventBridge User Guide.


   For more information about enabling cross-account events, see PutPermission.


   Input, InputPath, and InputTransformer are mutually exclusive and optional
   parameters of a target. When a rule is triggered due to a matched event:




   If none of the following arguments are specified for a target, the entire event is passed to the target in JSON
   format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is
   passed to the target).




   If Input is specified in the form of valid JSON, then the matched event is overridden with this
   constant.




   If InputPath is specified in the form of JSONPath (for example, $.detail), only the
   part of the event specified in the path is passed to the target (for example, only the detail part of the event
   is passed).




   If InputTransformer is specified, one or more specified JSONPaths are extracted from the event and
   used as values in a template that you specify as the input to the target.




   When you specify InputPath or InputTransformer, you must use JSON dot notation, not
   bracket notation.


   When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be
   immediately invoked. Allow a short period of time for changes to take effect.


   This action can partially fail if too many requests are made at the same time. If that happens,
   FailedEntryCount is nonzero in the response, and each entry in FailedEntries provides
   the ID of the failed target and the error code.

  put-targets-request - `com.amazonaws.services.eventbridge.model.PutTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutTargetsRequest put-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putTargetsAsync put-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutTargetsRequest put-targets-request]
    (-> this (.putTargetsAsync put-targets-request))))

(defn test-event-pattern-async
  "Tests whether the specified event pattern matches the provided event.


   Most services in AWS treat : or / as the same character in Amazon Resource Names
   (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN
   characters when creating event patterns so that they match the ARN syntax in the event that you want to match.

  test-event-pattern-request - `com.amazonaws.services.eventbridge.model.TestEventPatternRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestEventPattern operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.TestEventPatternResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TestEventPatternRequest test-event-pattern-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testEventPatternAsync test-event-pattern-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TestEventPatternRequest test-event-pattern-request]
    (-> this (.testEventPatternAsync test-event-pattern-request))))

(defn describe-event-bus-async
  "Displays details about an event bus in your account. This can include the external AWS accounts that are
   permitted to write events to your default event bus, and the associated policy. For custom event buses and
   partner event buses, it displays the name, ARN, policy, state, and creation time.


   To enable your account to receive events from other accounts on its default event bus, use PutPermission.


   For more information about partner event buses, see CreateEventBus.

  describe-event-bus-request - `com.amazonaws.services.eventbridge.model.DescribeEventBusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribeEventBusResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventBusRequest describe-event-bus-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventBusAsync describe-event-bus-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventBusRequest describe-event-bus-request]
    (-> this (.describeEventBusAsync describe-event-bus-request))))

(defn remove-targets-async
  "Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be
   invoked.


   When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow
   a short period of time for changes to take effect.


   This action can partially fail if too many requests are made at the same time. If that happens,
   FailedEntryCount is non-zero in the response and each entry in FailedEntries provides
   the ID of the failed target and the error code.

  remove-targets-request - `com.amazonaws.services.eventbridge.model.RemoveTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.RemoveTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemoveTargetsRequest remove-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTargetsAsync remove-targets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.RemoveTargetsRequest remove-targets-request]
    (-> this (.removeTargetsAsync remove-targets-request))))

(defn put-events-async
  "Sends custom events to EventBridge so that they can be matched to rules. These events can be from your custom
   applications and services.

  put-events-request - `com.amazonaws.services.eventbridge.model.PutEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutEventsResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutEventsRequest put-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEventsAsync put-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutEventsRequest put-events-request]
    (-> this (.putEventsAsync put-events-request))))

(defn put-permission-async
  "Running PutPermission permits the specified AWS account or AWS organization to put events to the
   specified event bus. Rules in your account are triggered by these events arriving to an event bus in your
   account.


   For another account to send events to your account, that external account must have a rule with your account's
   event bus as a target.


   To enable multiple AWS accounts to put events to an event bus, run PutPermission once for each of
   these accounts. Or, if all the accounts are members of the same AWS organization, you can run
   PutPermission once specifying Principal as \"*\" and specifying the AWS organization ID
   in Condition, to grant permissions to all accounts in that organization.


   If you grant permissions using an organization, then accounts in that organization must specify a
   RoleArn with proper permissions when they use PutTarget to add your account's event bus
   as a target. For more information, see Sending and Receiving Events Between AWS Accounts in the Amazon EventBridge User Guide.


   The permission policy on an event bus can't exceed 10 KB in size.

  put-permission-request - `com.amazonaws.services.eventbridge.model.PutPermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPermission operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutPermissionResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPermissionRequest put-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPermissionAsync put-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPermissionRequest put-permission-request]
    (-> this (.putPermissionAsync put-permission-request))))

(defn delete-rule-async
  "Deletes the specified rule.


   Before you can delete the rule, you must remove all targets, using RemoveTargets.


   When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time
   for changes to take effect.


   Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by
   those other AWS services to support functionality in those services. You can delete these rules using the
   Force option, but you should do so only if you're sure that the other service isn't still using that
   rule.

  delete-rule-request - `com.amazonaws.services.eventbridge.model.DeleteRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeleteRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteRuleRequest delete-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRuleAsync delete-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteRuleRequest delete-rule-request]
    (-> this (.deleteRuleAsync delete-rule-request))))

(defn list-targets-by-rule-async
  "Lists the targets assigned to the specified rule.

  list-targets-by-rule-request - `com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsByRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListTargetsByRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest list-targets-by-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsByRuleAsync list-targets-by-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTargetsByRuleRequest list-targets-by-rule-request]
    (-> this (.listTargetsByRuleAsync list-targets-by-rule-request))))

(defn put-rule-async
  "Creates or updates the specified rule. Rules are enabled by default or based on value of the state. You can
   disable a rule using DisableRule.


   A single rule watches for events from a single event bus. Events generated by AWS services go to your account's
   default event bus. Events generated by SaaS partner services or applications go to the matching partner event
   bus. If you have custom applications or services, you can specify whether their events go to your default event
   bus or a custom event bus that you have created. For more information, see CreateEventBus.


   If you're updating an existing rule, the rule is replaced with what you specify in this PutRule
   command. If you omit arguments in PutRule, the old values for those arguments aren't kept. Instead,
   they're replaced with null values.


   When you create or update a rule, incoming events might not immediately start matching to new or updated rules.
   Allow a short period of time for changes to take effect.


   A rule must contain at least an EventPattern or ScheduleExpression. Rules with
   EventPatterns are triggered when a matching event is observed. Rules with
   ScheduleExpressions self-trigger based on the given schedule. A rule can have both an
   EventPattern and a ScheduleExpression, in which case the rule triggers on matching
   events as well as on a schedule.


   When you initially create a rule, you can optionally assign one or more tags to the rule. Tags can help you
   organize and categorize your resources. You can also use them to scope user permissions, by granting a user
   permission to access or change only rules with certain tag values. To use the PutRule operation and
   assign tags, you must have both the events:PutRule and events:TagResource permissions.


   If you are updating an existing rule, any tags you specify in the PutRule operation are ignored. To
   update the tags of an existing rule, use TagResource and UntagResource.


   Most services in AWS treat : or / as the same character in Amazon Resource Names
   (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN
   characters when creating event patterns so that they match the ARN syntax in the event that you want to match.


   In EventBridge, you could create rules that lead to infinite loops, where a rule is fired repeatedly. For
   example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the
   desired state. If you don't write the rule carefully, the subsequent change to the ACLs fires the rule again,
   creating an infinite loop.


   To prevent this, write the rules so that the triggered actions don't refire the same rule. For example, your rule
   could fire only if ACLs are found to be in a bad state, instead of after any change.


   An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which
   alerts you when charges exceed your specified limit. For more information, see Managing Your
   Costs with Budgets.

  put-rule-request - `com.amazonaws.services.eventbridge.model.PutRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutRuleRequest put-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRuleAsync put-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutRuleRequest put-rule-request]
    (-> this (.putRuleAsync put-rule-request))))

(defn deactivate-event-source-async
  "An AWS customer uses this operation to temporarily stop receiving events from the specified partner event source.
   The matching event bus isn't deleted.


   When you deactivate a partner event source, the source goes into PENDING state. If it remains in
   PENDING state for more than two weeks, it's deleted.


   To activate a deactivated partner event source, use ActivateEventSource.

  deactivate-event-source-request - `com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivateEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeactivateEventSourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest deactivate-event-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivateEventSourceAsync deactivate-event-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeactivateEventSourceRequest deactivate-event-source-request]
    (-> this (.deactivateEventSourceAsync deactivate-event-source-request))))

(defn activate-event-source-async
  "Activates a partner event source that has been deactivated. Once activated, your matching event bus will start
   receiving events from the event source.



   This operation is performed by AWS customers, not by SaaS partners.

  activate-event-source-request - `com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ActivateEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ActivateEventSourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest activate-event-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.activateEventSourceAsync activate-event-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ActivateEventSourceRequest activate-event-source-request]
    (-> this (.activateEventSourceAsync activate-event-source-request))))

(defn create-partner-event-source-async
  "Called by an SaaS partner to create a partner event source.



   This operation is not used by AWS customers.



   Each partner event source can be used by one AWS account to create a matching partner event bus in that AWS
   account. A SaaS partner must create one partner event source for each AWS account that wants to receive those
   event types.


   A partner event source creates events based on resources in the SaaS partner's service or application.


   An AWS account that creates a partner event bus that matches the partner event source can use that event bus to
   receive events from the partner, and then process them using AWS Events rules and targets.


   Partner event source names follow this format:


   aws.partner/partner_name/event_namespace/event_name




   partner_name is determined during partner registration and identifies the partner to AWS customers.




   For event_namespace, we recommend that partners use a string that identifies the AWS customer within the
   partner's system. This should not be the customer's AWS account ID.




   event_name is determined by the partner, and should uniquely identify an event-generating resource within
   the partner system. This should help AWS customers decide whether to create an event bus to receive these events.

  create-partner-event-source-request - `com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePartnerEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest create-partner-event-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPartnerEventSourceAsync create-partner-event-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.CreatePartnerEventSourceRequest create-partner-event-source-request]
    (-> this (.createPartnerEventSourceAsync create-partner-event-source-request))))

(defn put-partner-events-async
  "This is used by SaaS partners to write events to a customer's partner event bus.



   AWS customers do not use this operation. Instead, AWS customers can use PutEvents to write custom events
   from their own applications to an event bus.

  put-partner-events-request - `com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPartnerEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.PutPartnerEventsResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest put-partner-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPartnerEventsAsync put-partner-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.PutPartnerEventsRequest put-partner-events-request]
    (-> this (.putPartnerEventsAsync put-partner-events-request))))

(defn list-partner-event-source-accounts-async
  "An SaaS partner can use this operation to display the AWS account ID that a particular partner event source name
   is associated with.



   This operation is used by SaaS partners, not by AWS customers.

  list-partner-event-source-accounts-request - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPartnerEventSourceAccounts operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest list-partner-event-source-accounts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPartnerEventSourceAccountsAsync list-partner-event-source-accounts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourceAccountsRequest list-partner-event-source-accounts-request]
    (-> this (.listPartnerEventSourceAccountsAsync list-partner-event-source-accounts-request))))

(defn list-partner-event-sources-async
  "An SaaS partner can use this operation to list all the partner event source names that they have created.



   This operation is not used by AWS customers.

  list-partner-event-sources-request - `com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPartnerEventSources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest list-partner-event-sources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPartnerEventSourcesAsync list-partner-event-sources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListPartnerEventSourcesRequest list-partner-event-sources-request]
    (-> this (.listPartnerEventSourcesAsync list-partner-event-sources-request))))

(defn list-tags-for-resource-async
  "Displays the tags associated with an EventBridge resource. In EventBridge, rules can be tagged.

  list-tags-for-resource-request - `com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn delete-event-bus-async
  "Deletes the specified custom event bus or partner event bus. All rules associated with this event bus are also
   deleted. You can't delete your account's default event bus.



   This operation is performed by AWS customers, not by SaaS partners.

  delete-event-bus-request - `com.amazonaws.services.eventbridge.model.DeleteEventBusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventBus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DeleteEventBusResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteEventBusRequest delete-event-bus-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventBusAsync delete-event-bus-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DeleteEventBusRequest delete-event-bus-request]
    (-> this (.deleteEventBusAsync delete-event-bus-request))))

(defn disable-rule-async
  "Disables the specified rule. A disabled rule won't match any events and won't self-trigger if it has a schedule
   expression.


   When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of
   time for changes to take effect.

  disable-rule-request - `com.amazonaws.services.eventbridge.model.DisableRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DisableRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DisableRuleRequest disable-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableRuleAsync disable-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DisableRuleRequest disable-rule-request]
    (-> this (.disableRuleAsync disable-rule-request))))

(defn describe-event-source-async
  "This operation lists details about a partner event source that is shared with your account.



   This operation is run by AWS customers, not by SaaS partners.

  describe-event-source-request - `com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribeEventSourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest describe-event-source-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSourceAsync describe-event-source-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeEventSourceRequest describe-event-source-request]
    (-> this (.describeEventSourceAsync describe-event-source-request))))

(defn list-rules-async
  "Lists your EventBridge rules. You can either list all the rules or provide a prefix to match to the rule names.


   ListRules doesn't list the targets of a rule. To see the targets associated with a rule, use
   ListTargetsByRule.

  list-rules-request - `com.amazonaws.services.eventbridge.model.ListRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListRulesResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRulesRequest list-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRulesAsync list-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListRulesRequest list-rules-request]
    (-> this (.listRulesAsync list-rules-request))))

(defn tag-resource-async
  "Assigns one or more tags (key-value pairs) to the specified EventBridge resource. Tags can help you organize and
   categorize your resources. You can also use them to scope user permissions by granting a user permission to
   access or change only resources with certain tag values. In EventBridge, rules can be tagged.


   Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.


   You can use the TagResource action with a rule that already has tags. If you specify a new tag key
   for the rule, this tag is appended to the list of tags associated with the rule. If you specify a tag key that is
   already associated with the rule, the new tag value that you specify replaces the previous value for that tag.


   You can associate as many as 50 tags with a resource.

  tag-resource-request - `com.amazonaws.services.eventbridge.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-rule-async
  "Describes the specified rule.


   DescribeRule doesn't list the targets of a rule. To see the targets associated with a rule, use
   ListTargetsByRule.

  describe-rule-request - `com.amazonaws.services.eventbridge.model.DescribeRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.DescribeRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeRuleRequest describe-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRuleAsync describe-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.DescribeRuleRequest describe-rule-request]
    (-> this (.describeRuleAsync describe-rule-request))))

(defn list-event-buses-async
  "Lists all the event buses in your account, including the default event bus, custom event buses, and partner event
   buses.



   This operation is run by AWS customers, not by SaaS partners.

  list-event-buses-request - `com.amazonaws.services.eventbridge.model.ListEventBusesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEventBuses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.eventbridge.model.ListEventBusesResult>`"
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventBusesRequest list-event-buses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEventBusesAsync list-event-buses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonEventBridgeAsync this ^com.amazonaws.services.eventbridge.model.ListEventBusesRequest list-event-buses-request]
    (-> this (.listEventBusesAsync list-event-buses-request))))

