(ns com.amazonaws.services.config.AmazonConfig
  "Interface for accessing Config Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonConfig instead.


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
  (:import [com.amazonaws.services.config AmazonConfig]))

(defn get-aggregate-compliance-details-by-config-rule
  "Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results
   indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each
   resource complies with the rule.



   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next
   page.

  get-aggregate-compliance-details-by-config-rule-request - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest`

  returns: Result of the GetAggregateComplianceDetailsByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest get-aggregate-compliance-details-by-config-rule-request]
    (-> this (.getAggregateComplianceDetailsByConfigRule get-aggregate-compliance-details-by-config-rule-request))))

(defn delete-retention-configuration
  "Deletes the retention configuration.

  delete-retention-configuration-request - `com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest`

  returns: Result of the DeleteRetentionConfiguration operation returned by the service. - `com.amazonaws.services.config.model.DeleteRetentionConfigurationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DeleteRetentionConfigurationResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest delete-retention-configuration-request]
    (-> this (.deleteRetentionConfiguration delete-retention-configuration-request))))

(defn put-configuration-aggregator
  "Creates and updates the configuration aggregator with the selected source accounts and regions. The source
   account can be individual account(s) or an organization.



   AWS Config should be enabled in source accounts and regions you want to aggregate.


   If your source type is an organization, you must be signed in to the master account and all features must be
   enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration
   between AWS Config and AWS Organizations.

  put-configuration-aggregator-request - `com.amazonaws.services.config.model.PutConfigurationAggregatorRequest`

  returns: Result of the PutConfigurationAggregator operation returned by the service. - `com.amazonaws.services.config.model.PutConfigurationAggregatorResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutConfigurationAggregatorResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutConfigurationAggregatorRequest put-configuration-aggregator-request]
    (-> this (.putConfigurationAggregator put-configuration-aggregator-request))))

(defn get-resource-config-history
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

  returns: Result of the GetResourceConfigHistory operation returned by the service. - `com.amazonaws.services.config.model.GetResourceConfigHistoryResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetResourceConfigHistoryResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetResourceConfigHistoryRequest get-resource-config-history-request]
    (-> this (.getResourceConfigHistory get-resource-config-history-request))))

(defn list-tags-for-resource
  "List the tags for AWS Config resource.

  list-tags-for-resource-request - `com.amazonaws.services.config.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.config.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.config.model.ResourceNotFoundException - You have specified a resource that does not exist."
  (^com.amazonaws.services.config.model.ListTagsForResourceResult [^AmazonConfig this ^com.amazonaws.services.config.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn describe-aggregation-authorizations
  "Returns a list of authorizations granted to various aggregator accounts and regions.

  describe-aggregation-authorizations-request - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest`

  returns: Result of the DescribeAggregationAuthorizations operation returned by the service. - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest describe-aggregation-authorizations-request]
    (-> this (.describeAggregationAuthorizations describe-aggregation-authorizations-request))))

