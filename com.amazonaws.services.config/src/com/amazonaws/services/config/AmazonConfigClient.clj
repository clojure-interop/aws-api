(ns com.amazonaws.services.config.AmazonConfigClient
  "Client for accessing Config Service. All service calls made using this client are blocking, and will not return until
  the service call completes.

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
  (:import [com.amazonaws.services.config AmazonConfigClient]))

(defn ->amazon-config-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Config Service (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonConfigClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonConfigClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonConfigClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonConfigClient aws-credentials client-configuration))
  (^AmazonConfigClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonConfigClient client-configuration))
  (^AmazonConfigClient []
    (new AmazonConfigClient )))

(defn *builder
  "returns: `com.amazonaws.services.config.AmazonConfigClientBuilder`"
  (^com.amazonaws.services.config.AmazonConfigClientBuilder []
    (AmazonConfigClient/builder )))

(defn get-aggregate-compliance-details-by-config-rule
  "Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results
   indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each
   resource complies with the rule.



   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next
   page.

  request - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest`

  returns: Result of the GetAggregateComplianceDetailsByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest request]
    (-> this (.getAggregateComplianceDetailsByConfigRule request))))

(defn delete-retention-configuration
  "Deletes the retention configuration.

  request - `com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest`

  returns: Result of the DeleteRetentionConfiguration operation returned by the service. - `com.amazonaws.services.config.model.DeleteRetentionConfigurationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DeleteRetentionConfigurationResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest request]
    (-> this (.deleteRetentionConfiguration request))))

(defn put-configuration-aggregator
  "Creates and updates the configuration aggregator with the selected source accounts and regions. The source
   account can be individual account(s) or an organization.



   AWS Config should be enabled in source accounts and regions you want to aggregate.


   If your source type is an organization, you must be signed in to the master account and all features must be
   enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration
   between AWS Config and AWS Organizations.

  request - `com.amazonaws.services.config.model.PutConfigurationAggregatorRequest`

  returns: Result of the PutConfigurationAggregator operation returned by the service. - `com.amazonaws.services.config.model.PutConfigurationAggregatorResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutConfigurationAggregatorResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutConfigurationAggregatorRequest request]
    (-> this (.putConfigurationAggregator request))))

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

  request - `com.amazonaws.services.config.model.GetResourceConfigHistoryRequest`

  returns: Result of the GetResourceConfigHistory operation returned by the service. - `com.amazonaws.services.config.model.GetResourceConfigHistoryResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetResourceConfigHistoryResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetResourceConfigHistoryRequest request]
    (-> this (.getResourceConfigHistory request))))

(defn list-tags-for-resource
  "List the tags for AWS Config resource.

  request - `com.amazonaws.services.config.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.config.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.config.model.ResourceNotFoundException - You have specified a resource that does not exist."
  (^com.amazonaws.services.config.model.ListTagsForResourceResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-aggregation-authorizations
  "Returns a list of authorizations granted to various aggregator accounts and regions.

  request - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest`

  returns: Result of the DescribeAggregationAuthorizations operation returned by the service. - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest request]
    (-> this (.describeAggregationAuthorizations request))))

(defn put-evaluations
  "Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS
   Lambda function that is invoked by an AWS Config rule.

  request - `com.amazonaws.services.config.model.PutEvaluationsRequest`

  returns: Result of the PutEvaluations operation returned by the service. - `com.amazonaws.services.config.model.PutEvaluationsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutEvaluationsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutEvaluationsRequest request]
    (-> this (.putEvaluations request))))

(defn put-delivery-channel
  "Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
   topic.


   Before you can create a delivery channel, you must create a configuration recorder.


   You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
   To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
   bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
   will keep the existing value for the parameter that is not changed.



   You can have only one delivery channel per region in your account.

  request - `com.amazonaws.services.config.model.PutDeliveryChannelRequest`

  returns: Result of the PutDeliveryChannel operation returned by the service. - `com.amazonaws.services.config.model.PutDeliveryChannelResult`

  throws: com.amazonaws.services.config.model.MaxNumberOfDeliveryChannelsExceededException - You have reached the limit of the number of delivery channels you can create."
  (^com.amazonaws.services.config.model.PutDeliveryChannelResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutDeliveryChannelRequest request]
    (-> this (.putDeliveryChannel request))))

(defn get-compliance-details-by-resource
  "Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were
   used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.

  request - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest`

  returns: Result of the GetComplianceDetailsByResource operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest request]
    (-> this (.getComplianceDetailsByResource request))))

