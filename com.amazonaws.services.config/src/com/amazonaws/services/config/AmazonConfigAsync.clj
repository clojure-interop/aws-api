(ns com.amazonaws.services.config.AmazonConfigAsync
  "Interface for accessing Config Service asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonConfigAsync instead.


  AWS Config

  AWS Config provides a way to keep track of the configurations of all the AWS resources associated with your AWS
  account. You can use AWS Config to get the current and historical configurations of each AWS resource and also to get
  information about the relationship between the resources. An AWS resource can be an Amazon Compute Cloud (Amazon EC2)
  instance, an Elastic Block Store (EBS) volume, an elastic network Interface (ENI), or a security group. For a
  complete list of resources currently supported by AWS Config, see Supported AWS Resources.


  You can access and manage AWS Config through the AWS Management Console, the AWS Command Line Interface (AWS CLI),
  the AWS Config API, or the AWS SDKs for AWS Config. This reference guide contains documentation for the AWS Config
  API and the AWS CLI commands that you can use to manage AWS Config. The AWS Config API uses the Signature Version 4
  protocol for signing requests. For more information about how to sign a request with this protocol, see Signature Version 4 Signing
  Process. For detailed information about AWS Config features and their associated actions or commands, as well as
  how to work with AWS Management Console, see What Is AWS Config in the
  AWS Config Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.config AmazonConfigAsync]))

(defn untag-resource-async
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.config.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-compliance-summary-by-config-rule-async
  "Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.

  get-compliance-summary-by-config-rule-request - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceSummaryByConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest get-compliance-summary-by-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceSummaryByConfigRuleAsync get-compliance-summary-by-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest get-compliance-summary-by-config-rule-request]
    (-> this (.getComplianceSummaryByConfigRuleAsync get-compliance-summary-by-config-rule-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.getComplianceSummaryByConfigRuleAsync))))

(defn get-compliance-summary-by-resource-type-async
  "Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
   more resource types to get these numbers for each resource type. The maximum number returned is 100.

  get-compliance-summary-by-resource-type-request - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceSummaryByResourceType operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest get-compliance-summary-by-resource-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceSummaryByResourceTypeAsync get-compliance-summary-by-resource-type-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest get-compliance-summary-by-resource-type-request]
    (-> this (.getComplianceSummaryByResourceTypeAsync get-compliance-summary-by-resource-type-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.getComplianceSummaryByResourceTypeAsync))))

(defn describe-retention-configurations-async
  "Returns the details of one or more retention configurations. If the retention configuration name is not
   specified, this action returns the details for all the retention configurations for that account.



   Currently, AWS Config supports only one retention configuration per region in your account.

  describe-retention-configurations-request - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRetentionConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest describe-retention-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRetentionConfigurationsAsync describe-retention-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest describe-retention-configurations-request]
    (-> this (.describeRetentionConfigurationsAsync describe-retention-configurations-request))))

(defn select-resource-config-async
  "Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and
   returns resource configurations matching the properties.


   For more information about query components, see the  Query Components
    section in the AWS Config Developer Guide.

  select-resource-config-request - `com.amazonaws.services.config.model.SelectResourceConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SelectResourceConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.SelectResourceConfigResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.SelectResourceConfigRequest select-resource-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.selectResourceConfigAsync select-resource-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.SelectResourceConfigRequest select-resource-config-request]
    (-> this (.selectResourceConfigAsync select-resource-config-request))))

(defn put-configuration-recorder-async
  "Creates a new configuration recorder to record the selected resource configurations.


   You can use this action to change the role roleARN or the recordingGroup of an existing
   recorder. To change the role, call the action on the existing configuration recorder and specify a role.



   Currently, you can specify only one configuration recorder per region in your account.


   If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is
   to record all supported resource types.

  put-configuration-recorder-request - The input for the PutConfigurationRecorder action. - `com.amazonaws.services.config.model.PutConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationRecorderRequest put-configuration-recorder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationRecorderAsync put-configuration-recorder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationRecorderRequest put-configuration-recorder-request]
    (-> this (.putConfigurationRecorderAsync put-configuration-recorder-request))))