(defn put-evaluations
  "Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
   Lambda function that is invoked by an AWS Config rule.

  put-evaluations-request - `com.amazonaws.services.config.model.PutEvaluationsRequest`

  returns: Result of the PutEvaluations operation returned by the service. - `com.amazonaws.services.config.model.PutEvaluationsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutEvaluationsResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutEvaluationsRequest put-evaluations-request]
    (-> this (.putEvaluations put-evaluations-request))))

(defn put-delivery-channel
  "Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
   topic.


   Before you can create a delivery channel, you must create a configuration recorder.


   You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
   To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
   bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
   will keep the existing value for the parameter that is not changed.



   You can have only one delivery channel per region in your account.

  put-delivery-channel-request - The input for the PutDeliveryChannel action. - `com.amazonaws.services.config.model.PutDeliveryChannelRequest`

  returns: Result of the PutDeliveryChannel operation returned by the service. - `com.amazonaws.services.config.model.PutDeliveryChannelResult`

  throws: com.amazonaws.services.config.model.MaxNumberOfDeliveryChannelsExceededException - You have reached the limit of the number of delivery channels you can create."
  (^com.amazonaws.services.config.model.PutDeliveryChannelResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutDeliveryChannelRequest put-delivery-channel-request]
    (-> this (.putDeliveryChannel put-delivery-channel-request))))

(defn get-compliance-details-by-resource
  "Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
   used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.

  get-compliance-details-by-resource-request - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest`

  returns: Result of the GetComplianceDetailsByResource operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest get-compliance-details-by-resource-request]
    (-> this (.getComplianceDetailsByResource get-compliance-details-by-resource-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonConfig this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-aggregate-discovered-resource-counts
  "Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can
   request the resource counts by providing filters and GroupByKey.


   For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the
   count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a
   GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.

  get-aggregate-discovered-resource-counts-request - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest`

  returns: Result of the GetAggregateDiscoveredResourceCounts operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest get-aggregate-discovered-resource-counts-request]
    (-> this (.getAggregateDiscoveredResourceCounts get-aggregate-discovered-resource-counts-request))))

(defn start-configuration-recorder
  "Starts recording configurations of the AWS resources you have selected to record in your AWS account.


   You must have created at least one delivery channel to successfully start the configuration recorder.

  start-configuration-recorder-request - The input for the StartConfigurationRecorder action. - `com.amazonaws.services.config.model.StartConfigurationRecorderRequest`

  returns: Result of the StartConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.StartConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.StartConfigurationRecorderResult [^AmazonConfig this ^com.amazonaws.services.config.model.StartConfigurationRecorderRequest start-configuration-recorder-request]
    (-> this (.startConfigurationRecorder start-configuration-recorder-request))))

(defn delete-configuration-recorder
  "Deletes the configuration recorder.


   After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
   create a new configuration recorder.


   This action does not delete the configuration information that was previously recorded. You will be able to
   access the previously recorded information by using the GetResourceConfigHistory action, but you
   will not be able to access this information in the AWS Config console until you create a new configuration
   recorder.

  delete-configuration-recorder-request - The request object for the DeleteConfigurationRecorder action. - `com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest`

  returns: Result of the DeleteConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.DeleteConfigurationRecorderResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest delete-configuration-recorder-request]
    (-> this (.deleteConfigurationRecorder delete-configuration-recorder-request))))

(defn get-compliance-details-by-config-rule
  "Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
   evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.

  get-compliance-details-by-config-rule-request - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest`

  returns: Result of the GetComplianceDetailsByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest get-compliance-details-by-config-rule-request]
    (-> this (.getComplianceDetailsByConfigRule get-compliance-details-by-config-rule-request))))

(defn describe-config-rules
  "Returns details about your AWS Config rules.

  describe-config-rules-request - `com.amazonaws.services.config.model.DescribeConfigRulesRequest`

  returns: Result of the DescribeConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigRulesResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DescribeConfigRulesResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigRulesRequest describe-config-rules-request]
    (-> this (.describeConfigRules describe-config-rules-request)))
  (^com.amazonaws.services.config.model.DescribeConfigRulesResult [^AmazonConfig this]
    (-> this (.describeConfigRules))))

(defn start-config-rules-evaluation
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

  returns: Result of the StartConfigRulesEvaluation operation returned by the service. - `com.amazonaws.services.config.model.StartConfigRulesEvaluationResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.StartConfigRulesEvaluationResult [^AmazonConfig this ^com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest start-config-rules-evaluation-request]
    (-> this (.startConfigRulesEvaluation start-config-rules-evaluation-request))))

(defn describe-delivery-channel-status
  "Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
   returns the current status of all delivery channels associated with the account.



   Currently, you can specify only one delivery channel per region in your account.

  describe-delivery-channel-status-request - The input for the DeliveryChannelStatus action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest`

  returns: Result of the DescribeDeliveryChannelStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest describe-delivery-channel-status-request]
    (-> this (.describeDeliveryChannelStatus describe-delivery-channel-status-request)))
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult [^AmazonConfig this]
    (-> this (.describeDeliveryChannelStatus))))