(defn get-aggregate-discovered-resource-counts
  "Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can
   request the resource counts by providing filters and GroupByKey.


   For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the
   count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a
   GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.

  request - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest`

  returns: Result of the GetAggregateDiscoveredResourceCounts operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest request]
    (-> this (.getAggregateDiscoveredResourceCounts request))))

(defn start-configuration-recorder
  "Starts recording configurations of the AWS resources you have selected to record in your AWS account.


   You must have created at least one delivery channel to successfully start the configuration recorder.

  request - `com.amazonaws.services.config.model.StartConfigurationRecorderRequest`

  returns: Result of the StartConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.StartConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.StartConfigurationRecorderResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.StartConfigurationRecorderRequest request]
    (-> this (.startConfigurationRecorder request))))

(defn delete-configuration-recorder
  "Deletes the configuration recorder.


   After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you
   create a new configuration recorder.


   This action does not delete the configuration information that was previously recorded. You will be able to
   access the previously recorded information by using the GetResourceConfigHistory action, but you
   will not be able to access this information in the AWS Config console until you create a new configuration
   recorder.

  request - `com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest`

  returns: Result of the DeleteConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.DeleteConfigurationRecorderResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest request]
    (-> this (.deleteConfigurationRecorder request))))

(defn get-compliance-details-by-config-rule
  "Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were
   evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.

  request - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest`

  returns: Result of the GetComplianceDetailsByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest request]
    (-> this (.getComplianceDetailsByConfigRule request))))

(defn describe-config-rules
  "Returns details about your AWS Config rules.

  request - `com.amazonaws.services.config.model.DescribeConfigRulesRequest`

  returns: Result of the DescribeConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigRulesResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DescribeConfigRulesResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeConfigRulesRequest request]
    (-> this (.describeConfigRules request)))
  (^com.amazonaws.services.config.model.DescribeConfigRulesResult [^AmazonConfigClient this]
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

  request - `com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest`

  returns: Result of the StartConfigRulesEvaluation operation returned by the service. - `com.amazonaws.services.config.model.StartConfigRulesEvaluationResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.StartConfigRulesEvaluationResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest request]
    (-> this (.startConfigRulesEvaluation request))))

(defn describe-delivery-channel-status
  "Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
   returns the current status of all delivery channels associated with the account.



   Currently, you can specify only one delivery channel per region in your account.

  request - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest`

  returns: Result of the DescribeDeliveryChannelStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest request]
    (-> this (.describeDeliveryChannelStatus request)))
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult [^AmazonConfigClient this]
    (-> this (.describeDeliveryChannelStatus))))

(defn put-retention-configuration
  "Creates and updates the retention configuration with details about retention period (number of days) that AWS
   Config stores your historical information. The API creates the RetentionConfiguration object and
   names the object as default. When you have a RetentionConfiguration object named
   default, calling the API modifies the default object.



   Currently, AWS Config supports only one retention configuration per region in your account.

  request - `com.amazonaws.services.config.model.PutRetentionConfigurationRequest`

  returns: Result of the PutRetentionConfiguration operation returned by the service. - `com.amazonaws.services.config.model.PutRetentionConfigurationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutRetentionConfigurationResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutRetentionConfigurationRequest request]
    (-> this (.putRetentionConfiguration request))))

(defn untag-resource
  "Deletes specified tags from a resource.

  request - `com.amazonaws.services.config.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.config.model.UntagResourceResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.UntagResourceResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-organization-config-rules
  "request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest`

  returns: Result of the DescribeOrganizationConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest request]
    (-> this (.describeOrganizationConfigRules request))))

(defn batch-get-resource-config
  "Returns the current configuration for one or more requested resources. The operation also returns a list of
   resources that are not processed in the current request. If there are no unprocessed resources, the operation
   returns an empty unprocessedResourceKeys list.





   The API does not return results for deleted resources.




   The API does not return any tags for the requested resources. This information is filtered out of the
   supplementaryConfiguration section of the API response.

  request - `com.amazonaws.services.config.model.BatchGetResourceConfigRequest`

  returns: Result of the BatchGetResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.BatchGetResourceConfigResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.BatchGetResourceConfigResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.BatchGetResourceConfigRequest request]
    (-> this (.batchGetResourceConfig request))))