(defn describe-configuration-aggregators-async
  "Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified,
   this action returns the details for all the configuration aggregators associated with the account.

  describe-configuration-aggregators-request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationAggregators operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest describe-configuration-aggregators-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAggregatorsAsync describe-configuration-aggregators-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest describe-configuration-aggregators-request]
    (-> this (.describeConfigurationAggregatorsAsync describe-configuration-aggregators-request))))

(defn describe-configuration-recorders-async
  "Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
   this action returns the details for all configuration recorders associated with the account.



   Currently, you can specify only one configuration recorder per region in your account.

  describe-configuration-recorders-request - The input for the DescribeConfigurationRecorders action. - `com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRecorders operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationRecordersResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest describe-configuration-recorders-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRecordersAsync describe-configuration-recorders-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest describe-configuration-recorders-request]
    (-> this (.describeConfigurationRecordersAsync describe-configuration-recorders-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeConfigurationRecordersAsync))))

(defn describe-remediation-execution-status-async
  "Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when
   steps for the remediation execution occur, and any error messages for steps that have failed. When you specify
   the limit and the next token, you receive a paginated response.

  describe-remediation-execution-status-request - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRemediationExecutionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest describe-remediation-execution-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRemediationExecutionStatusAsync describe-remediation-execution-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest describe-remediation-execution-status-request]
    (-> this (.describeRemediationExecutionStatusAsync describe-remediation-execution-status-request))))

(defn get-aggregate-discovered-resource-counts-async
  "Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can
   request the resource counts by providing filters and GroupByKey.


   For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the
   count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a
   GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.

  get-aggregate-discovered-resource-counts-request - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateDiscoveredResourceCounts operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest get-aggregate-discovered-resource-counts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateDiscoveredResourceCountsAsync get-aggregate-discovered-resource-counts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest get-aggregate-discovered-resource-counts-request]
    (-> this (.getAggregateDiscoveredResourceCountsAsync get-aggregate-discovered-resource-counts-request))))

(defn describe-aggregation-authorizations-async
  "Returns a list of authorizations granted to various aggregator accounts and regions.

  describe-aggregation-authorizations-request - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAggregationAuthorizations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest describe-aggregation-authorizations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAggregationAuthorizationsAsync describe-aggregation-authorizations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest describe-aggregation-authorizations-request]
    (-> this (.describeAggregationAuthorizationsAsync describe-aggregation-authorizations-request))))

(defn get-resource-config-history-async
  "Returns a list of configuration items for the specified resource. The list contains details about each state of
   the resource during the specified time interval. If you specified a retention period to retain your
   ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config
   returns the ConfigurationItems for the specified retention period.


   The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can
   customize this number with the limit parameter. The response includes a nextToken
   string. To get the next page of results, run the request again and specify the string for the
   nextToken parameter.



   Each call to the API is limited to span a duration of seven days. It is likely that the number of records
   returned is smaller than the specified limit. In such cases, you can make another call, using the
   nextToken.

  get-resource-config-history-request - The input for the GetResourceConfigHistory action. - `com.amazonaws.services.config.model.GetResourceConfigHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceConfigHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetResourceConfigHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetResourceConfigHistoryRequest get-resource-config-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceConfigHistoryAsync get-resource-config-history-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetResourceConfigHistoryRequest get-resource-config-history-request]
    (-> this (.getResourceConfigHistoryAsync get-resource-config-history-request))))

(defn get-aggregate-compliance-details-by-config-rule-async
  "Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results
   indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each
   resource complies with the rule.



   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next
   page.

  get-aggregate-compliance-details-by-config-rule-request - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateComplianceDetailsByConfigRule operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest get-aggregate-compliance-details-by-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateComplianceDetailsByConfigRuleAsync get-aggregate-compliance-details-by-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest get-aggregate-compliance-details-by-config-rule-request]
    (-> this (.getAggregateComplianceDetailsByConfigRuleAsync get-aggregate-compliance-details-by-config-rule-request))))

(defn describe-pending-aggregation-requests-async
  "Returns a list of all pending aggregation requests.

  describe-pending-aggregation-requests-request - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingAggregationRequests operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest describe-pending-aggregation-requests-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingAggregationRequestsAsync describe-pending-aggregation-requests-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest describe-pending-aggregation-requests-request]
    (-> this (.describePendingAggregationRequestsAsync describe-pending-aggregation-requests-request))))

