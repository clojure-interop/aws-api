(ns com.amazonaws.services.config.AbstractAmazonConfig
  "Abstract implementation of AmazonConfig. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.config AbstractAmazonConfig]))

(defn get-aggregate-compliance-details-by-config-rule
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest`

  returns: Result of the GetAggregateComplianceDetailsByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult`"
  (^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest request]
    (-> this (.getAggregateComplianceDetailsByConfigRule request))))

(defn delete-retention-configuration
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest`

  returns: Result of the DeleteRetentionConfiguration operation returned by the service. - `com.amazonaws.services.config.model.DeleteRetentionConfigurationResult`"
  (^com.amazonaws.services.config.model.DeleteRetentionConfigurationResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest request]
    (-> this (.deleteRetentionConfiguration request))))

(defn put-configuration-aggregator
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.PutConfigurationAggregatorRequest`

  returns: Result of the PutConfigurationAggregator operation returned by the service. - `com.amazonaws.services.config.model.PutConfigurationAggregatorResult`"
  (^com.amazonaws.services.config.model.PutConfigurationAggregatorResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutConfigurationAggregatorRequest request]
    (-> this (.putConfigurationAggregator request))))

(defn get-resource-config-history
  "Description copied from interface: AmazonConfig

  request - The input for the GetResourceConfigHistory action. - `com.amazonaws.services.config.model.GetResourceConfigHistoryRequest`

  returns: Result of the GetResourceConfigHistory operation returned by the service. - `com.amazonaws.services.config.model.GetResourceConfigHistoryResult`"
  (^com.amazonaws.services.config.model.GetResourceConfigHistoryResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetResourceConfigHistoryRequest request]
    (-> this (.getResourceConfigHistory request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.config.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.config.model.ListTagsForResourceResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-aggregation-authorizations
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest`

  returns: Result of the DescribeAggregationAuthorizations operation returned by the service. - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult`"
  (^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest request]
    (-> this (.describeAggregationAuthorizations request))))

(defn put-evaluations
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.PutEvaluationsRequest`

  returns: Result of the PutEvaluations operation returned by the service. - `com.amazonaws.services.config.model.PutEvaluationsResult`"
  (^com.amazonaws.services.config.model.PutEvaluationsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutEvaluationsRequest request]
    (-> this (.putEvaluations request))))

(defn put-delivery-channel
  "Description copied from interface: AmazonConfig

  request - The input for the PutDeliveryChannel action. - `com.amazonaws.services.config.model.PutDeliveryChannelRequest`

  returns: Result of the PutDeliveryChannel operation returned by the service. - `com.amazonaws.services.config.model.PutDeliveryChannelResult`"
  (^com.amazonaws.services.config.model.PutDeliveryChannelResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutDeliveryChannelRequest request]
    (-> this (.putDeliveryChannel request))))

(defn get-compliance-details-by-resource
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest`

  returns: Result of the GetComplianceDetailsByResource operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult`"
  (^com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest request]
    (-> this (.getComplianceDetailsByResource request))))

(defn set-region
  "Description copied from interface: AmazonConfig

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonConfig this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-aggregate-discovered-resource-counts
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest`

  returns: Result of the GetAggregateDiscoveredResourceCounts operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult`"
  (^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest request]
    (-> this (.getAggregateDiscoveredResourceCounts request))))

(defn start-configuration-recorder
  "Description copied from interface: AmazonConfig

  request - The input for the StartConfigurationRecorder action. - `com.amazonaws.services.config.model.StartConfigurationRecorderRequest`

  returns: Result of the StartConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.StartConfigurationRecorderResult`"
  (^com.amazonaws.services.config.model.StartConfigurationRecorderResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.StartConfigurationRecorderRequest request]
    (-> this (.startConfigurationRecorder request))))

