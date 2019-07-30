(ns com.amazonaws.services.config.AbstractAmazonConfigAsync
  "Abstract implementation of AmazonConfigAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.config AbstractAmazonConfigAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-compliance-summary-by-config-rule-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceSummaryByConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceSummaryByConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByConfigRuleRequest request]
    (-> this (.getComplianceSummaryByConfigRuleAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.getComplianceSummaryByConfigRuleAsync))))

(defn get-compliance-summary-by-resource-type-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceSummaryByResourceType operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceSummaryByResourceTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceSummaryByResourceTypeRequest request]
    (-> this (.getComplianceSummaryByResourceTypeAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.getComplianceSummaryByResourceTypeAsync))))

(defn describe-retention-configurations-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRetentionConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeRetentionConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRetentionConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRetentionConfigurationsRequest request]
    (-> this (.describeRetentionConfigurationsAsync request))))

(defn select-resource-config-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.SelectResourceConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SelectResourceConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.SelectResourceConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.SelectResourceConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.selectResourceConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.SelectResourceConfigRequest request]
    (-> this (.selectResourceConfigAsync request))))

(defn put-configuration-recorder-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the PutConfigurationRecorder action. - `com.amazonaws.services.config.model.PutConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationRecorderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationRecorderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationRecorderRequest request]
    (-> this (.putConfigurationRecorderAsync request))))

(defn describe-configuration-aggregators-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationAggregators operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationAggregatorsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAggregatorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorsRequest request]
    (-> this (.describeConfigurationAggregatorsAsync request))))

(defn describe-configuration-recorders-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the DescribeConfigurationRecorders action. - `com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRecorders operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationRecordersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRecordersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecordersRequest request]
    (-> this (.describeConfigurationRecordersAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeConfigurationRecordersAsync))))

(defn describe-remediation-execution-status-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRemediationExecutionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeRemediationExecutionStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRemediationExecutionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationExecutionStatusRequest request]
    (-> this (.describeRemediationExecutionStatusAsync request))))

(defn get-aggregate-discovered-resource-counts-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateDiscoveredResourceCounts operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateDiscoveredResourceCountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateDiscoveredResourceCountsRequest request]
    (-> this (.getAggregateDiscoveredResourceCountsAsync request))))

(defn describe-aggregation-authorizations-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAggregationAuthorizations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeAggregationAuthorizationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAggregationAuthorizationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregationAuthorizationsRequest request]
    (-> this (.describeAggregationAuthorizationsAsync request))))

(defn get-resource-config-history-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the GetResourceConfigHistory action. - `com.amazonaws.services.config.model.GetResourceConfigHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResourceConfigHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetResourceConfigHistoryResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetResourceConfigHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourceConfigHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetResourceConfigHistoryRequest request]
    (-> this (.getResourceConfigHistoryAsync request))))

(defn get-aggregate-compliance-details-by-config-rule-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateComplianceDetailsByConfigRule operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateComplianceDetailsByConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateComplianceDetailsByConfigRuleRequest request]
    (-> this (.getAggregateComplianceDetailsByConfigRuleAsync request))))

(defn describe-pending-aggregation-requests-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingAggregationRequests operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribePendingAggregationRequestsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingAggregationRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribePendingAggregationRequestsRequest request]
    (-> this (.describePendingAggregationRequestsAsync request))))

(defn put-config-rule-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.PutConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigRuleRequest request]
    (-> this (.putConfigRuleAsync request))))

(defn start-remediation-execution-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.StartRemediationExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartRemediationExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StartRemediationExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StartRemediationExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startRemediationExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StartRemediationExecutionRequest request]
    (-> this (.startRemediationExecutionAsync request))))

(defn list-aggregate-discovered-resources-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAggregateDiscoveredResources operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAggregateDiscoveredResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.ListAggregateDiscoveredResourcesRequest request]
    (-> this (.listAggregateDiscoveredResourcesAsync request))))

(defn delete-config-rule-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DeleteConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigRuleRequest request]
    (-> this (.deleteConfigRuleAsync request))))

(defn get-aggregate-config-rule-compliance-summary-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateConfigRuleComplianceSummary operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateConfigRuleComplianceSummaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateConfigRuleComplianceSummaryRequest request]
    (-> this (.getAggregateConfigRuleComplianceSummaryAsync request))))

(defn batch-get-aggregate-resource-config-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetAggregateResourceConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.BatchGetAggregateResourceConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetAggregateResourceConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetAggregateResourceConfigRequest request]
    (-> this (.batchGetAggregateResourceConfigAsync request))))

(defn describe-compliance-by-config-rule-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComplianceByConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeComplianceByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComplianceByConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByConfigRuleRequest request]
    (-> this (.describeComplianceByConfigRuleAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeComplianceByConfigRuleAsync))))

(defn start-config-rules-evaluation-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartConfigRulesEvaluation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StartConfigRulesEvaluationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startConfigRulesEvaluationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigRulesEvaluationRequest request]
    (-> this (.startConfigRulesEvaluationAsync request))))

(defn delete-configuration-aggregator-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationAggregator operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteConfigurationAggregatorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationAggregatorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationAggregatorRequest request]
    (-> this (.deleteConfigurationAggregatorAsync request))))

(defn delete-retention-configuration-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRetentionConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteRetentionConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRetentionConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRetentionConfigurationRequest request]
    (-> this (.deleteRetentionConfigurationAsync request))))

(defn describe-organization-config-rules-async
  "request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganizationConfigRules operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeOrganizationConfigRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationConfigRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRulesRequest request]
    (-> this (.describeOrganizationConfigRulesAsync request))))

(defn get-discovered-resource-counts-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiscoveredResourceCounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetDiscoveredResourceCountsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiscoveredResourceCountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetDiscoveredResourceCountsRequest request]
    (-> this (.getDiscoveredResourceCountsAsync request))))

(defn delete-aggregation-authorization-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAggregationAuthorization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteAggregationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAggregationAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteAggregationAuthorizationRequest request]
    (-> this (.deleteAggregationAuthorizationAsync request))))

(defn start-configuration-recorder-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the StartConfigurationRecorder action. - `com.amazonaws.services.config.model.StartConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StartConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigurationRecorderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startConfigurationRecorderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StartConfigurationRecorderRequest request]
    (-> this (.startConfigurationRecorderAsync request))))