(defn put-config-rule-async
  "Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired
   configurations.


   You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a
   rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config
   provides.


   If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule
   invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS
   Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN
   for the SourceIdentifier key. This key is part of the Source object, which is part of
   the ConfigRule object.


   If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier
   key. To reference AWS managed Config rule identifiers, see About AWS
   Managed Config Rules.


   For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do
   not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS
   Config for new rules.


   If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName,
   ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in
   this request.


   The maximum number of rules that AWS Config supports is 150.


   For information about requesting a rule limit increase, see AWS Config Limits
   in the AWS General Reference Guide.


   For more information about developing and using AWS Config rules, see Evaluating AWS Resource
   Configurations with AWS Config in the AWS Config Developer Guide.

  put-config-rule-request - `com.amazonaws.services.config.model.PutConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigRuleRequest put-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigRuleAsync put-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigRuleRequest put-config-rule-request]
    (-> this (.putConfigRuleAsync put-config-rule-request))))

(defn start-remediation-execution-async
  "Runs an on-demand remediation for the specified AWS Config rules against the last known remediation
   configuration. It runs an execution against the current state of your resources. Remediation execution is
   asynchronous.


   You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified
   resource keys must complete before you can call the API again.

  start-remediation-execution-request - `com.amazonaws.services.config.model.StartRemediationExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartRemediationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StartRemediationExecutionResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StartRemediationExecutionRequest start-remediation-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startRemediationExecutionAsync start-remediation-execution-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StartRemediationExecutionRequest start-remediation-execution-request]
    (-> this (.startRemediationExecutionAsync start-remediation-execution-request))))

(defn list-aggregate-discovered-resources-async
  "Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource
   type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom
   resource name, source account, and source region. You can narrow the results to include only resources that have
   specific resource IDs, or a resource name, or source account ID, or source region.


   For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type
   AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910
   and region us-east-1.

  list-aggregate-discovered-resources-request - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAggregateDiscoveredResources operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest list-aggregate-discovered-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAggregateDiscoveredResourcesAsync list-aggregate-discovered-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest list-aggregate-discovered-resources-request]
    (-> this (.listAggregateDiscoveredResourcesAsync list-aggregate-discovered-resources-request))))

(defn delete-config-rule-async
  "Deletes the specified AWS Config rule and all of its evaluation results.


   AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a
   rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request
   for the rule, you will receive a ResourceInUseException.


   You can check the state of a rule by using the DescribeConfigRules request.

  delete-config-rule-request - `com.amazonaws.services.config.model.DeleteConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigRuleRequest delete-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigRuleAsync delete-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigRuleRequest delete-config-rule-request]
    (-> this (.deleteConfigRuleAsync delete-config-rule-request))))

(defn get-aggregate-config-rule-compliance-summary-async
  "Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.



   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
   page.

  get-aggregate-config-rule-compliance-summary-request - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateConfigRuleComplianceSummary operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest get-aggregate-config-rule-compliance-summary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateConfigRuleComplianceSummaryAsync get-aggregate-config-rule-compliance-summary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest get-aggregate-config-rule-compliance-summary-request]
    (-> this (.getAggregateConfigRuleComplianceSummaryAsync get-aggregate-config-rule-compliance-summary-request))))

(defn batch-get-aggregate-resource-config-async
  "Returns the current configuration items for resources that are present in your AWS Config aggregator. The
   operation also returns a list of resources that are not processed in the current request. If there are no
   unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.





   The API does not return results for deleted resources.




   The API does not return tags and relationships.

  batch-get-aggregate-resource-config-request - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetAggregateResourceConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest batch-get-aggregate-resource-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetAggregateResourceConfigAsync batch-get-aggregate-resource-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest batch-get-aggregate-resource-config-request]
    (-> this (.batchGetAggregateResourceConfigAsync batch-get-aggregate-resource-config-request))))

(defn describe-compliance-by-config-rule-async
  "Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns
   the number of AWS resources that do not comply with the rule.


   A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these
   resources do not comply.


   If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This
   result might indicate one of the following conditions:




   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
   DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and
   LastFailedInvocationTime.




   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you
   assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule
   is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations
   permission.




   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can
   occur if the resources were deleted or removed from the rule's scope.

  describe-compliance-by-config-rule-request - `com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComplianceByConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest describe-compliance-by-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComplianceByConfigRuleAsync describe-compliance-by-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest describe-compliance-by-config-rule-request]
    (-> this (.describeComplianceByConfigRuleAsync describe-compliance-by-config-rule-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeComplianceByConfigRuleAsync))))

(defn start-config-rules-evaluation-async
  "Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the
   resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working
   as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your
   resources. It re-runs an evaluation against the last known state of your resources.


   You can specify up to 25 AWS Config rules per request.


   An existing StartConfigRulesEvaluation call for the specified rules must complete before you can
   call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a
   ConfigRuleEvaluationStarted notification when the evaluation starts.



   You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When
   you create a rule, AWS Config evaluates your resources against the rule automatically.



   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the
   following example:




   You have a custom rule that evaluates your IAM resources every 24 hours.




   You update your Lambda function to add additional conditions to your rule.




   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.




   AWS Config invokes your Lambda function and evaluates your IAM resources.




   Your custom rule will still run periodic evaluations every 24 hours.

  start-config-rules-evaluation-request - `com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartConfigRulesEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StartConfigRulesEvaluationResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest start-config-rules-evaluation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startConfigRulesEvaluationAsync start-config-rules-evaluation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest start-config-rules-evaluation-request]
    (-> this (.startConfigRulesEvaluationAsync start-config-rules-evaluation-request))))

(defn delete-configuration-aggregator-async
  "Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.

  delete-configuration-aggregator-request - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationAggregator operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest delete-configuration-aggregator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationAggregatorAsync delete-configuration-aggregator-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest delete-configuration-aggregator-request]
    (-> this (.deleteConfigurationAggregatorAsync delete-configuration-aggregator-request))))

(defn delete-retention-configuration-async
  "Deletes the retention configuration.

  delete-retention-configuration-request - `com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRetentionConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteRetentionConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest delete-retention-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRetentionConfigurationAsync delete-retention-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest delete-retention-configuration-request]
    (-> this (.deleteRetentionConfigurationAsync delete-retention-configuration-request))))

(defn describe-organization-config-rules-async
  "describe-organization-config-rules-request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganizationConfigRules operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest describe-organization-config-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationConfigRulesAsync describe-organization-config-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest describe-organization-config-rules-request]
    (-> this (.describeOrganizationConfigRulesAsync describe-organization-config-rules-request))))

(defn get-discovered-resource-counts-async
  "Returns the resource types, the number of each resource type, and the total number of resources that AWS Config
   is recording in this region for your AWS account.


   Example




   AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20
   IAM users, and 15 S3 buckets.




   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource
   types.




   AWS Config returns the following:




   The resource types (EC2 instances, IAM users, and S3 buckets).




   The number of each resource type (25, 20, and 15).




   The total number of all resources (60).






   The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can
   customize this number with the limit parameter. The response includes a nextToken
   string. To get the next page of results, run the request again and specify the string for the
   nextToken parameter.



   If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource
   counts in the following situations:




   You are a new AWS Config customer.




   You just enabled resource recording.




   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry
   the GetDiscoveredResourceCounts action.

  get-discovered-resource-counts-request - `com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiscoveredResourceCounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest get-discovered-resource-counts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiscoveredResourceCountsAsync get-discovered-resource-counts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest get-discovered-resource-counts-request]
    (-> this (.getDiscoveredResourceCountsAsync get-discovered-resource-counts-request))))

(defn delete-aggregation-authorization-async
  "Deletes the authorization granted to the specified configuration aggregator account in a specified region.

  delete-aggregation-authorization-request - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAggregationAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest delete-aggregation-authorization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAggregationAuthorizationAsync delete-aggregation-authorization-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest delete-aggregation-authorization-request]
    (-> this (.deleteAggregationAuthorizationAsync delete-aggregation-authorization-request))))

(defn start-configuration-recorder-async
  "Starts recording configurations of the AWS resources you have selected to record in your AWS account.


   You must have created at least one delivery channel to successfully start the configuration recorder.

  start-configuration-recorder-request - The input for the StartConfigurationRecorder action. - `com.amazonaws.services.config.model.StartConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StartConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigurationRecorderRequest start-configuration-recorder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startConfigurationRecorderAsync start-configuration-recorder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigurationRecorderRequest start-configuration-recorder-request]
    (-> this (.startConfigurationRecorderAsync start-configuration-recorder-request))))

