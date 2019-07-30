(ns com.amazonaws.services.xray.AWSXRayAsync
  "Interface for accessing AWS X-Ray asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSXRayAsync instead.



  AWS X-Ray provides APIs for managing debug traces and retrieving service maps and other data created by processing
  those traces."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.xray AWSXRayAsync]))

(defn put-telemetry-records-async
  "Used by the AWS X-Ray daemon to upload telemetry.

  put-telemetry-records-request - `com.amazonaws.services.xray.model.PutTelemetryRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutTelemetryRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.PutTelemetryRecordsResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.PutTelemetryRecordsRequest put-telemetry-records-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putTelemetryRecordsAsync put-telemetry-records-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.PutTelemetryRecordsRequest put-telemetry-records-request]
    (-> this (.putTelemetryRecordsAsync put-telemetry-records-request))))

(defn get-service-graph-async
  "Retrieves a document that describes services that process incoming requests, and downstream services that they
   call as a result. Root services process incoming requests and make calls to downstream services. Root services
   are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP
   web APIs, or SQL databases.

  get-service-graph-request - `com.amazonaws.services.xray.model.GetServiceGraphRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceGraph operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetServiceGraphResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetServiceGraphRequest get-service-graph-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceGraphAsync get-service-graph-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetServiceGraphRequest get-service-graph-request]
    (-> this (.getServiceGraphAsync get-service-graph-request))))

(defn get-encryption-config-async
  "Retrieves the current encryption configuration for X-Ray data.

  get-encryption-config-request - `com.amazonaws.services.xray.model.GetEncryptionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEncryptionConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetEncryptionConfigRequest get-encryption-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEncryptionConfigAsync get-encryption-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetEncryptionConfigRequest get-encryption-config-request]
    (-> this (.getEncryptionConfigAsync get-encryption-config-request))))

(defn create-group-async
  "Creates a group resource with a name and a filter expression.

  create-group-request - `com.amazonaws.services.xray.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.CreateGroupRequest create-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync create-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.CreateGroupRequest create-group-request]
    (-> this (.createGroupAsync create-group-request))))

(defn get-sampling-statistic-summaries-async
  "Retrieves information about recent sampling results for all sampling rules.

  get-sampling-statistic-summaries-request - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSamplingStatisticSummaries operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest get-sampling-statistic-summaries-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSamplingStatisticSummariesAsync get-sampling-statistic-summaries-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest get-sampling-statistic-summaries-request]
    (-> this (.getSamplingStatisticSummariesAsync get-sampling-statistic-summaries-request))))

(defn get-time-series-service-statistics-async
  "Get an aggregation of service statistics defined by a specific time range.

  get-time-series-service-statistics-request - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTimeSeriesServiceStatistics operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest get-time-series-service-statistics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTimeSeriesServiceStatisticsAsync get-time-series-service-statistics-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest get-time-series-service-statistics-request]
    (-> this (.getTimeSeriesServiceStatisticsAsync get-time-series-service-statistics-request))))

(defn get-sampling-rules-async
  "Retrieves all sampling rules.

  get-sampling-rules-request - `com.amazonaws.services.xray.model.GetSamplingRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSamplingRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetSamplingRulesResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingRulesRequest get-sampling-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSamplingRulesAsync get-sampling-rules-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingRulesRequest get-sampling-rules-request]
    (-> this (.getSamplingRulesAsync get-sampling-rules-request))))

(defn get-sampling-targets-async
  "Requests a sampling quota for rules that the service is using to sample requests.

  get-sampling-targets-request - `com.amazonaws.services.xray.model.GetSamplingTargetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSamplingTargets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetSamplingTargetsResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingTargetsRequest get-sampling-targets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSamplingTargetsAsync get-sampling-targets-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetSamplingTargetsRequest get-sampling-targets-request]
    (-> this (.getSamplingTargetsAsync get-sampling-targets-request))))

(defn update-group-async
  "Updates a group resource.

  update-group-request - `com.amazonaws.services.xray.model.UpdateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateGroupRequest update-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync update-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroupAsync update-group-request))))

(defn put-encryption-config-async
  "Updates the encryption configuration for X-Ray data.

  put-encryption-config-request - `com.amazonaws.services.xray.model.PutEncryptionConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEncryptionConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.PutEncryptionConfigResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.PutEncryptionConfigRequest put-encryption-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEncryptionConfigAsync put-encryption-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.PutEncryptionConfigRequest put-encryption-config-request]
    (-> this (.putEncryptionConfigAsync put-encryption-config-request))))