(defn delete-configuration-recorder
  "Description copied from interface: AmazonConfig

  request - The request object for the DeleteConfigurationRecorder action. - `com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest`

  returns: Result of the DeleteConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigurationRecorderResult`"
  (^com.amazonaws.services.config.model.DeleteConfigurationRecorderResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest request]
    (-> this (.deleteConfigurationRecorder request))))

(defn get-compliance-details-by-config-rule
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest`

  returns: Result of the GetComplianceDetailsByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult`"
  (^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest request]
    (-> this (.getComplianceDetailsByConfigRule request))))

(defn describe-config-rules
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeConfigRulesRequest`

  returns: Result of the DescribeConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigRulesResult`"
  (^com.amazonaws.services.config.model.DescribeConfigRulesResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigRulesRequest request]
    (-> this (.describeConfigRules request)))
  (^com.amazonaws.services.config.model.DescribeConfigRulesResult [^AbstractAmazonConfig this]
    (-> this (.describeConfigRules))))

(defn start-config-rules-evaluation
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest`

  returns: Result of the StartConfigRulesEvaluation operation returned by the service. - `com.amazonaws.services.config.model.StartConfigRulesEvaluationResult`"
  (^com.amazonaws.services.config.model.StartConfigRulesEvaluationResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest request]
    (-> this (.startConfigRulesEvaluation request))))

(defn describe-delivery-channel-status
  "Description copied from interface: AmazonConfig

  request - The input for the DeliveryChannelStatus action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest`

  returns: Result of the DescribeDeliveryChannelStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult`"
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest request]
    (-> this (.describeDeliveryChannelStatus request)))
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult [^AbstractAmazonConfig this]
    (-> this (.describeDeliveryChannelStatus))))

(defn put-retention-configuration
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.PutRetentionConfigurationRequest`

  returns: Result of the PutRetentionConfiguration operation returned by the service. - `com.amazonaws.services.config.model.PutRetentionConfigurationResult`"
  (^com.amazonaws.services.config.model.PutRetentionConfigurationResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutRetentionConfigurationRequest request]
    (-> this (.putRetentionConfiguration request))))

(defn untag-resource
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.config.model.UntagResourceResult`"
  (^com.amazonaws.services.config.model.UntagResourceResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-organization-config-rules
  "request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest`

  returns: Result of the DescribeOrganizationConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult`"
  (^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest request]
    (-> this (.describeOrganizationConfigRules request))))

(defn batch-get-resource-config
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.BatchGetResourceConfigRequest`

  returns: Result of the BatchGetResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.BatchGetResourceConfigResult`"
  (^com.amazonaws.services.config.model.BatchGetResourceConfigResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.BatchGetResourceConfigRequest request]
    (-> this (.batchGetResourceConfig request))))

(defn describe-remediation-execution-status
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest`

  returns: Result of the DescribeRemediationExecutionStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult`"
  (^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest request]
    (-> this (.describeRemediationExecutionStatus request))))

(defn put-config-rule
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.PutConfigRuleRequest`

  returns: Result of the PutConfigRule operation returned by the service. - `com.amazonaws.services.config.model.PutConfigRuleResult`"
  (^com.amazonaws.services.config.model.PutConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutConfigRuleRequest request]
    (-> this (.putConfigRule request))))

(defn describe-retention-configurations
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest`

  returns: Result of the DescribeRetentionConfigurations operation returned by the service. - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult`"
  (^com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest request]
    (-> this (.describeRetentionConfigurations request))))

(defn select-resource-config
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.SelectResourceConfigRequest`

  returns: Result of the SelectResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.SelectResourceConfigResult`"
  (^com.amazonaws.services.config.model.SelectResourceConfigResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.SelectResourceConfigRequest request]
    (-> this (.selectResourceConfig request))))

(defn describe-delivery-channels
  "Description copied from interface: AmazonConfig

  request - The input for the DescribeDeliveryChannels action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest`

  returns: Result of the DescribeDeliveryChannels operation returned by the service. - `com.amazonaws.services.config.model.DescribeDeliveryChannelsResult`"
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest request]
    (-> this (.describeDeliveryChannels request)))
  (^com.amazonaws.services.config.model.DescribeDeliveryChannelsResult [^AbstractAmazonConfig this]
    (-> this (.describeDeliveryChannels))))

(defn describe-config-rule-evaluation-status
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest`

  returns: Result of the DescribeConfigRuleEvaluationStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult`"
  (^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest request]
    (-> this (.describeConfigRuleEvaluationStatus request)))
  (^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult [^AbstractAmazonConfig this]
    (-> this (.describeConfigRuleEvaluationStatus))))

(defn delete-evaluation-results
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DeleteEvaluationResultsRequest`

  returns: Result of the DeleteEvaluationResults operation returned by the service. - `com.amazonaws.services.config.model.DeleteEvaluationResultsResult`"
  (^com.amazonaws.services.config.model.DeleteEvaluationResultsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteEvaluationResultsRequest request]
    (-> this (.deleteEvaluationResults request))))

