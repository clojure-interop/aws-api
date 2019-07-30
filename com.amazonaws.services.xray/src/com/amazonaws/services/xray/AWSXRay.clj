(ns com.amazonaws.services.xray.AWSXRay
  "Interface for accessing AWS X-Ray.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSXRay instead.



  AWS X-Ray provides APIs for managing debug traces and retrieving service maps and other data created by processing
  those traces."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.xray AWSXRay]))

(defn delete-group
  "Deletes a group resource.

  delete-group-request - `com.amazonaws.services.xray.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.xray.model.DeleteGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.DeleteGroupResult [^AWSXRay this ^com.amazonaws.services.xray.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroup delete-group-request))))

(defn update-group
  "Updates a group resource.

  update-group-request - `com.amazonaws.services.xray.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.xray.model.UpdateGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.UpdateGroupResult [^AWSXRay this ^com.amazonaws.services.xray.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroup update-group-request))))

(defn get-sampling-rules
  "Retrieves all sampling rules.

  get-sampling-rules-request - `com.amazonaws.services.xray.model.GetSamplingRulesRequest`

  returns: Result of the GetSamplingRules operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingRulesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetSamplingRulesResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetSamplingRulesRequest get-sampling-rules-request]
    (-> this (.getSamplingRules get-sampling-rules-request))))

(defn get-groups
  "Retrieves all active group details.

  get-groups-request - `com.amazonaws.services.xray.model.GetGroupsRequest`

  returns: Result of the GetGroups operation returned by the service. - `com.amazonaws.services.xray.model.GetGroupsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetGroupsResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetGroupsRequest get-groups-request]
    (-> this (.getGroups get-groups-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSXRay this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-group
  "Creates a group resource with a name and a filter expression.

  create-group-request - `com.amazonaws.services.xray.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.xray.model.CreateGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.CreateGroupResult [^AWSXRay this ^com.amazonaws.services.xray.model.CreateGroupRequest create-group-request]
    (-> this (.createGroup create-group-request))))

(defn get-encryption-config
  "Retrieves the current encryption configuration for X-Ray data.

  get-encryption-config-request - `com.amazonaws.services.xray.model.GetEncryptionConfigRequest`

  returns: Result of the GetEncryptionConfig operation returned by the service. - `com.amazonaws.services.xray.model.GetEncryptionConfigResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetEncryptionConfigResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetEncryptionConfigRequest get-encryption-config-request]
    (-> this (.getEncryptionConfig get-encryption-config-request))))

(defn update-sampling-rule
  "Modifies a sampling rule's configuration.

  update-sampling-rule-request - `com.amazonaws.services.xray.model.UpdateSamplingRuleRequest`

  returns: Result of the UpdateSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.UpdateSamplingRuleResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.UpdateSamplingRuleResult [^AWSXRay this ^com.amazonaws.services.xray.model.UpdateSamplingRuleRequest update-sampling-rule-request]
    (-> this (.updateSamplingRule update-sampling-rule-request))))

(defn put-telemetry-records
  "Used by the AWS X-Ray daemon to upload telemetry.

  put-telemetry-records-request - `com.amazonaws.services.xray.model.PutTelemetryRecordsRequest`

  returns: Result of the PutTelemetryRecords operation returned by the service. - `com.amazonaws.services.xray.model.PutTelemetryRecordsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.PutTelemetryRecordsResult [^AWSXRay this ^com.amazonaws.services.xray.model.PutTelemetryRecordsRequest put-telemetry-records-request]
    (-> this (.putTelemetryRecords put-telemetry-records-request))))

(defn get-time-series-service-statistics
  "Get an aggregation of service statistics defined by a specific time range.

  get-time-series-service-statistics-request - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest`

  returns: Result of the GetTimeSeriesServiceStatistics operation returned by the service. - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest get-time-series-service-statistics-request]
    (-> this (.getTimeSeriesServiceStatistics get-time-series-service-statistics-request))))

(defn get-trace-summaries
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

  returns: Result of the GetTraceSummaries operation returned by the service. - `com.amazonaws.services.xray.model.GetTraceSummariesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetTraceSummariesResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetTraceSummariesRequest get-trace-summaries-request]
    (-> this (.getTraceSummaries get-trace-summaries-request))))