(defn update-sampling-rule-async
  "Modifies a sampling rule's configuration.

  update-sampling-rule-request - `com.amazonaws.services.xray.model.UpdateSamplingRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSamplingRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.UpdateSamplingRuleResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateSamplingRuleRequest update-sampling-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSamplingRuleAsync update-sampling-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.UpdateSamplingRuleRequest update-sampling-rule-request]
    (-> this (.updateSamplingRuleAsync update-sampling-rule-request))))

(defn put-trace-segments-async
  "Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray
   daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or
   an array of subsegments.


   Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment
   Documents in the AWS X-Ray Developer Guide.


   Required Segment Document Fields




   name - The name of the service that handled the request.




   id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
   digits.




   trace_id - A unique identifier that connects all segments and subsegments originating from a single
   client request.




   start_time - Time the segment or subsegment was created, in floating point seconds in epoch time,
   accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.




   end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or
   1.480615200090E9. Specify either an end_time or in_progress.




   in_progress - Set to true instead of specifying an end_time to record that
   a segment has been started, but is not complete. Send an in progress segment when your application receives a
   request that will take a long time to serve, to trace the fact that the request was received. When the response
   is sent, send the complete segment to overwrite the in-progress segment.




   A trace_id consists of three numbers separated by hyphens. For example,
   1-58406520-a006649127e371903a2de979. This includes:


   Trace ID Format




   The version number, i.e. 1.




   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
   2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.




   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.

  put-trace-segments-request - `com.amazonaws.services.xray.model.PutTraceSegmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutTraceSegments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.PutTraceSegmentsResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.PutTraceSegmentsRequest put-trace-segments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putTraceSegmentsAsync put-trace-segments-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.PutTraceSegmentsRequest put-trace-segments-request]
    (-> this (.putTraceSegmentsAsync put-trace-segments-request))))

(defn delete-sampling-rule-async
  "Deletes a sampling rule.

  delete-sampling-rule-request - `com.amazonaws.services.xray.model.DeleteSamplingRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSamplingRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.DeleteSamplingRuleResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteSamplingRuleRequest delete-sampling-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSamplingRuleAsync delete-sampling-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteSamplingRuleRequest delete-sampling-rule-request]
    (-> this (.deleteSamplingRuleAsync delete-sampling-rule-request))))

(defn get-group-async
  "Retrieves group resource details.

  get-group-request - `com.amazonaws.services.xray.model.GetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupRequest get-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync get-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupRequest get-group-request]
    (-> this (.getGroupAsync get-group-request))))

(defn create-sampling-rule-async
  "Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with
   GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule
   matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports
   back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule
   contains a trace quota that the service can use instead of borrowing from the reservoir.

  create-sampling-rule-request - `com.amazonaws.services.xray.model.CreateSamplingRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSamplingRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.CreateSamplingRuleResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.CreateSamplingRuleRequest create-sampling-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSamplingRuleAsync create-sampling-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.CreateSamplingRuleRequest create-sampling-rule-request]
    (-> this (.createSamplingRuleAsync create-sampling-rule-request))))

(defn get-trace-summaries-async
  "Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the
   full traces, pass the trace IDs to BatchGetTraces.


   A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come
   from a known user. For example, the following filter expression targets traces that pass through
   api.example.com:


   service(\"api.example.com\")


   This filter expression finds traces that have an annotation named account with the value
   12345:


   annotation.account = \"12345\"


   For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in
   the AWS X-Ray Developer Guide.

  get-trace-summaries-request - `com.amazonaws.services.xray.model.GetTraceSummariesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTraceSummaries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetTraceSummariesResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceSummariesRequest get-trace-summaries-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTraceSummariesAsync get-trace-summaries-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceSummariesRequest get-trace-summaries-request]
    (-> this (.getTraceSummariesAsync get-trace-summaries-request))))

(defn get-groups-async
  "Retrieves all active group details.

  get-groups-request - `com.amazonaws.services.xray.model.GetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetGroupsResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupsRequest get-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupsAsync get-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetGroupsRequest get-groups-request]
    (-> this (.getGroupsAsync get-groups-request))))

(defn get-trace-graph-async
  "Retrieves a service graph for one or more specific trace IDs.

  get-trace-graph-request - `com.amazonaws.services.xray.model.GetTraceGraphRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTraceGraph operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.GetTraceGraphResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceGraphRequest get-trace-graph-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTraceGraphAsync get-trace-graph-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.GetTraceGraphRequest get-trace-graph-request]
    (-> this (.getTraceGraphAsync get-trace-graph-request))))

(defn delete-group-async
  "Deletes a group resource.

  delete-group-request - `com.amazonaws.services.xray.model.DeleteGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteGroupRequest delete-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync delete-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroupAsync delete-group-request))))

(defn batch-get-traces-async
  "Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from
   a single request. Use GetTraceSummaries to get a list of trace IDs.

  batch-get-traces-request - `com.amazonaws.services.xray.model.BatchGetTracesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchGetTraces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.xray.model.BatchGetTracesResult>`"
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.BatchGetTracesRequest batch-get-traces-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchGetTracesAsync batch-get-traces-request async-handler)))
  (^java.util.concurrent.Future [^AWSXRayAsync this ^com.amazonaws.services.xray.model.BatchGetTracesRequest batch-get-traces-request]
    (-> this (.batchGetTracesAsync batch-get-traces-request))))