(defn describe-delivery-channel-status-async
  "Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
   returns the current status of all delivery channels associated with the account.



   Currently, you can specify only one delivery channel per region in your account.

  describe-delivery-channel-status-request - The input for the DeliveryChannelStatus action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeliveryChannelStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest describe-delivery-channel-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeliveryChannelStatusAsync describe-delivery-channel-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest describe-delivery-channel-status-request]
    (-> this (.describeDeliveryChannelStatusAsync describe-delivery-channel-status-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeDeliveryChannelStatusAsync))))

(defn get-compliance-details-by-config-rule-async
  "Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
   evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.

  get-compliance-details-by-config-rule-request - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceDetailsByConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest get-compliance-details-by-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceDetailsByConfigRuleAsync get-compliance-details-by-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest get-compliance-details-by-config-rule-request]
    (-> this (.getComplianceDetailsByConfigRuleAsync get-compliance-details-by-config-rule-request))))

(defn put-organization-config-rule-async
  "put-organization-config-rule-request - `com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutOrganizationConfigRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutOrganizationConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest put-organization-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putOrganizationConfigRuleAsync put-organization-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest put-organization-config-rule-request]
    (-> this (.putOrganizationConfigRuleAsync put-organization-config-rule-request))))

(defn delete-evaluation-results-async
  "Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per
   request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start
   evaluating your AWS resources against the rule.

  delete-evaluation-results-request - `com.amazonaws.services.config.model.DeleteEvaluationResultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEvaluationResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteEvaluationResultsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteEvaluationResultsRequest delete-evaluation-results-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEvaluationResultsAsync delete-evaluation-results-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteEvaluationResultsRequest delete-evaluation-results-request]
    (-> this (.deleteEvaluationResultsAsync delete-evaluation-results-request))))

(defn get-aggregate-resource-config-async
  "Returns configuration item that is aggregated for your specific resource in a specific source account and region.

  get-aggregate-resource-config-request - `com.amazonaws.services.config.model.GetAggregateResourceConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateResourceConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateResourceConfigResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateResourceConfigRequest get-aggregate-resource-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateResourceConfigAsync get-aggregate-resource-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateResourceConfigRequest get-aggregate-resource-config-request]
    (-> this (.getAggregateResourceConfigAsync get-aggregate-resource-config-request))))

(defn get-organization-config-rule-detailed-status-async
  "get-organization-config-rule-detailed-status-request - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOrganizationConfigRuleDetailedStatus operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest get-organization-config-rule-detailed-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOrganizationConfigRuleDetailedStatusAsync get-organization-config-rule-detailed-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest get-organization-config-rule-detailed-status-request]
    (-> this (.getOrganizationConfigRuleDetailedStatusAsync get-organization-config-rule-detailed-status-request))))

(defn put-delivery-channel-async
  "Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
   topic.


   Before you can create a delivery channel, you must create a configuration recorder.


   You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
   To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
   bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
   will keep the existing value for the parameter that is not changed.



   You can have only one delivery channel per region in your account.

  put-delivery-channel-request - The input for the PutDeliveryChannel action. - `com.amazonaws.services.config.model.PutDeliveryChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDeliveryChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutDeliveryChannelResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutDeliveryChannelRequest put-delivery-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDeliveryChannelAsync put-delivery-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutDeliveryChannelRequest put-delivery-channel-request]
    (-> this (.putDeliveryChannelAsync put-delivery-channel-request))))

(defn describe-organization-config-rule-statuses-async
  "describe-organization-config-rule-statuses-request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganizationConfigRuleStatuses operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest describe-organization-config-rule-statuses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationConfigRuleStatusesAsync describe-organization-config-rule-statuses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest describe-organization-config-rule-statuses-request]
    (-> this (.describeOrganizationConfigRuleStatusesAsync describe-organization-config-rule-statuses-request))))

(defn deliver-config-snapshot-async
  "Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
   the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have
   specified.




   Notification of the start of the delivery.




   Notification of the completion of the delivery, if the delivery was successfully completed.




   Notification of delivery failure, if the delivery failed.

  deliver-config-snapshot-request - The input for the DeliverConfigSnapshot action. - `com.amazonaws.services.config.model.DeliverConfigSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeliverConfigSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeliverConfigSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeliverConfigSnapshotRequest deliver-config-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deliverConfigSnapshotAsync deliver-config-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeliverConfigSnapshotRequest deliver-config-snapshot-request]
    (-> this (.deliverConfigSnapshotAsync deliver-config-snapshot-request))))