(defn get-trace-graph
  "Retrieves a service graph for one or more specific trace IDs.

  get-trace-graph-request - `com.amazonaws.services.xray.model.GetTraceGraphRequest`

  returns: Result of the GetTraceGraph operation returned by the service. - `com.amazonaws.services.xray.model.GetTraceGraphResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetTraceGraphResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetTraceGraphRequest get-trace-graph-request]
    (-> this (.getTraceGraph get-trace-graph-request))))

(defn get-sampling-statistic-summaries
  "Retrieves information about recent sampling results for all sampling rules.

  get-sampling-statistic-summaries-request - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest`

  returns: Result of the GetSamplingStatisticSummaries operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest get-sampling-statistic-summaries-request]
    (-> this (.getSamplingStatisticSummaries get-sampling-statistic-summaries-request))))

(defn put-encryption-config
  "Updates the encryption configuration for X-Ray data.

  put-encryption-config-request - `com.amazonaws.services.xray.model.PutEncryptionConfigRequest`

  returns: Result of the PutEncryptionConfig operation returned by the service. - `com.amazonaws.services.xray.model.PutEncryptionConfigResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.PutEncryptionConfigResult [^AWSXRay this ^com.amazonaws.services.xray.model.PutEncryptionConfigRequest put-encryption-config-request]
    (-> this (.putEncryptionConfig put-encryption-config-request))))

(defn delete-sampling-rule
  "Deletes a sampling rule.

  delete-sampling-rule-request - `com.amazonaws.services.xray.model.DeleteSamplingRuleRequest`

  returns: Result of the DeleteSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.DeleteSamplingRuleResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.DeleteSamplingRuleResult [^AWSXRay this ^com.amazonaws.services.xray.model.DeleteSamplingRuleRequest delete-sampling-rule-request]
    (-> this (.deleteSamplingRule delete-sampling-rule-request))))

(defn get-service-graph
  "Retrieves a document that describes services that process incoming requests, and downstream services that they
   call as a result. Root services process incoming requests and make calls to downstream services. Root services
   are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP
   web APIs, or SQL databases.

  get-service-graph-request - `com.amazonaws.services.xray.model.GetServiceGraphRequest`

  returns: Result of the GetServiceGraph operation returned by the service. - `com.amazonaws.services.xray.model.GetServiceGraphResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetServiceGraphResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetServiceGraphRequest get-service-graph-request]
    (-> this (.getServiceGraph get-service-graph-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSXRay this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"xray.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"xray.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSXRay this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-sampling-targets
  "Requests a sampling quota for rules that the service is using to sample requests.

  get-sampling-targets-request - `com.amazonaws.services.xray.model.GetSamplingTargetsRequest`

  returns: Result of the GetSamplingTargets operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingTargetsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetSamplingTargetsResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetSamplingTargetsRequest get-sampling-targets-request]
    (-> this (.getSamplingTargets get-sampling-targets-request))))

(defn put-trace-segments
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

  returns: Result of the PutTraceSegments operation returned by the service. - `com.amazonaws.services.xray.model.PutTraceSegmentsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.PutTraceSegmentsResult [^AWSXRay this ^com.amazonaws.services.xray.model.PutTraceSegmentsRequest put-trace-segments-request]
    (-> this (.putTraceSegments put-trace-segments-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSXRay this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn batch-get-traces
  "Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from
   a single request. Use GetTraceSummaries to get a list of trace IDs.

  batch-get-traces-request - `com.amazonaws.services.xray.model.BatchGetTracesRequest`

  returns: Result of the BatchGetTraces operation returned by the service. - `com.amazonaws.services.xray.model.BatchGetTracesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.BatchGetTracesResult [^AWSXRay this ^com.amazonaws.services.xray.model.BatchGetTracesRequest batch-get-traces-request]
    (-> this (.batchGetTraces batch-get-traces-request))))

(defn create-sampling-rule
  "Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with
   GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule
   matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports
   back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule
   contains a trace quota that the service can use instead of borrowing from the reservoir.

  create-sampling-rule-request - `com.amazonaws.services.xray.model.CreateSamplingRuleRequest`

  returns: Result of the CreateSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.CreateSamplingRuleResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.CreateSamplingRuleResult [^AWSXRay this ^com.amazonaws.services.xray.model.CreateSamplingRuleRequest create-sampling-rule-request]
    (-> this (.createSamplingRule create-sampling-rule-request))))

(defn get-group
  "Retrieves group resource details.

  get-group-request - `com.amazonaws.services.xray.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.xray.model.GetGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetGroupResult [^AWSXRay this ^com.amazonaws.services.xray.model.GetGroupRequest get-group-request]
    (-> this (.getGroup get-group-request))))