(defn put-retention-configuration
  "Creates and updates the retention configuration with details about retention period (number of days) that AWS
   Config stores your historical information. The API creates the RetentionConfiguration object and
   names the object as default. When you have a RetentionConfiguration object named
   default, calling the API modifies the default object.



   Currently, AWS Config supports only one retention configuration per region in your account.

  put-retention-configuration-request - `com.amazonaws.services.config.model.PutRetentionConfigurationRequest`

  returns: Result of the PutRetentionConfiguration operation returned by the service. - `com.amazonaws.services.config.model.PutRetentionConfigurationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutRetentionConfigurationResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutRetentionConfigurationRequest put-retention-configuration-request]
    (-> this (.putRetentionConfiguration put-retention-configuration-request))))

(defn untag-resource
  "Deletes specified tags from a resource.

  untag-resource-request - `com.amazonaws.services.config.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.config.model.UntagResourceResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.UntagResourceResult [^AmazonConfig this ^com.amazonaws.services.config.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn describe-organization-config-rules
  "describe-organization-config-rules-request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest`

  returns: Result of the DescribeOrganizationConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest describe-organization-config-rules-request]
    (-> this (.describeOrganizationConfigRules describe-organization-config-rules-request))))

(defn batch-get-resource-config
  "Returns the current configuration for one or more requested resources. The operation also returns a list of
   resources that are not processed in the current request. If there are no unprocessed resources, the operation
   returns an empty unprocessedResourceKeys list.





   The API does not return results for deleted resources.




   The API does not return any tags for the requested resources. This information is filtered out of the
   supplementaryConfiguration section of the API response.

  batch-get-resource-config-request - `com.amazonaws.services.config.model.BatchGetResourceConfigRequest`

  returns: Result of the BatchGetResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.BatchGetResourceConfigResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.BatchGetResourceConfigResult [^AmazonConfig this ^com.amazonaws.services.config.model.BatchGetResourceConfigRequest batch-get-resource-config-request]
    (-> this (.batchGetResourceConfig batch-get-resource-config-request))))

(defn describe-remediation-execution-status
  "Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when
   steps for the remediation execution occur, and any error messages for steps that have failed. When you specify
   the limit and the next token, you receive a paginated response.

  describe-remediation-execution-status-request - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest`

  returns: Result of the DescribeRemediationExecutionStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchRemediationConfigurationException - You specified an AWS Config rule without a remediation configuration."
  (^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest describe-remediation-execution-status-request]
    (-> this (.describeRemediationExecutionStatus describe-remediation-execution-status-request))))

(defn put-config-rule
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

  returns: Result of the PutConfigRule operation returned by the service. - `com.amazonaws.services.config.model.PutConfigRuleResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutConfigRuleRequest put-config-rule-request]
    (-> this (.putConfigRule put-config-rule-request))))

(defn describe-retention-configurations
  "Returns the details of one or more retention configurations. If the retention configuration name is not
   specified, this action returns the details for all the retention configurations for that account.



   Currently, AWS Config supports only one retention configuration per region in your account.

  describe-retention-configurations-request - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest`

  returns: Result of the DescribeRetentionConfigurations operation returned by the service. - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest describe-retention-configurations-request]
    (-> this (.describeRetentionConfigurations describe-retention-configurations-request))))

(defn select-resource-config
  "Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and
   returns resource configurations matching the properties.


   For more information about query components, see the  Query Components
    section in the AWS Config Developer Guide.

  select-resource-config-request - `com.amazonaws.services.config.model.SelectResourceConfigRequest`

  returns: Result of the SelectResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.SelectResourceConfigResult`

  throws: com.amazonaws.services.config.model.InvalidExpressionException - The syntax of the query is incorrect."
  (^com.amazonaws.services.config.model.SelectResourceConfigResult [^AmazonConfig this ^com.amazonaws.services.config.model.SelectResourceConfigRequest select-resource-config-request]
    (-> this (.selectResourceConfig select-resource-config-request))))

