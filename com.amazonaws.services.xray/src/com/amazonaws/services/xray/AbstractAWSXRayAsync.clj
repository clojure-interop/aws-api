(ns com.amazonaws.services.xray.AbstractAWSXRayAsync
  "Abstract implementation of AWSXRayAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.xray AbstractAWSXRayAsync]))

(defn put-telemetry-records-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.PutTelemetryRecordsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutTelemetryRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.PutTelemetryRecordsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.PutTelemetryRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putTelemetryRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.PutTelemetryRecordsRequest request]
    (-> this (.putTelemetryRecordsAsync request))))

(defn get-service-graph-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetServiceGraphRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceGraph operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetServiceGraphResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetServiceGraphRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceGraphAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetServiceGraphRequest request]
    (-> this (.getServiceGraphAsync request))))

(defn get-encryption-config-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetEncryptionConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEncryptionConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetEncryptionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEncryptionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetEncryptionConfigRequest request]
    (-> this (.getEncryptionConfigAsync request))))

(defn create-group-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.CreateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn get-sampling-statistic-summaries-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSamplingStatisticSummaries operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSamplingStatisticSummariesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest request]
    (-> this (.getSamplingStatisticSummariesAsync request))))

(defn get-time-series-service-statistics-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTimeSeriesServiceStatistics operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTimeSeriesServiceStatisticsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest request]
    (-> this (.getTimeSeriesServiceStatisticsAsync request))))

(defn get-sampling-rules-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetSamplingRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSamplingRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetSamplingRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSamplingRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingRulesRequest request]
    (-> this (.getSamplingRulesAsync request))))

(defn get-sampling-targets-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetSamplingTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSamplingTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetSamplingTargetsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSamplingTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingTargetsRequest request]
    (-> this (.getSamplingTargetsAsync request))))

(defn update-group-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.UpdateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateGroupRequest request]
    (-> this (.updateGroupAsync request))))

(defn put-encryption-config-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.PutEncryptionConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEncryptionConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.PutEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.PutEncryptionConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEncryptionConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.PutEncryptionConfigRequest request]
    (-> this (.putEncryptionConfigAsync request))))

(defn update-sampling-rule-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.UpdateSamplingRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSamplingRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.UpdateSamplingRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateSamplingRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSamplingRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateSamplingRuleRequest request]
    (-> this (.updateSamplingRuleAsync request))))

(defn put-trace-segments-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.PutTraceSegmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutTraceSegments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.PutTraceSegmentsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.PutTraceSegmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putTraceSegmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.PutTraceSegmentsRequest request]
    (-> this (.putTraceSegmentsAsync request))))

(defn delete-sampling-rule-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.DeleteSamplingRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSamplingRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.DeleteSamplingRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteSamplingRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSamplingRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteSamplingRuleRequest request]
    (-> this (.deleteSamplingRuleAsync request))))

(defn get-group-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupRequest request]
    (-> this (.getGroupAsync request))))

(defn create-sampling-rule-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.CreateSamplingRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSamplingRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.CreateSamplingRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.CreateSamplingRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSamplingRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.CreateSamplingRuleRequest request]
    (-> this (.createSamplingRuleAsync request))))

(defn get-trace-summaries-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetTraceSummariesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTraceSummaries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetTraceSummariesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceSummariesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTraceSummariesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceSummariesRequest request]
    (-> this (.getTraceSummariesAsync request))))

(defn get-groups-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupsRequest request]
    (-> this (.getGroupsAsync request))))

(defn get-trace-graph-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.GetTraceGraphRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTraceGraph operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetTraceGraphResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceGraphRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTraceGraphAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceGraphRequest request]
    (-> this (.getTraceGraphAsync request))))

(defn delete-group-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn batch-get-traces-async
  "Description copied from interface: AWSXRayAsync

  request - `com.amazonaws.services.xray.model.BatchGetTracesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetTraces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.BatchGetTracesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.BatchGetTracesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetTracesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSXRayAsync this ^com.amazonaws.services.xray.model.BatchGetTracesRequest request]
    (-> this (.batchGetTracesAsync request))))