(defn describe-remediation-execution-status
  "Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when
   steps for the remediation execution occur, and any error messages for steps that have failed. When you specify
   the limit and the next token, you receive a paginated response.

  request - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest`

  returns: Result of the DescribeRemediationExecutionStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchRemediationConfigurationException - You specified an AWS Config rule without a remediation configuration."
  (^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest request]
    (-> this (.describeRemediationExecutionStatus request))))

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

  request - `com.amazonaws.services.config.model.PutConfigRuleRequest`

  returns: Result of the PutConfigRule operation returned by the service. - `com.amazonaws.services.config.model.PutConfigRuleResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutConfigRuleRequest request]
    (-> this (.putConfigRule request))))

(defn describe-retention-configurations
  "Returns the details of one or more retention configurations. If the retention configuration name is not
   specified, this action returns the details for all the retention configurations for that account.



   Currently, AWS Config supports only one retention configuration per region in your account.

  request - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest`

  returns: Result of the DescribeRetentionConfigurations operation returned by the service. - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest request]
    (-> this (.describeRetentionConfigurations request))))

(defn select-resource-config
  "Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and
   returns resource configurations matching the properties.


   For more information about query components, see the  Query Components
    section in the AWS Config Developer Guide.

  request - `com.amazonaws.services.config.model.SelectResourceConfigRequest`

  returns: Result of the SelectResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.SelectResourceConfigResult`

  throws: com.amazonaws.services.config.model.InvalidExpressionException - The syntax of the query is incorrect."
  (^com.amazonaws.services.config.model.SelectResourceConfigResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.SelectResourceConfigRequest request]
    (-> this (.selectResourceConfig request))))

(defn describe-delivery-channels
  "Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
   the details of all delivery channels associated with the account.



   Currently, you can specify only one delivery channel per region in your account.

  request - `com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest`

  returns: Result of the DescribeDeliveryChannels operation returned by the service. - `com.amazonaws.services.config.model.DescribeDeliveryChannelsResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest request]
    (-> this (.describeDeliveryChannels request)))
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelsResult [^AmazonConfigClient this]
    (-> this (.describeDeliveryChannels))))

(defn describe-config-rule-evaluation-status
  "Returns status information for each of your AWS managed Config rules. The status includes information such as the
   last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error
   for the last failure.

  request - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest`

  returns: Result of the DescribeConfigRuleEvaluationStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest request]
    (-> this (.describeConfigRuleEvaluationStatus request)))
  (^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult [^AmazonConfigClient this]
    (-> this (.describeConfigRuleEvaluationStatus))))

(defn delete-evaluation-results
  "Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per
   request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start
   evaluating your AWS resources against the rule.

  request - `com.amazonaws.services.config.model.DeleteEvaluationResultsRequest`

  returns: Result of the DeleteEvaluationResults operation returned by the service. - `com.amazonaws.services.config.model.DeleteEvaluationResultsResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DeleteEvaluationResultsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteEvaluationResultsRequest request]
    (-> this (.deleteEvaluationResults request))))

(defn deliver-config-snapshot
  "Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
   the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have
   specified.




   Notification of the start of the delivery.




   Notification of the completion of the delivery, if the delivery was successfully completed.




   Notification of delivery failure, if the delivery failed.

  request - `com.amazonaws.services.config.model.DeliverConfigSnapshotRequest`

  returns: Result of the DeliverConfigSnapshot operation returned by the service. - `com.amazonaws.services.config.model.DeliverConfigSnapshotResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DeliverConfigSnapshotResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeliverConfigSnapshotRequest request]
    (-> this (.deliverConfigSnapshot request))))

(defn delete-organization-config-rule
  "request - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest`

  returns: Result of the DeleteOrganizationConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest request]
    (-> this (.deleteOrganizationConfigRule request))))

(defn describe-remediation-configurations
  "Returns the details of one or more remediation configurations.

  request - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest`

  returns: Result of the DescribeRemediationConfigurations operation returned by the service. - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult`"
  (^com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest request]
    (-> this (.describeRemediationConfigurations request))))