(defn describe-delivery-channels
  "Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
   the details of all delivery channels associated with the account.



   Currently, you can specify only one delivery channel per region in your account.

  describe-delivery-channels-request - The input for the DescribeDeliveryChannels action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest`

  returns: Result of the DescribeDeliveryChannels operation returned by the service. - `com.amazonaws.services.config.model.DescribeDeliveryChannelsResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelsResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest describe-delivery-channels-request]
    (-> this (.describeDeliveryChannels describe-delivery-channels-request)))
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelsResult [^AmazonConfig this]
    (-> this (.describeDeliveryChannels))))

(defn describe-config-rule-evaluation-status
  "Returns status information for each of your AWS managed Config rules. The status includes information such as the
   last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
   for the last failure.

  describe-config-rule-evaluation-status-request - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest`

  returns: Result of the DescribeConfigRuleEvaluationStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest describe-config-rule-evaluation-status-request]
    (-> this (.describeConfigRuleEvaluationStatus describe-config-rule-evaluation-status-request)))
  (^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult [^AmazonConfig this]
    (-> this (.describeConfigRuleEvaluationStatus))))

(defn delete-evaluation-results
  "Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per
   request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start
   evaluating your AWS resources against the rule.

  delete-evaluation-results-request - `com.amazonaws.services.config.model.DeleteEvaluationResultsRequest`

  returns: Result of the DeleteEvaluationResults operation returned by the service. - `com.amazonaws.services.config.model.DeleteEvaluationResultsResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DeleteEvaluationResultsResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteEvaluationResultsRequest delete-evaluation-results-request]
    (-> this (.deleteEvaluationResults delete-evaluation-results-request))))

(defn deliver-config-snapshot
  "Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
   the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have
   specified.




   Notification of the start of the delivery.




   Notification of the completion of the delivery, if the delivery was successfully completed.




   Notification of delivery failure, if the delivery failed.

  deliver-config-snapshot-request - The input for the DeliverConfigSnapshot action. - `com.amazonaws.services.config.model.DeliverConfigSnapshotRequest`

  returns: Result of the DeliverConfigSnapshot operation returned by the service. - `com.amazonaws.services.config.model.DeliverConfigSnapshotResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DeliverConfigSnapshotResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeliverConfigSnapshotRequest deliver-config-snapshot-request]
    (-> this (.deliverConfigSnapshot deliver-config-snapshot-request))))

(defn delete-organization-config-rule
  "delete-organization-config-rule-request - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest`

  returns: Result of the DeleteOrganizationConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest delete-organization-config-rule-request]
    (-> this (.deleteOrganizationConfigRule delete-organization-config-rule-request))))

(defn describe-remediation-configurations
  "Returns the details of one or more remediation configurations.

  describe-remediation-configurations-request - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest`

  returns: Result of the DescribeRemediationConfigurations operation returned by the service. - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult`"
  (^com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest describe-remediation-configurations-request]
    (-> this (.describeRemediationConfigurations describe-remediation-configurations-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonConfig this]
    (-> this (.shutdown))))

(defn describe-configuration-aggregators
  "Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified,
   this action returns the details for all the configuration aggregators associated with the account.

  describe-configuration-aggregators-request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest`

  returns: Result of the DescribeConfigurationAggregators operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest describe-configuration-aggregators-request]
    (-> this (.describeConfigurationAggregators describe-configuration-aggregators-request))))

(defn delete-delivery-channel
  "Deletes the delivery channel.


   Before you can delete the delivery channel, you must stop the configuration recorder by using the
   StopConfigurationRecorder action.

  delete-delivery-channel-request - The input for the DeleteDeliveryChannel action. The action accepts the following data, in JSON format. - `com.amazonaws.services.config.model.DeleteDeliveryChannelRequest`

  returns: Result of the DeleteDeliveryChannel operation returned by the service. - `com.amazonaws.services.config.model.DeleteDeliveryChannelResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DeleteDeliveryChannelResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteDeliveryChannelRequest delete-delivery-channel-request]
    (-> this (.deleteDeliveryChannel delete-delivery-channel-request))))