(defn deliver-config-snapshot
  "Description copied from interface: AmazonConfig

  request - The input for the DeliverConfigSnapshot action. - `com.amazonaws.services.config.model.DeliverConfigSnapshotRequest`

  returns: Result of the DeliverConfigSnapshot operation returned by the service. - `com.amazonaws.services.config.model.DeliverConfigSnapshotResult`"
  (^com.amazonaws.services.config.model.DeliverConfigSnapshotResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeliverConfigSnapshotRequest request]
    (-> this (.deliverConfigSnapshot request))))

(defn delete-organization-config-rule
  "request - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest`

  returns: Result of the DeleteOrganizationConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult`"
  (^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest request]
    (-> this (.deleteOrganizationConfigRule request))))

(defn describe-remediation-configurations
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest`

  returns: Result of the DescribeRemediationConfigurations operation returned by the service. - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult`"
  (^com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest request]
    (-> this (.describeRemediationConfigurations request))))

(defn shutdown
  "Description copied from interface: AmazonConfig"
  ([^AbstractAmazonConfig this]
    (-> this (.shutdown))))

(defn describe-configuration-aggregators
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest`

  returns: Result of the DescribeConfigurationAggregators operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult`"
  (^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest request]
    (-> this (.describeConfigurationAggregators request))))

(defn delete-delivery-channel
  "Description copied from interface: AmazonConfig

  request - The input for the DeleteDeliveryChannel action. The action accepts the following data, in JSON format. - `com.amazonaws.services.config.model.DeleteDeliveryChannelRequest`

  returns: Result of the DeleteDeliveryChannel operation returned by the service. - `com.amazonaws.services.config.model.DeleteDeliveryChannelResult`"
  (^com.amazonaws.services.config.model.DeleteDeliveryChannelResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteDeliveryChannelRequest request]
    (-> this (.deleteDeliveryChannel request))))

(defn get-discovered-resource-counts
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest`

  returns: Result of the GetDiscoveredResourceCounts operation returned by the service. - `com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult`"
  (^com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest request]
    (-> this (.getDiscoveredResourceCounts request))))

(defn get-compliance-summary-by-config-rule
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest`

  returns: Result of the GetComplianceSummaryByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult`"
  (^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest request]
    (-> this (.getComplianceSummaryByConfigRule request)))
  (^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult [^AbstractAmazonConfig this]
    (-> this (.getComplianceSummaryByConfigRule))))

(defn delete-pending-aggregation-request
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest`

  returns: Result of the DeletePendingAggregationRequest operation returned by the service. - `com.amazonaws.services.config.model.DeletePendingAggregationRequestResult`"
  (^com.amazonaws.services.config.model.DeletePendingAggregationRequestResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest request]
    (-> this (.deletePendingAggregationRequest request))))

(defn list-aggregate-discovered-resources
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest`

  returns: Result of the ListAggregateDiscoveredResources operation returned by the service. - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult`"
  (^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest request]
    (-> this (.listAggregateDiscoveredResources request))))

(defn start-remediation-execution
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.StartRemediationExecutionRequest`

  returns: Result of the StartRemediationExecution operation returned by the service. - `com.amazonaws.services.config.model.StartRemediationExecutionResult`"
  (^com.amazonaws.services.config.model.StartRemediationExecutionResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.StartRemediationExecutionRequest request]
    (-> this (.startRemediationExecution request))))