(defn describe-delivery-channel-status-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the DeliveryChannelStatus action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeliveryChannelStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeDeliveryChannelStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeliveryChannelStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelStatusRequest request]
    (-> this (.describeDeliveryChannelStatusAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeDeliveryChannelStatusAsync))))

(defn get-compliance-details-by-config-rule-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceDetailsByConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceDetailsByConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByConfigRuleRequest request]
    (-> this (.getComplianceDetailsByConfigRuleAsync request))))

(defn put-organization-config-rule-async
  "request - `com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutOrganizationConfigRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutOrganizationConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putOrganizationConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutOrganizationConfigRuleRequest request]
    (-> this (.putOrganizationConfigRuleAsync request))))

(defn delete-evaluation-results-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DeleteEvaluationResultsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEvaluationResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteEvaluationResultsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteEvaluationResultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEvaluationResultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteEvaluationResultsRequest request]
    (-> this (.deleteEvaluationResultsAsync request))))

(defn get-aggregate-resource-config-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetAggregateResourceConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAggregateResourceConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetAggregateResourceConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateResourceConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAggregateResourceConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetAggregateResourceConfigRequest request]
    (-> this (.getAggregateResourceConfigAsync request))))

(defn get-organization-config-rule-detailed-status-async
  "request - `com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOrganizationConfigRuleDetailedStatus operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOrganizationConfigRuleDetailedStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetOrganizationConfigRuleDetailedStatusRequest request]
    (-> this (.getOrganizationConfigRuleDetailedStatusAsync request))))

(defn put-delivery-channel-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the PutDeliveryChannel action. - `com.amazonaws.services.config.model.PutDeliveryChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDeliveryChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutDeliveryChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutDeliveryChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDeliveryChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutDeliveryChannelRequest request]
    (-> this (.putDeliveryChannelAsync request))))

(defn describe-organization-config-rule-statuses-async
  "request - `com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganizationConfigRuleStatuses operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationConfigRuleStatusesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeOrganizationConfigRuleStatusesRequest request]
    (-> this (.describeOrganizationConfigRuleStatusesAsync request))))

(defn deliver-config-snapshot-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the DeliverConfigSnapshot action. - `com.amazonaws.services.config.model.DeliverConfigSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeliverConfigSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeliverConfigSnapshotResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeliverConfigSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deliverConfigSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeliverConfigSnapshotRequest request]
    (-> this (.deliverConfigSnapshotAsync request))))

(defn describe-config-rule-evaluation-status-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigRuleEvaluationStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigRuleEvaluationStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRuleEvaluationStatusRequest request]
    (-> this (.describeConfigRuleEvaluationStatusAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeConfigRuleEvaluationStatusAsync))))

(defn delete-remediation-configuration-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRemediationConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteRemediationConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRemediationConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteRemediationConfigurationRequest request]
    (-> this (.deleteRemediationConfigurationAsync request))))

(defn describe-configuration-recorder-status-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the DescribeConfigurationRecorderStatus action. - `com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationRecorderStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationRecorderStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationRecorderStatusRequest request]
    (-> this (.describeConfigurationRecorderStatusAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeConfigurationRecorderStatusAsync))))

(defn put-aggregation-authorization-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.PutAggregationAuthorizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAggregationAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutAggregationAuthorizationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutAggregationAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAggregationAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutAggregationAuthorizationRequest request]
    (-> this (.putAggregationAuthorizationAsync request))))