(defn get-discovered-resource-counts
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

  returns: Result of the GetDiscoveredResourceCounts operation returned by the service. - `com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest get-discovered-resource-counts-request]
    (-> this (.getDiscoveredResourceCounts get-discovered-resource-counts-request))))

(defn get-compliance-summary-by-config-rule
  "Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.

  get-compliance-summary-by-config-rule-request - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest`

  returns: Result of the GetComplianceSummaryByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult`"
  (^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest get-compliance-summary-by-config-rule-request]
    (-> this (.getComplianceSummaryByConfigRule get-compliance-summary-by-config-rule-request)))
  (^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult [^AmazonConfig this]
    (-> this (.getComplianceSummaryByConfigRule))))

(defn delete-pending-aggregation-request
  "Deletes pending authorization requests for a specified aggregator account in a specified region.

  delete-pending-aggregation-request-request - `com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest`

  returns: Result of the DeletePendingAggregationRequest operation returned by the service. - `com.amazonaws.services.config.model.DeletePendingAggregationRequestResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DeletePendingAggregationRequestResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest delete-pending-aggregation-request-request]
    (-> this (.deletePendingAggregationRequest delete-pending-aggregation-request-request))))

(defn list-aggregate-discovered-resources
  "Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource
   type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom
   resource name, source account, and source region. You can narrow the results to include only resources that have
   specific resource IDs, or a resource name, or source account ID, or source region.


   For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type
   AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910
   and region us-east-1.

  list-aggregate-discovered-resources-request - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest`

  returns: Result of the ListAggregateDiscoveredResources operation returned by the service. - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult [^AmazonConfig this ^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest list-aggregate-discovered-resources-request]
    (-> this (.listAggregateDiscoveredResources list-aggregate-discovered-resources-request))))

(defn start-remediation-execution
  "Runs an on-demand remediation for the specified AWS Config rules against the last known remediation
   configuration. It runs an execution against the current state of your resources. Remediation execution is
   asynchronous.


   You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified
   resource keys must complete before you can call the API again.

  start-remediation-execution-request - `com.amazonaws.services.config.model.StartRemediationExecutionRequest`

  returns: Result of the StartRemediationExecution operation returned by the service. - `com.amazonaws.services.config.model.StartRemediationExecutionResult`

  throws: com.amazonaws.services.config.model.InsufficientPermissionsException - Indicates one of the following errors: The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the config:Put* action. The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions."
  (^com.amazonaws.services.config.model.StartRemediationExecutionResult [^AmazonConfig this ^com.amazonaws.services.config.model.StartRemediationExecutionRequest start-remediation-execution-request]
    (-> this (.startRemediationExecution start-remediation-execution-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"config.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"config.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonConfig this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn put-organization-config-rule
  "put-organization-config-rule-request - `com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest`

  returns: Result of the PutOrganizationConfigRule operation returned by the service. - `com.amazonaws.services.config.model.PutOrganizationConfigRuleResult`

  throws: com.amazonaws.services.config.model.MaxNumberOfOrganizationConfigRulesExceededException"
  (^com.amazonaws.services.config.model.PutOrganizationConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest put-organization-config-rule-request]
    (-> this (.putOrganizationConfigRule put-organization-config-rule-request))))

(defn describe-configuration-recorders
  "Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
   this action returns the details for all configuration recorders associated with the account.



   Currently, you can specify only one configuration recorder per region in your account.

  describe-configuration-recorders-request - The input for the DescribeConfigurationRecorders action. - `com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest`

  returns: Result of the DescribeConfigurationRecorders operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationRecordersResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.DescribeConfigurationRecordersResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest describe-configuration-recorders-request]
    (-> this (.describeConfigurationRecorders describe-configuration-recorders-request)))
  (^com.amazonaws.services.config.model.DescribeConfigurationRecordersResult [^AmazonConfig this]
    (-> this (.describeConfigurationRecorders))))

(defn delete-remediation-configuration
  "Deletes the remediation configuration.

  delete-remediation-configuration-request - `com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest`

  returns: Result of the DeleteRemediationConfiguration operation returned by the service. - `com.amazonaws.services.config.model.DeleteRemediationConfigurationResult`

  throws: com.amazonaws.services.config.model.NoSuchRemediationConfigurationException - You specified an AWS Config rule without a remediation configuration."
  (^com.amazonaws.services.config.model.DeleteRemediationConfigurationResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest delete-remediation-configuration-request]
    (-> this (.deleteRemediationConfiguration delete-remediation-configuration-request))))

(defn get-organization-config-rule-detailed-status
  "get-organization-config-rule-detailed-status-request - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest`

  returns: Result of the GetOrganizationConfigRuleDetailedStatus operation returned by the service. - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest get-organization-config-rule-detailed-status-request]
    (-> this (.getOrganizationConfigRuleDetailedStatus get-organization-config-rule-detailed-status-request))))