(defn set-endpoint
  "Description copied from interface: AmazonConfig

  endpoint - The endpoint (ex: \"config.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"config.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonConfig this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn put-organization-config-rule
  "request - `com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest`

  returns: Result of the PutOrganizationConfigRule operation returned by the service. - `com.amazonaws.services.config.model.PutOrganizationConfigRuleResult`"
  (^com.amazonaws.services.config.model.PutOrganizationConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest request]
    (-> this (.putOrganizationConfigRule request))))

(defn describe-configuration-recorders
  "Description copied from interface: AmazonConfig

  request - The input for the DescribeConfigurationRecorders action. - `com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest`

  returns: Result of the DescribeConfigurationRecorders operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationRecordersResult`"
  (^com.amazonaws.services.config.model.DescribeConfigurationRecordersResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest request]
    (-> this (.describeConfigurationRecorders request)))
  (^com.amazonaws.services.config.model.DescribeConfigurationRecordersResult [^AbstractAmazonConfig this]
    (-> this (.describeConfigurationRecorders))))

(defn delete-remediation-configuration
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest`

  returns: Result of the DeleteRemediationConfiguration operation returned by the service. - `com.amazonaws.services.config.model.DeleteRemediationConfigurationResult`"
  (^com.amazonaws.services.config.model.DeleteRemediationConfigurationResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest request]
    (-> this (.deleteRemediationConfiguration request))))

(defn get-organization-config-rule-detailed-status
  "request - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest`

  returns: Result of the GetOrganizationConfigRuleDetailedStatus operation returned by the service. - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult`"
  (^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest request]
    (-> this (.getOrganizationConfigRuleDetailedStatus request))))

(defn get-aggregate-config-rule-compliance-summary
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest`

  returns: Result of the GetAggregateConfigRuleComplianceSummary operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult`"
  (^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest request]
    (-> this (.getAggregateConfigRuleComplianceSummary request))))

(defn list-discovered-resources
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.ListDiscoveredResourcesRequest`

  returns: Result of the ListDiscoveredResources operation returned by the service. - `com.amazonaws.services.config.model.ListDiscoveredResourcesResult`"
  (^com.amazonaws.services.config.model.ListDiscoveredResourcesResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.ListDiscoveredResourcesRequest request]
    (-> this (.listDiscoveredResources request))))

(defn describe-organization-config-rule-statuses
  "request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest`

  returns: Result of the DescribeOrganizationConfigRuleStatuses operation returned by the service. - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult`"
  (^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest request]
    (-> this (.describeOrganizationConfigRuleStatuses request))))

(defn put-remediation-configurations
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.PutRemediationConfigurationsRequest`

  returns: Result of the PutRemediationConfigurations operation returned by the service. - `com.amazonaws.services.config.model.PutRemediationConfigurationsResult`"
  (^com.amazonaws.services.config.model.PutRemediationConfigurationsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutRemediationConfigurationsRequest request]
    (-> this (.putRemediationConfigurations request))))

(defn describe-compliance-by-config-rule
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest`

  returns: Result of the DescribeComplianceByConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult`"
  (^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest request]
    (-> this (.describeComplianceByConfigRule request)))
  (^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult [^AbstractAmazonConfig this]
    (-> this (.describeComplianceByConfigRule))))

(defn put-configuration-recorder
  "Description copied from interface: AmazonConfig

  request - The input for the PutConfigurationRecorder action. - `com.amazonaws.services.config.model.PutConfigurationRecorderRequest`

  returns: Result of the PutConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.PutConfigurationRecorderResult`"
  (^com.amazonaws.services.config.model.PutConfigurationRecorderResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutConfigurationRecorderRequest request]
    (-> this (.putConfigurationRecorder request))))

(defn batch-get-aggregate-resource-config
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest`

  returns: Result of the BatchGetAggregateResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult`"
  (^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest request]
    (-> this (.batchGetAggregateResourceConfig request))))

(defn describe-pending-aggregation-requests
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest`

  returns: Result of the DescribePendingAggregationRequests operation returned by the service. - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult`"
  (^com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest request]
    (-> this (.describePendingAggregationRequests request))))

(defn put-aggregation-authorization
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.PutAggregationAuthorizationRequest`

  returns: Result of the PutAggregationAuthorization operation returned by the service. - `com.amazonaws.services.config.model.PutAggregationAuthorizationResult`"
  (^com.amazonaws.services.config.model.PutAggregationAuthorizationResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.PutAggregationAuthorizationRequest request]
    (-> this (.putAggregationAuthorization request))))

