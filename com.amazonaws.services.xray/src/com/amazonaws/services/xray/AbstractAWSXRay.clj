(ns com.amazonaws.services.xray.AbstractAWSXRay
  "Abstract implementation of AWSXRay. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.xray AbstractAWSXRay]))

(defn delete-group
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.xray.model.DeleteGroupResult`"
  (^com.amazonaws.services.xray.model.DeleteGroupResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn update-group
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.xray.model.UpdateGroupResult`"
  (^com.amazonaws.services.xray.model.UpdateGroupResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn get-sampling-rules
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetSamplingRulesRequest`

  returns: Result of the GetSamplingRules operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingRulesResult`"
  (^com.amazonaws.services.xray.model.GetSamplingRulesResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetSamplingRulesRequest request]
    (-> this (.getSamplingRules request))))

(defn get-groups
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetGroupsRequest`

  returns: Result of the GetGroups operation returned by the service. - `com.amazonaws.services.xray.model.GetGroupsResult`"
  (^com.amazonaws.services.xray.model.GetGroupsResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetGroupsRequest request]
    (-> this (.getGroups request))))

(defn set-region
  "Description copied from interface: AWSXRay

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSXRay this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-group
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.xray.model.CreateGroupResult`"
  (^com.amazonaws.services.xray.model.CreateGroupResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn get-encryption-config
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetEncryptionConfigRequest`

  returns: Result of the GetEncryptionConfig operation returned by the service. - `com.amazonaws.services.xray.model.GetEncryptionConfigResult`"
  (^com.amazonaws.services.xray.model.GetEncryptionConfigResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetEncryptionConfigRequest request]
    (-> this (.getEncryptionConfig request))))

(defn update-sampling-rule
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.UpdateSamplingRuleRequest`

  returns: Result of the UpdateSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.UpdateSamplingRuleResult`"
  (^com.amazonaws.services.xray.model.UpdateSamplingRuleResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.UpdateSamplingRuleRequest request]
    (-> this (.updateSamplingRule request))))

(defn put-telemetry-records
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.PutTelemetryRecordsRequest`

  returns: Result of the PutTelemetryRecords operation returned by the service. - `com.amazonaws.services.xray.model.PutTelemetryRecordsResult`"
  (^com.amazonaws.services.xray.model.PutTelemetryRecordsResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.PutTelemetryRecordsRequest request]
    (-> this (.putTelemetryRecords request))))

(defn get-time-series-service-statistics
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest`

  returns: Result of the GetTimeSeriesServiceStatistics operation returned by the service. - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult`"
  (^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest request]
    (-> this (.getTimeSeriesServiceStatistics request))))

(defn get-trace-summaries
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetTraceSummariesRequest`

  returns: Result of the GetTraceSummaries operation returned by the service. - `com.amazonaws.services.xray.model.GetTraceSummariesResult`"
  (^com.amazonaws.services.xray.model.GetTraceSummariesResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetTraceSummariesRequest request]
    (-> this (.getTraceSummaries request))))

(defn get-trace-graph
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetTraceGraphRequest`

  returns: Result of the GetTraceGraph operation returned by the service. - `com.amazonaws.services.xray.model.GetTraceGraphResult`"
  (^com.amazonaws.services.xray.model.GetTraceGraphResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetTraceGraphRequest request]
    (-> this (.getTraceGraph request))))

(defn get-sampling-statistic-summaries
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest`

  returns: Result of the GetSamplingStatisticSummaries operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult`"
  (^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest request]
    (-> this (.getSamplingStatisticSummaries request))))

(defn put-encryption-config
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.PutEncryptionConfigRequest`

  returns: Result of the PutEncryptionConfig operation returned by the service. - `com.amazonaws.services.xray.model.PutEncryptionConfigResult`"
  (^com.amazonaws.services.xray.model.PutEncryptionConfigResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.PutEncryptionConfigRequest request]
    (-> this (.putEncryptionConfig request))))

(defn delete-sampling-rule
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.DeleteSamplingRuleRequest`

  returns: Result of the DeleteSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.DeleteSamplingRuleResult`"
  (^com.amazonaws.services.xray.model.DeleteSamplingRuleResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.DeleteSamplingRuleRequest request]
    (-> this (.deleteSamplingRule request))))

(defn get-service-graph
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetServiceGraphRequest`

  returns: Result of the GetServiceGraph operation returned by the service. - `com.amazonaws.services.xray.model.GetServiceGraphResult`"
  (^com.amazonaws.services.xray.model.GetServiceGraphResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetServiceGraphRequest request]
    (-> this (.getServiceGraph request))))

(defn shutdown
  "Description copied from interface: AWSXRay"
  ([^AbstractAWSXRay this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AWSXRay

  endpoint - The endpoint (ex: \"xray.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"xray.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSXRay this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-sampling-targets
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetSamplingTargetsRequest`

  returns: Result of the GetSamplingTargets operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingTargetsResult`"
  (^com.amazonaws.services.xray.model.GetSamplingTargetsResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetSamplingTargetsRequest request]
    (-> this (.getSamplingTargets request))))

(defn put-trace-segments
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.PutTraceSegmentsRequest`

  returns: Result of the PutTraceSegments operation returned by the service. - `com.amazonaws.services.xray.model.PutTraceSegmentsResult`"
  (^com.amazonaws.services.xray.model.PutTraceSegmentsResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.PutTraceSegmentsRequest request]
    (-> this (.putTraceSegments request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSXRay

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSXRay this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn batch-get-traces
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.BatchGetTracesRequest`

  returns: Result of the BatchGetTraces operation returned by the service. - `com.amazonaws.services.xray.model.BatchGetTracesResult`"
  (^com.amazonaws.services.xray.model.BatchGetTracesResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.BatchGetTracesRequest request]
    (-> this (.batchGetTraces request))))

(defn create-sampling-rule
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.CreateSamplingRuleRequest`

  returns: Result of the CreateSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.CreateSamplingRuleResult`"
  (^com.amazonaws.services.xray.model.CreateSamplingRuleResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.CreateSamplingRuleRequest request]
    (-> this (.createSamplingRule request))))

(defn get-group
  "Description copied from interface: AWSXRay

  request - `com.amazonaws.services.xray.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.xray.model.GetGroupResult`"
  (^com.amazonaws.services.xray.model.GetGroupResult [^AbstractAWSXRay this ^com.amazonaws.services.xray.model.GetGroupRequest request]
    (-> this (.getGroup request))))