(defn get-aggregate-config-rule-compliance-summary
  "Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.



   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
   page.

  get-aggregate-config-rule-compliance-summary-request - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest`

  returns: Result of the GetAggregateConfigRuleComplianceSummary operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest get-aggregate-config-rule-compliance-summary-request]
    (-> this (.getAggregateConfigRuleComplianceSummary get-aggregate-config-rule-compliance-summary-request))))

(defn list-discovered-resources
  "Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
   identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
   resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
   narrow the results to include only resources that have specific resource IDs or a resource name.



   You can specify either resource IDs or a resource name, but not both, in the same request.



   The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize
   this number with the limit parameter. The response includes a nextToken string. To get
   the next page of results, run the request again and specify the string for the nextToken parameter.

  list-discovered-resources-request - `com.amazonaws.services.config.model.ListDiscoveredResourcesRequest`

  returns: Result of the ListDiscoveredResources operation returned by the service. - `com.amazonaws.services.config.model.ListDiscoveredResourcesResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.ListDiscoveredResourcesResult [^AmazonConfig this ^com.amazonaws.services.config.model.ListDiscoveredResourcesRequest list-discovered-resources-request]
    (-> this (.listDiscoveredResources list-discovered-resources-request))))

(defn describe-organization-config-rule-statuses
  "describe-organization-config-rule-statuses-request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest`

  returns: Result of the DescribeOrganizationConfigRuleStatuses operation returned by the service. - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest describe-organization-config-rule-statuses-request]
    (-> this (.describeOrganizationConfigRuleStatuses describe-organization-config-rule-statuses-request))))

(defn put-remediation-configurations
  "Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action.
   The API creates the RemediationConfiguration object for the AWS Config rule. The AWS Config rule
   must already exist for you to add a remediation configuration. The target (SSM document) must exist and have
   permissions to use the target.

  put-remediation-configurations-request - `com.amazonaws.services.config.model.PutRemediationConfigurationsRequest`

  returns: Result of the PutRemediationConfigurations operation returned by the service. - `com.amazonaws.services.config.model.PutRemediationConfigurationsResult`

  throws: com.amazonaws.services.config.model.InsufficientPermissionsException - Indicates one of the following errors: The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the config:Put* action. The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions."
  (^com.amazonaws.services.config.model.PutRemediationConfigurationsResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutRemediationConfigurationsRequest put-remediation-configurations-request]
    (-> this (.putRemediationConfigurations put-remediation-configurations-request))))