(defn describe-config-rule-evaluation-status-async
  "Returns status information for each of your AWS managed Config rules. The status includes information such as the
   last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
   for the last failure.

  describe-config-rule-evaluation-status-request - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigRuleEvaluationStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest describe-config-rule-evaluation-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigRuleEvaluationStatusAsync describe-config-rule-evaluation-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest describe-config-rule-evaluation-status-request]
    (-> this (.describeConfigRuleEvaluationStatusAsync describe-config-rule-evaluation-status-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeConfigRuleEvaluationStatusAsync))))

(defn delete-remediation-configuration-async
  "Deletes the remediation configuration.

  delete-remediation-configuration-request - `com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRemediationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteRemediationConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest delete-remediation-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRemediationConfigurationAsync delete-remediation-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest delete-remediation-configuration-request]
    (-> this (.deleteRemediationConfigurationAsync delete-remediation-configuration-request))))

(defn describe-configuration-recorder-status-async
  "Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
   this action returns the status of all configuration recorders associated with the account.



   Currently, you can specify only one configuration recorder per region in your account.

  describe-configuration-recorder-status-request - The input for the DescribeConfigurationRecorderStatus action. - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRecorderStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest describe-configuration-recorder-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRecorderStatusAsync describe-configuration-recorder-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest describe-configuration-recorder-status-request]
    (-> this (.describeConfigurationRecorderStatusAsync describe-configuration-recorder-status-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeConfigurationRecorderStatusAsync))))

(defn put-aggregation-authorization-async
  "Authorizes the aggregator account and region to collect data from the source account and region.

  put-aggregation-authorization-request - `com.amazonaws.services.config.model.PutAggregationAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAggregationAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutAggregationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutAggregationAuthorizationRequest put-aggregation-authorization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAggregationAuthorizationAsync put-aggregation-authorization-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutAggregationAuthorizationRequest put-aggregation-authorization-request]
    (-> this (.putAggregationAuthorizationAsync put-aggregation-authorization-request))))

(defn describe-delivery-channels-async
  "Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
   the details of all delivery channels associated with the account.



   Currently, you can specify only one delivery channel per region in your account.

  describe-delivery-channels-request - The input for the DescribeDeliveryChannels action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeliveryChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeDeliveryChannelsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest describe-delivery-channels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeliveryChannelsAsync describe-delivery-channels-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest describe-delivery-channels-request]
    (-> this (.describeDeliveryChannelsAsync describe-delivery-channels-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeDeliveryChannelsAsync))))

(defn list-tags-for-resource-async
  "List the tags for AWS Config resource.

  list-tags-for-resource-request - `com.amazonaws.services.config.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn stop-configuration-recorder-async
  "Stops recording configurations of the AWS resources you have selected to record in your AWS account.

  stop-configuration-recorder-request - The input for the StopConfigurationRecorder action. - `com.amazonaws.services.config.model.StopConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StopConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StopConfigurationRecorderRequest stop-configuration-recorder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopConfigurationRecorderAsync stop-configuration-recorder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.StopConfigurationRecorderRequest stop-configuration-recorder-request]
    (-> this (.stopConfigurationRecorderAsync stop-configuration-recorder-request))))

(defn delete-pending-aggregation-request-async
  "Deletes pending authorization requests for a specified aggregator account in a specified region.

  delete-pending-aggregation-request-request - `com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePendingAggregationRequest operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeletePendingAggregationRequestResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest delete-pending-aggregation-request-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePendingAggregationRequestAsync delete-pending-aggregation-request-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest delete-pending-aggregation-request-request]
    (-> this (.deletePendingAggregationRequestAsync delete-pending-aggregation-request-request))))

(defn batch-get-resource-config-async
  "Returns the current configuration for one or more requested resources. The operation also returns a list of
   resources that are not processed in the current request. If there are no unprocessed resources, the operation
   returns an empty unprocessedResourceKeys list.





   The API does not return results for deleted resources.




   The API does not return any tags for the requested resources. This information is filtered out of the
   supplementaryConfiguration section of the API response.

  batch-get-resource-config-request - `com.amazonaws.services.config.model.BatchGetResourceConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetResourceConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.BatchGetResourceConfigResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetResourceConfigRequest batch-get-resource-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetResourceConfigAsync batch-get-resource-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetResourceConfigRequest batch-get-resource-config-request]
    (-> this (.batchGetResourceConfigAsync batch-get-resource-config-request))))