(defn describe-configuration-recorder-status
  "Description copied from interface: AmazonConfig

  request - The input for the DescribeConfigurationRecorderStatus action. - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest`

  returns: Result of the DescribeConfigurationRecorderStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult`"
  (^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest request]
    (-> this (.describeConfigurationRecorderStatus request)))
  (^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult [^AbstractAmazonConfig this]
    (-> this (.describeConfigurationRecorderStatus))))

(defn delete-aggregation-authorization
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest`

  returns: Result of the DeleteAggregationAuthorization operation returned by the service. - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult`"
  (^com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest request]
    (-> this (.deleteAggregationAuthorization request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonConfig

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonConfig this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-aggregate-resource-config
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetAggregateResourceConfigRequest`

  returns: Result of the GetAggregateResourceConfig operation returned by the service. - `com.amazonaws.services.config.model.GetAggregateResourceConfigResult`"
  (^com.amazonaws.services.config.model.GetAggregateResourceConfigResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetAggregateResourceConfigRequest request]
    (-> this (.getAggregateResourceConfig request))))

(defn delete-configuration-aggregator
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest`

  returns: Result of the DeleteConfigurationAggregator operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult`"
  (^com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest request]
    (-> this (.deleteConfigurationAggregator request))))

(defn get-compliance-summary-by-resource-type
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest`

  returns: Result of the GetComplianceSummaryByResourceType operation returned by the service. - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult`"
  (^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest request]
    (-> this (.getComplianceSummaryByResourceType request)))
  (^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult [^AbstractAmazonConfig this]
    (-> this (.getComplianceSummaryByResourceType))))

(defn tag-resource
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.config.model.TagResourceResult`"
  (^com.amazonaws.services.config.model.TagResourceResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn stop-configuration-recorder
  "Description copied from interface: AmazonConfig

  request - The input for the StopConfigurationRecorder action. - `com.amazonaws.services.config.model.StopConfigurationRecorderRequest`

  returns: Result of the StopConfigurationRecorder operation returned by the service. - `com.amazonaws.services.config.model.StopConfigurationRecorderResult`"
  (^com.amazonaws.services.config.model.StopConfigurationRecorderResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.StopConfigurationRecorderRequest request]
    (-> this (.stopConfigurationRecorder request))))

(defn delete-config-rule
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DeleteConfigRuleRequest`

  returns: Result of the DeleteConfigRule operation returned by the service. - `com.amazonaws.services.config.model.DeleteConfigRuleResult`"
  (^com.amazonaws.services.config.model.DeleteConfigRuleResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DeleteConfigRuleRequest request]
    (-> this (.deleteConfigRule request))))

(defn describe-configuration-aggregator-sources-status
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest`

  returns: Result of the DescribeConfigurationAggregatorSourcesStatus operation returned by the service. - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult`"
  (^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest request]
    (-> this (.describeConfigurationAggregatorSourcesStatus request))))

(defn describe-compliance-by-resource
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeComplianceByResourceRequest`

  returns: Result of the DescribeComplianceByResource operation returned by the service. - `com.amazonaws.services.config.model.DescribeComplianceByResourceResult`"
  (^com.amazonaws.services.config.model.DescribeComplianceByResourceResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeComplianceByResourceRequest request]
    (-> this (.describeComplianceByResource request)))
  (^com.amazonaws.services.config.model.DescribeComplianceByResourceResult [^AbstractAmazonConfig this]
    (-> this (.describeComplianceByResource))))

(defn describe-aggregate-compliance-by-config-rules
  "Description copied from interface: AmazonConfig

  request - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest`

  returns: Result of the DescribeAggregateComplianceByConfigRules operation returned by the service. - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult`"
  (^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult [^AbstractAmazonConfig this ^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest request]
    (-> this (.describeAggregateComplianceByConfigRules request))))