(defn describe-compliance-by-config-rule
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

  returns: Result of the DescribeComplianceByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest describe-compliance-by-config-rule-request]
    (-> this (.describeComplianceByConfigRule describe-compliance-by-config-rule-request)))
  (^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult [^AmazonConfig this]
    (-> this (.describeComplianceByConfigRule))))

(defn put-configuration-recorder
  "Creates a new configuration recorder to record the selected resource configurations.


   You can use this action to change the role roleARN or the recordingGroup of an existing
   recorder. To change the role, call the action on the existing configuration recorder and specify a role.



   Currently, you can specify only one configuration recorder per region in your account.


   If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is
   to record all supported resource types.

  put-configuration-recorder-request - The input for the PutConfigurationRecorder action. - `com.amazonaws.services.config.model.PutConfigurationRecorderRequest`

  returns: Result of the PutConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.PutConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.MaxNumberOfConfigurationRecordersExceededException - You have reached the limit of the number of recorders you can create."
  (^com.amazonaws.services.config.model.PutConfigurationRecorderResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutConfigurationRecorderRequest put-configuration-recorder-request]
    (-> this (.putConfigurationRecorder put-configuration-recorder-request))))

(defn batch-get-aggregate-resource-config
  "Returns the current configuration items for resources that are present in your AWS Config aggregator. The
   operation also returns a list of resources that are not processed in the current request. If there are no
   unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.





   The API does not return results for deleted resources.




   The API does not return tags and relationships.

  batch-get-aggregate-resource-config-request - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest`

  returns: Result of the BatchGetAggregateResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult [^AmazonConfig this ^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest batch-get-aggregate-resource-config-request]
    (-> this (.batchGetAggregateResourceConfig batch-get-aggregate-resource-config-request))))

(defn describe-pending-aggregation-requests
  "Returns a list of all pending aggregation requests.

  describe-pending-aggregation-requests-request - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest`

  returns: Result of the DescribePendingAggregationRequests operation returned by the service. - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest describe-pending-aggregation-requests-request]
    (-> this (.describePendingAggregationRequests describe-pending-aggregation-requests-request))))

(defn put-aggregation-authorization
  "Authorizes the aggregator account and region to collect data from the source account and region.

  put-aggregation-authorization-request - `com.amazonaws.services.config.model.PutAggregationAuthorizationRequest`

  returns: Result of the PutAggregationAuthorization operation returned by the service. - `com.amazonaws.services.config.model.PutAggregationAuthorizationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutAggregationAuthorizationResult [^AmazonConfig this ^com.amazonaws.services.config.model.PutAggregationAuthorizationRequest put-aggregation-authorization-request]
    (-> this (.putAggregationAuthorization put-aggregation-authorization-request))))

(defn describe-configuration-recorder-status
  "Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
   this action returns the status of all configuration recorders associated with the account.



   Currently, you can specify only one configuration recorder per region in your account.

  describe-configuration-recorder-status-request - The input for the DescribeConfigurationRecorderStatus action. - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest`

  returns: Result of the DescribeConfigurationRecorderStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest describe-configuration-recorder-status-request]
    (-> this (.describeConfigurationRecorderStatus describe-configuration-recorder-status-request)))
  (^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult [^AmazonConfig this]
    (-> this (.describeConfigurationRecorderStatus))))

(defn delete-aggregation-authorization
  "Deletes the authorization granted to the specified configuration aggregator account in a specified region.

  delete-aggregation-authorization-request - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest`

  returns: Result of the DeleteAggregationAuthorization operation returned by the service. - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest delete-aggregation-authorization-request]
    (-> this (.deleteAggregationAuthorization delete-aggregation-authorization-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonConfig this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-aggregate-resource-config
  "Returns configuration item that is aggregated for your specific resource in a specific source account and region.

  get-aggregate-resource-config-request - `com.amazonaws.services.config.model.GetAggregateResourceConfigRequest`

  returns: Result of the GetAggregateResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateResourceConfigResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateResourceConfigResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetAggregateResourceConfigRequest get-aggregate-resource-config-request]
    (-> this (.getAggregateResourceConfig get-aggregate-resource-config-request))))

(defn delete-configuration-aggregator
  "Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.

  delete-configuration-aggregator-request - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest`

  returns: Result of the DeleteConfigurationAggregator operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationAggregatorException - You have specified a configuration aggregator that does not exist."
  (^com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest delete-configuration-aggregator-request]
    (-> this (.deleteConfigurationAggregator delete-configuration-aggregator-request))))