(defn list-discovered-resources-async
  "Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
   identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
   resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
   narrow the results to include only resources that have specific resource IDs or a resource name.



   You can specify either resource IDs or a resource name, but not both, in the same request.



   The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize
   this number with the limit parameter. The response includes a nextToken string. To get
   the next page of results, run the request again and specify the string for the nextToken parameter.

  list-discovered-resources-request - `com.amazonaws.services.config.model.ListDiscoveredResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDiscoveredResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.ListDiscoveredResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.ListDiscoveredResourcesRequest list-discovered-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDiscoveredResourcesAsync list-discovered-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.ListDiscoveredResourcesRequest list-discovered-resources-request]
    (-> this (.listDiscoveredResourcesAsync list-discovered-resources-request))))

(defn get-compliance-details-by-resource-async
  "Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
   used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.

  get-compliance-details-by-resource-request - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceDetailsByResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest get-compliance-details-by-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceDetailsByResourceAsync get-compliance-details-by-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest get-compliance-details-by-resource-request]
    (-> this (.getComplianceDetailsByResourceAsync get-compliance-details-by-resource-request))))

(defn put-remediation-configurations-async
  "Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action.
   The API creates the RemediationConfiguration object for the AWS Config rule. The AWS Config rule
   must already exist for you to add a remediation configuration. The target (SSM document) must exist and have
   permissions to use the target.

  put-remediation-configurations-request - `com.amazonaws.services.config.model.PutRemediationConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRemediationConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutRemediationConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutRemediationConfigurationsRequest put-remediation-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRemediationConfigurationsAsync put-remediation-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutRemediationConfigurationsRequest put-remediation-configurations-request]
    (-> this (.putRemediationConfigurationsAsync put-remediation-configurations-request))))

(defn delete-configuration-recorder-async
  "Deletes the configuration recorder.


   After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
   create a new configuration recorder.


   This action does not delete the configuration information that was previously recorded. You will be able to
   access the previously recorded information by using the GetResourceConfigHistory action, but you
   will not be able to access this information in the AWS Config console until you create a new configuration
   recorder.

  delete-configuration-recorder-request - The request object for the DeleteConfigurationRecorder action. - `com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest delete-configuration-recorder-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationRecorderAsync delete-configuration-recorder-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest delete-configuration-recorder-request]
    (-> this (.deleteConfigurationRecorderAsync delete-configuration-recorder-request))))

(defn describe-compliance-by-resource-async
  "Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns
   the number of AWS Config rules that the resource does not comply with.


   A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it
   does not comply with one or more of these rules.


   If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This
   result might indicate one of the following conditions about the rules that evaluate the resource:




   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the
   DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and
   LastFailedInvocationTime.




   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you
   assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule
   is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations
   permission.




   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can
   occur if the resources were deleted or removed from the rule's scope.

  describe-compliance-by-resource-request - `com.amazonaws.services.config.model.DescribeComplianceByResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComplianceByResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeComplianceByResourceResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByResourceRequest describe-compliance-by-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComplianceByResourceAsync describe-compliance-by-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByResourceRequest describe-compliance-by-resource-request]
    (-> this (.describeComplianceByResourceAsync describe-compliance-by-resource-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeComplianceByResourceAsync))))

(defn delete-organization-config-rule-async
  "delete-organization-config-rule-request - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOrganizationConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest delete-organization-config-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOrganizationConfigRuleAsync delete-organization-config-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest delete-organization-config-rule-request]
    (-> this (.deleteOrganizationConfigRuleAsync delete-organization-config-rule-request))))

(defn describe-remediation-configurations-async
  "Returns the details of one or more remediation configurations.

  describe-remediation-configurations-request - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRemediationConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest describe-remediation-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRemediationConfigurationsAsync describe-remediation-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest describe-remediation-configurations-request]
    (-> this (.describeRemediationConfigurationsAsync describe-remediation-configurations-request))))