(defn describe-delivery-channels-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the DescribeDeliveryChannels action. - `com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDeliveryChannels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeDeliveryChannelsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeliveryChannelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeDeliveryChannelsRequest request]
    (-> this (.describeDeliveryChannelsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeDeliveryChannelsAsync))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn stop-configuration-recorder-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the StopConfigurationRecorder action. - `com.amazonaws.services.config.model.StopConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.StopConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StopConfigurationRecorderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopConfigurationRecorderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.StopConfigurationRecorderRequest request]
    (-> this (.stopConfigurationRecorderAsync request))))

(defn delete-pending-aggregation-request-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePendingAggregationRequest operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeletePendingAggregationRequestResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePendingAggregationRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeletePendingAggregationRequestRequest request]
    (-> this (.deletePendingAggregationRequestAsync request))))

(defn batch-get-resource-config-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.BatchGetResourceConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetResourceConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.BatchGetResourceConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetResourceConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetResourceConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.BatchGetResourceConfigRequest request]
    (-> this (.batchGetResourceConfigAsync request))))

(defn list-discovered-resources-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.ListDiscoveredResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDiscoveredResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.ListDiscoveredResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.ListDiscoveredResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDiscoveredResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.ListDiscoveredResourcesRequest request]
    (-> this (.listDiscoveredResourcesAsync request))))

(defn get-compliance-details-by-resource-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceDetailsByResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.GetComplianceDetailsByResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceDetailsByResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.GetComplianceDetailsByResourceRequest request]
    (-> this (.getComplianceDetailsByResourceAsync request))))

(defn put-remediation-configurations-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.PutRemediationConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRemediationConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutRemediationConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutRemediationConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRemediationConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutRemediationConfigurationsRequest request]
    (-> this (.putRemediationConfigurationsAsync request))))

(defn delete-configuration-recorder-async
  "Description copied from interface: AmazonConfigAsync

  request - The request object for the DeleteConfigurationRecorder action. - `com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationRecorder operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteConfigurationRecorderResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationRecorderAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteConfigurationRecorderRequest request]
    (-> this (.deleteConfigurationRecorderAsync request))))

(defn describe-compliance-by-resource-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeComplianceByResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeComplianceByResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeComplianceByResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeComplianceByResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeComplianceByResourceRequest request]
    (-> this (.describeComplianceByResourceAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeComplianceByResourceAsync))))

(defn delete-organization-config-rule-async
  "request - `com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOrganizationConfigRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteOrganizationConfigRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOrganizationConfigRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteOrganizationConfigRuleRequest request]
    (-> this (.deleteOrganizationConfigRuleAsync request))))

(defn describe-remediation-configurations-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRemediationConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeRemediationConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRemediationConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeRemediationConfigurationsRequest request]
    (-> this (.describeRemediationConfigurationsAsync request))))

(defn describe-configuration-aggregator-sources-status-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationAggregatorSourcesStatus operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationAggregatorSourcesStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigurationAggregatorSourcesStatusRequest request]
    (-> this (.describeConfigurationAggregatorSourcesStatusAsync request))))

(defn put-configuration-aggregator-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.PutConfigurationAggregatorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationAggregator operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutConfigurationAggregatorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationAggregatorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationAggregatorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutConfigurationAggregatorRequest request]
    (-> this (.putConfigurationAggregatorAsync request))))

(defn describe-config-rules-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeConfigRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeConfigRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeConfigRulesRequest request]
    (-> this (.describeConfigRulesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this]
    (-> this (.describeConfigRulesAsync))))

(defn tag-resource-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn describe-aggregate-compliance-by-config-rules-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAggregateComplianceByConfigRules operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAggregateComplianceByConfigRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DescribeAggregateComplianceByConfigRulesRequest request]
    (-> this (.describeAggregateComplianceByConfigRulesAsync request))))

(defn put-evaluations-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.PutEvaluationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEvaluations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutEvaluationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutEvaluationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEvaluationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutEvaluationsRequest request]
    (-> this (.putEvaluationsAsync request))))

(defn delete-delivery-channel-async
  "Description copied from interface: AmazonConfigAsync

  request - The input for the DeleteDeliveryChannel action. The action accepts the following data, in JSON format. - `com.amazonaws.services.config.model.DeleteDeliveryChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDeliveryChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.DeleteDeliveryChannelResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteDeliveryChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDeliveryChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.DeleteDeliveryChannelRequest request]
    (-> this (.deleteDeliveryChannelAsync request))))

(defn put-retention-configuration-async
  "Description copied from interface: AmazonConfigAsync

  request - `com.amazonaws.services.config.model.PutRetentionConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRetentionConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.config.model.PutRetentionConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutRetentionConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRetentionConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonConfigAsync this ^com.amazonaws.services.config.model.PutRetentionConfigurationRequest request]
    (-> this (.putRetentionConfigurationAsync request))))