(defn describe-configuration-aggregators
  "Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified,
   this action returns the details for all the configuration aggregators associated with the account.

  request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest`

  returns: Result of the DescribeConfigurationAggregators operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest request]
    (-> this (.describeConfigurationAggregators request))))

(defn delete-delivery-channel
  "Deletes the delivery channel.


   Before you can delete the delivery channel, you must stop the configuration recorder by using the
   StopConfigurationRecorder action.

  request - `com.amazonaws.services.config.model.DeleteDeliveryChannelRequest`

  returns: Result of the DeleteDeliveryChannel operation returned by the service. - `com.amazonaws.services.config.model.DeleteDeliveryChannelResult`

  throws: com.amazonaws.services.config.model.NoSuchDeliveryChannelException - You have specified a delivery channel that does not exist."
  (^com.amazonaws.services.config.model.DeleteDeliveryChannelResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteDeliveryChannelRequest request]
    (-> this (.deleteDeliveryChannel request))))

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

  request - `com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest`

  returns: Result of the GetDiscoveredResourceCounts operation returned by the service. - `com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest request]
    (-> this (.getDiscoveredResourceCounts request))))

(defn get-compliance-summary-by-config-rule
  "Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.

  request - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest`

  returns: Result of the GetComplianceSummaryByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult`"
  (^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest request]
    (-> this (.getComplianceSummaryByConfigRule request)))
  (^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult [^AmazonConfigClient this]
    (-> this (.getComplianceSummaryByConfigRule))))

(defn delete-pending-aggregation-request
  "Deletes pending authorization requests for a specified aggregator account in a specified region.

  request - `com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest`

  returns: Result of the DeletePendingAggregationRequest operation returned by the service. - `com.amazonaws.services.config.model.DeletePendingAggregationRequestResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DeletePendingAggregationRequestResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest request]
    (-> this (.deletePendingAggregationRequest request))))

(defn list-aggregate-discovered-resources
  "Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource
   type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom
   resource name, source account, and source region. You can narrow the results to include only resources that have
   specific resource IDs, or a resource name, or source account ID, or source region.


   For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type
   AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910
   and region us-east-1.

  request - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest`

  returns: Result of the ListAggregateDiscoveredResources operation returned by the service. - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest request]
    (-> this (.listAggregateDiscoveredResources request))))

(defn start-remediation-execution
  "Runs an on-demand remediation for the specified AWS Config rules against the last known remediation
   configuration. It runs an execution against the current state of your resources. Remediation execution is
   asynchronous.


   You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified
   resource keys must complete before you can call the API again.

  request - `com.amazonaws.services.config.model.StartRemediationExecutionRequest`

  returns: Result of the StartRemediationExecution operation returned by the service. - `com.amazonaws.services.config.model.StartRemediationExecutionResult`

  throws: com.amazonaws.services.config.model.InsufficientPermissionsException - Indicates one of the following errors: The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the config:Put* action. The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions."
  (^com.amazonaws.services.config.model.StartRemediationExecutionResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.StartRemediationExecutionRequest request]
    (-> this (.startRemediationExecution request))))

(defn put-organization-config-rule
  "request - `com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest`

  returns: Result of the PutOrganizationConfigRule operation returned by the service. - `com.amazonaws.services.config.model.PutOrganizationConfigRuleResult`

  throws: com.amazonaws.services.config.model.MaxNumberOfOrganizationConfigRulesExceededException"
  (^com.amazonaws.services.config.model.PutOrganizationConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest request]
    (-> this (.putOrganizationConfigRule request))))

(defn describe-configuration-recorders
  "Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
   this action returns the details for all configuration recorders associated with the account.



   Currently, you can specify only one configuration recorder per region in your account.

  request - `com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest`

  returns: Result of the DescribeConfigurationRecorders operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationRecordersResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.DescribeConfigurationRecordersResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest request]
    (-> this (.describeConfigurationRecorders request)))
  (^com.amazonaws.services.config.model.DescribeConfigurationRecordersResult [^AmazonConfigClient this]
    (-> this (.describeConfigurationRecorders))))

(defn delete-remediation-configuration
  "Deletes the remediation configuration.

  request - `com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest`

  returns: Result of the DeleteRemediationConfiguration operation returned by the service. - `com.amazonaws.services.config.model.DeleteRemediationConfigurationResult`

  throws: com.amazonaws.services.config.model.NoSuchRemediationConfigurationException - You specified an AWS Config rule without a remediation configuration."
  (^com.amazonaws.services.config.model.DeleteRemediationConfigurationResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest request]
    (-> this (.deleteRemediationConfiguration request))))

(defn get-organization-config-rule-detailed-status
  "request - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest`

  returns: Result of the GetOrganizationConfigRuleDetailedStatus operation returned by the service. - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest request]
    (-> this (.getOrganizationConfigRuleDetailedStatus request))))