(defn describe-configuration-aggregator-sources-status-async
  "Returns status information for sources within an aggregator. The status includes information about the last time
   AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the
   status contains the related error code or message.

  describe-configuration-aggregator-sources-status-request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationAggregatorSourcesStatus operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest describe-configuration-aggregator-sources-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAggregatorSourcesStatusAsync describe-configuration-aggregator-sources-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest describe-configuration-aggregator-sources-status-request]
    (-> this (.describeConfigurationAggregatorSourcesStatusAsync describe-configuration-aggregator-sources-status-request))))

(defn put-configuration-aggregator-async
  "Creates and updates the configuration aggregator with the selected source accounts and regions. The source
   account can be individual account(s) or an organization.



   AWS Config should be enabled in source accounts and regions you want to aggregate.


   If your source type is an organization, you must be signed in to the master account and all features must be
   enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration
   between AWS Config and AWS Organizations.

  put-configuration-aggregator-request - `com.amazonaws.services.config.model.PutConfigurationAggregatorRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationAggregator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutConfigurationAggregatorResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationAggregatorRequest put-configuration-aggregator-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationAggregatorAsync put-configuration-aggregator-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationAggregatorRequest put-configuration-aggregator-request]
    (-> this (.putConfigurationAggregatorAsync put-configuration-aggregator-request))))

(defn describe-config-rules-async
  "Returns details about your AWS Config rules.

  describe-config-rules-request - `com.amazonaws.services.config.model.DescribeConfigRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigRulesResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRulesRequest describe-config-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigRulesAsync describe-config-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRulesRequest describe-config-rules-request]
    (-> this (.describeConfigRulesAsync describe-config-rules-request)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this]
    (-> this (.describeConfigRulesAsync))))

(defn tag-resource-async
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
   not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
   with that resource are deleted as well.

  tag-resource-request - `com.amazonaws.services.config.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn describe-aggregate-compliance-by-config-rules-async
  "Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant
   rules.



   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
   page.

  describe-aggregate-compliance-by-config-rules-request - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAggregateComplianceByConfigRules operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest describe-aggregate-compliance-by-config-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAggregateComplianceByConfigRulesAsync describe-aggregate-compliance-by-config-rules-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest describe-aggregate-compliance-by-config-rules-request]
    (-> this (.describeAggregateComplianceByConfigRulesAsync describe-aggregate-compliance-by-config-rules-request))))

(defn put-evaluations-async
  "Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
   Lambda function that is invoked by an AWS Config rule.

  put-evaluations-request - `com.amazonaws.services.config.model.PutEvaluationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvaluations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutEvaluationsResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutEvaluationsRequest put-evaluations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEvaluationsAsync put-evaluations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutEvaluationsRequest put-evaluations-request]
    (-> this (.putEvaluationsAsync put-evaluations-request))))

(defn delete-delivery-channel-async
  "Deletes the delivery channel.


   Before you can delete the delivery channel, you must stop the configuration recorder by using the
   StopConfigurationRecorder action.

  delete-delivery-channel-request - The input for the DeleteDeliveryChannel action. The action accepts the following data, in JSON format. - `com.amazonaws.services.config.model.DeleteDeliveryChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeliveryChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteDeliveryChannelResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteDeliveryChannelRequest delete-delivery-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeliveryChannelAsync delete-delivery-channel-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteDeliveryChannelRequest delete-delivery-channel-request]
    (-> this (.deleteDeliveryChannelAsync delete-delivery-channel-request))))

(defn put-retention-configuration-async
  "Creates and updates the retention configuration with details about retention period (number of days) that AWS
   Config stores your historical information. The API creates the RetentionConfiguration object and
   names the object as default. When you have a RetentionConfiguration object named
   default, calling the API modifies the default object.



   Currently, AWS Config supports only one retention configuration per region in your account.

  put-retention-configuration-request - `com.amazonaws.services.config.model.PutRetentionConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRetentionConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutRetentionConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutRetentionConfigurationRequest put-retention-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRetentionConfigurationAsync put-retention-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonConfigAsync this ^com.amazonaws.services.config.model.PutRetentionConfigurationRequest put-retention-configuration-request]
    (-> this (.putRetentionConfigurationAsync put-retention-configuration-request))))