(defn get-compliance-summary-by-resource-type
  "Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
   more resource types to get these numbers for each resource type. The maximum number returned is 100.

  get-compliance-summary-by-resource-type-request - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest`

  returns: Result of the GetComplianceSummaryByResourceType operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult [^AmazonConfig this ^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest get-compliance-summary-by-resource-type-request]
    (-> this (.getComplianceSummaryByResourceType get-compliance-summary-by-resource-type-request)))
  (^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult [^AmazonConfig this]
    (-> this (.getComplianceSummaryByResourceType))))

(defn tag-resource
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
   not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
   with that resource are deleted as well.

  tag-resource-request - `com.amazonaws.services.config.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.config.model.TagResourceResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.TagResourceResult [^AmazonConfig this ^com.amazonaws.services.config.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn stop-configuration-recorder
  "Stops recording configurations of the AWS resources you have selected to record in your AWS account.

  stop-configuration-recorder-request - The input for the StopConfigurationRecorder action. - `com.amazonaws.services.config.model.StopConfigurationRecorderRequest`

  returns: Result of the StopConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.StopConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.StopConfigurationRecorderResult [^AmazonConfig this ^com.amazonaws.services.config.model.StopConfigurationRecorderRequest stop-configuration-recorder-request]
    (-> this (.stopConfigurationRecorder stop-configuration-recorder-request))))

(defn delete-config-rule
  "Deletes the specified AWS Config rule and all of its evaluation results.


   AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a
   rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request
   for the rule, you will receive a ResourceInUseException.


   You can check the state of a rule by using the DescribeConfigRules request.

  delete-config-rule-request - `com.amazonaws.services.config.model.DeleteConfigRuleRequest`

  returns: Result of the DeleteConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigRuleResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DeleteConfigRuleResult [^AmazonConfig this ^com.amazonaws.services.config.model.DeleteConfigRuleRequest delete-config-rule-request]
    (-> this (.deleteConfigRule delete-config-rule-request))))

(defn describe-configuration-aggregator-sources-status
  "Returns status information for sources within an aggregator. The status includes information about the last time
   AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the
   status contains the related error code or message.

  describe-configuration-aggregator-sources-status-request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest`

  returns: Result of the DescribeConfigurationAggregatorSourcesStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest describe-configuration-aggregator-sources-status-request]
    (-> this (.describeConfigurationAggregatorSourcesStatus describe-configuration-aggregator-sources-status-request))))

(defn describe-compliance-by-resource
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

  returns: Result of the DescribeComplianceByResource operation returned by the service. - `com.amazonaws.services.config.model.DescribeComplianceByResourceResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeComplianceByResourceResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeComplianceByResourceRequest describe-compliance-by-resource-request]
    (-> this (.describeComplianceByResource describe-compliance-by-resource-request)))
  (^com.amazonaws.services.config.model.DescribeComplianceByResourceResult [^AmazonConfig this]
    (-> this (.describeComplianceByResource))))

(defn describe-aggregate-compliance-by-config-rules
  "Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant
   rules.



   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
   page.

  describe-aggregate-compliance-by-config-rules-request - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest`

  returns: Result of the DescribeAggregateComplianceByConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult [^AmazonConfig this ^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest describe-aggregate-compliance-by-config-rules-request]
    (-> this (.describeAggregateComplianceByConfigRules describe-aggregate-compliance-by-config-rules-request))))