(defn get-aggregate-config-rule-compliance-summary
  "Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.



   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
   page.

  request - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest`

  returns: Result of the GetAggregateConfigRuleComplianceSummary operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest request]
    (-> this (.getAggregateConfigRuleComplianceSummary request))))

(defn list-discovered-resources
  "Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
   identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
   resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can
   narrow the results to include only resources that have specific resource IDs or a resource name.



   You can specify either resource IDs or a resource name, but not both, in the same request.



   The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize
   this number with the limit parameter. The response includes a nextToken string. To get
   the next page of results, run the request again and specify the string for the nextToken parameter.

  request - `com.amazonaws.services.config.model.ListDiscoveredResourcesRequest`

  returns: Result of the ListDiscoveredResources operation returned by the service. - `com.amazonaws.services.config.model.ListDiscoveredResourcesResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.ListDiscoveredResourcesResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.ListDiscoveredResourcesRequest request]
    (-> this (.listDiscoveredResources request))))

(defn describe-organization-config-rule-statuses
  "request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest`

  returns: Result of the DescribeOrganizationConfigRuleStatuses operation returned by the service. - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult`

  throws: com.amazonaws.services.config.model.NoSuchOrganizationConfigRuleException"
  (^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest request]
    (-> this (.describeOrganizationConfigRuleStatuses request))))

(defn put-remediation-configurations
  "Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action.
   The API creates the RemediationConfiguration object for the AWS Config rule. The AWS Config rule
   must already exist for you to add a remediation configuration. The target (SSM document) must exist and have
   permissions to use the target.

  request - `com.amazonaws.services.config.model.PutRemediationConfigurationsRequest`

  returns: Result of the PutRemediationConfigurations operation returned by the service. - `com.amazonaws.services.config.model.PutRemediationConfigurationsResult`

  throws: com.amazonaws.services.config.model.InsufficientPermissionsException - Indicates one of the following errors: The rule cannot be created because the IAM role assigned to AWS Config lacks permissions to perform the config:Put* action. The AWS Lambda function cannot be invoked. Check the function ARN, and check the function's permissions."
  (^com.amazonaws.services.config.model.PutRemediationConfigurationsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutRemediationConfigurationsRequest request]
    (-> this (.putRemediationConfigurations request))))

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

  request - `com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest`

  returns: Result of the DescribeComplianceByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest request]
    (-> this (.describeComplianceByConfigRule request)))
  (^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult [^AmazonConfigClient this]
    (-> this (.describeComplianceByConfigRule))))

(defn put-configuration-recorder
  "Creates a new configuration recorder to record the selected resource configurations.


   You can use this action to change the role roleARN or the recordingGroup of an existing
   recorder. To change the role, call the action on the existing configuration recorder and specify a role.



   Currently, you can specify only one configuration recorder per region in your account.


   If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is
   to record all supported resource types.

  request - `com.amazonaws.services.config.model.PutConfigurationRecorderRequest`

  returns: Result of the PutConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.PutConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.MaxNumberOfConfigurationRecordersExceededException - You have reached the limit of the number of recorders you can create."
  (^com.amazonaws.services.config.model.PutConfigurationRecorderResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutConfigurationRecorderRequest request]
    (-> this (.putConfigurationRecorder request))))

(defn batch-get-aggregate-resource-config
  "Returns the current configuration items for resources that are present in your AWS Config aggregator. The
   operation also returns a list of resources that are not processed in the current request. If there are no
   unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.





   The API does not return results for deleted resources.




   The API does not return tags and relationships.

  request - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest`

  returns: Result of the BatchGetAggregateResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest request]
    (-> this (.batchGetAggregateResourceConfig request))))

(defn describe-pending-aggregation-requests
  "Returns a list of all pending aggregation requests.

  request - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest`

  returns: Result of the DescribePendingAggregationRequests operation returned by the service. - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest request]
    (-> this (.describePendingAggregationRequests request))))

(defn put-aggregation-authorization
  "Authorizes the aggregator account and region to collect data from the source account and region.

  request - `com.amazonaws.services.config.model.PutAggregationAuthorizationRequest`

  returns: Result of the PutAggregationAuthorization operation returned by the service. - `com.amazonaws.services.config.model.PutAggregationAuthorizationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.PutAggregationAuthorizationResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.PutAggregationAuthorizationRequest request]
    (-> this (.putAggregationAuthorization request))))

(defn describe-configuration-recorder-status
  "Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
   this action returns the status of all configuration recorders associated with the account.



   Currently, you can specify only one configuration recorder per region in your account.

  request - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest`

  returns: Result of the DescribeConfigurationRecorderStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest request]
    (-> this (.describeConfigurationRecorderStatus request)))
  (^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult [^AmazonConfigClient this]
    (-> this (.describeConfigurationRecorderStatus))))

(defn delete-aggregation-authorization
  "Deletes the authorization granted to the specified configuration aggregator account in a specified region.

  request - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest`

  returns: Result of the DeleteAggregationAuthorization operation returned by the service. - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest request]
    (-> this (.deleteAggregationAuthorization request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonConfigClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-aggregate-resource-config
  "Returns configuration item that is aggregated for your specific resource in a specific source account and region.

  request - `com.amazonaws.services.config.model.GetAggregateResourceConfigRequest`

  returns: Result of the GetAggregateResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateResourceConfigResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.GetAggregateResourceConfigResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetAggregateResourceConfigRequest request]
    (-> this (.getAggregateResourceConfig request))))

(defn delete-configuration-aggregator
  "Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.

  request - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest`

  returns: Result of the DeleteConfigurationAggregator operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationAggregatorException - You have specified a configuration aggregator that does not exist."
  (^com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest request]
    (-> this (.deleteConfigurationAggregator request))))

(defn get-compliance-summary-by-resource-type
  "Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
   more resource types to get these numbers for each resource type. The maximum number returned is 100.

  request - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest`

  returns: Result of the GetComplianceSummaryByResourceType operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest request]
    (-> this (.getComplianceSummaryByResourceType request)))
  (^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult [^AmazonConfigClient this]
    (-> this (.getComplianceSummaryByResourceType))))

(defn tag-resource
  "Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
   not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
   with that resource are deleted as well.

  request - `com.amazonaws.services.config.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.config.model.TagResourceResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.TagResourceResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn stop-configuration-recorder
  "Stops recording configurations of the AWS resources you have selected to record in your AWS account.

  request - `com.amazonaws.services.config.model.StopConfigurationRecorderRequest`

  returns: Result of the StopConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.StopConfigurationRecorderResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigurationRecorderException - You have specified a configuration recorder that does not exist."
  (^com.amazonaws.services.config.model.StopConfigurationRecorderResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.StopConfigurationRecorderRequest request]
    (-> this (.stopConfigurationRecorder request))))

(defn delete-config-rule
  "Deletes the specified AWS Config rule and all of its evaluation results.


   AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a
   rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request
   for the rule, you will receive a ResourceInUseException.


   You can check the state of a rule by using the DescribeConfigRules request.

  request - `com.amazonaws.services.config.model.DeleteConfigRuleRequest`

  returns: Result of the DeleteConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigRuleResult`

  throws: com.amazonaws.services.config.model.NoSuchConfigRuleException - One or more AWS Config rules in the request are invalid. Verify that the rule names are correct and try again."
  (^com.amazonaws.services.config.model.DeleteConfigRuleResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DeleteConfigRuleRequest request]
    (-> this (.deleteConfigRule request))))

(defn describe-configuration-aggregator-sources-status
  "Returns status information for sources within an aggregator. The status includes information about the last time
   AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the
   status contains the related error code or message.

  request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest`

  returns: Result of the DescribeConfigurationAggregatorSourcesStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest request]
    (-> this (.describeConfigurationAggregatorSourcesStatus request))))

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

  request - `com.amazonaws.services.config.model.DescribeComplianceByResourceRequest`

  returns: Result of the DescribeComplianceByResource operation returned by the service. - `com.amazonaws.services.config.model.DescribeComplianceByResourceResult`

  throws: com.amazonaws.services.config.model.InvalidParameterValueException - One or more of the specified parameters are invalid. Verify that your parameters are valid and try again."
  (^com.amazonaws.services.config.model.DescribeComplianceByResourceResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeComplianceByResourceRequest request]
    (-> this (.describeComplianceByResource request)))
  (^com.amazonaws.services.config.model.DescribeComplianceByResourceResult [^AmazonConfigClient this]
    (-> this (.describeComplianceByResource))))

(defn describe-aggregate-compliance-by-config-rules
  "Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant
   rules.



   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
   page.

  request - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest`

  returns: Result of the DescribeAggregateComplianceByConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult`

  throws: com.amazonaws.services.config.model.ValidationException - The requested action is not valid."
  (^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult [^AmazonConfigClient this ^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest request]
    (-> this (.describeAggregateComplianceByConfigRules request))))

