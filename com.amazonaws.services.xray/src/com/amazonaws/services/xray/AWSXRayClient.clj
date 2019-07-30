(ns com.amazonaws.services.xray.AWSXRayClient
  "Client for accessing AWS X-Ray. All service calls made using this client are blocking, and will not return until the
  service call completes.


  AWS X-Ray provides APIs for managing debug traces and retrieving service maps and other data created by processing
  those traces."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.xray AWSXRayClient]))

(defn ->awsx-ray-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS X-Ray (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSXRayClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSXRayClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSXRayClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSXRayClient aws-credentials client-configuration))
  (^AWSXRayClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSXRayClient client-configuration))
  (^AWSXRayClient []
    (new AWSXRayClient )))

(defn *builder
  "returns: `com.amazonaws.services.xray.AWSXRayClientBuilder`"
  (^com.amazonaws.services.xray.AWSXRayClientBuilder []
    (AWSXRayClient/builder )))

(defn delete-group
  "Deletes a group resource.

  request - `com.amazonaws.services.xray.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.xray.model.DeleteGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.DeleteGroupResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn update-group
  "Updates a group resource.

  request - `com.amazonaws.services.xray.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.xray.model.UpdateGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.UpdateGroupResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn get-sampling-rules
  "Retrieves all sampling rules.

  request - `com.amazonaws.services.xray.model.GetSamplingRulesRequest`

  returns: Result of the GetSamplingRules operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingRulesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetSamplingRulesResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetSamplingRulesRequest request]
    (-> this (.getSamplingRules request))))

(defn get-groups
  "Retrieves all active group details.

  request - `com.amazonaws.services.xray.model.GetGroupsRequest`

  returns: Result of the GetGroups operation returned by the service. - `com.amazonaws.services.xray.model.GetGroupsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetGroupsResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetGroupsRequest request]
    (-> this (.getGroups request))))

(defn create-group
  "Creates a group resource with a name and a filter expression.

  request - `com.amazonaws.services.xray.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.xray.model.CreateGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.CreateGroupResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn get-encryption-config
  "Retrieves the current encryption configuration for X-Ray data.

  request - `com.amazonaws.services.xray.model.GetEncryptionConfigRequest`

  returns: Result of the GetEncryptionConfig operation returned by the service. - `com.amazonaws.services.xray.model.GetEncryptionConfigResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetEncryptionConfigResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetEncryptionConfigRequest request]
    (-> this (.getEncryptionConfig request))))

(defn update-sampling-rule
  "Modifies a sampling rule's configuration.

  request - `com.amazonaws.services.xray.model.UpdateSamplingRuleRequest`

  returns: Result of the UpdateSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.UpdateSamplingRuleResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.UpdateSamplingRuleResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.UpdateSamplingRuleRequest request]
    (-> this (.updateSamplingRule request))))

(defn put-telemetry-records
  "Used by the AWS X-Ray daemon to upload telemetry.

  request - `com.amazonaws.services.xray.model.PutTelemetryRecordsRequest`

  returns: Result of the PutTelemetryRecords operation returned by the service. - `com.amazonaws.services.xray.model.PutTelemetryRecordsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.PutTelemetryRecordsResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.PutTelemetryRecordsRequest request]
    (-> this (.putTelemetryRecords request))))

(defn get-time-series-service-statistics
  "Get an aggregation of service statistics defined by a specific time range.

  request - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest`

  returns: Result of the GetTimeSeriesServiceStatistics operation returned by the service. - `com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetTimeSeriesServiceStatisticsRequest request]
    (-> this (.getTimeSeriesServiceStatistics request))))

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

  request - `com.amazonaws.services.xray.model.GetTraceSummariesRequest`

  returns: Result of the GetTraceSummaries operation returned by the service. - `com.amazonaws.services.xray.model.GetTraceSummariesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetTraceSummariesResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetTraceSummariesRequest request]
    (-> this (.getTraceSummaries request))))

(defn get-trace-graph
  "Retrieves a service graph for one or more specific trace IDs.

  request - `com.amazonaws.services.xray.model.GetTraceGraphRequest`

  returns: Result of the GetTraceGraph operation returned by the service. - `com.amazonaws.services.xray.model.GetTraceGraphResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetTraceGraphResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetTraceGraphRequest request]
    (-> this (.getTraceGraph request))))

(defn get-sampling-statistic-summaries
  "Retrieves information about recent sampling results for all sampling rules.

  request - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest`

  returns: Result of the GetSamplingStatisticSummaries operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetSamplingStatisticSummariesRequest request]
    (-> this (.getSamplingStatisticSummaries request))))

(defn put-encryption-config
  "Updates the encryption configuration for X-Ray data.

  request - `com.amazonaws.services.xray.model.PutEncryptionConfigRequest`

  returns: Result of the PutEncryptionConfig operation returned by the service. - `com.amazonaws.services.xray.model.PutEncryptionConfigResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.PutEncryptionConfigResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.PutEncryptionConfigRequest request]
    (-> this (.putEncryptionConfig request))))

(defn delete-sampling-rule
  "Deletes a sampling rule.

  request - `com.amazonaws.services.xray.model.DeleteSamplingRuleRequest`

  returns: Result of the DeleteSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.DeleteSamplingRuleResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.DeleteSamplingRuleResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.DeleteSamplingRuleRequest request]
    (-> this (.deleteSamplingRule request))))

(defn get-service-graph
  "Retrieves a document that describes services that process incoming requests, and downstream services that they
   call as a result. Root services process incoming requests and make calls to downstream services. Root services
   are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP
   web APIs, or SQL databases.

  request - `com.amazonaws.services.xray.model.GetServiceGraphRequest`

  returns: Result of the GetServiceGraph operation returned by the service. - `com.amazonaws.services.xray.model.GetServiceGraphResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetServiceGraphResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetServiceGraphRequest request]
    (-> this (.getServiceGraph request))))

(defn get-sampling-targets
  "Requests a sampling quota for rules that the service is using to sample requests.

  request - `com.amazonaws.services.xray.model.GetSamplingTargetsRequest`

  returns: Result of the GetSamplingTargets operation returned by the service. - `com.amazonaws.services.xray.model.GetSamplingTargetsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetSamplingTargetsResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetSamplingTargetsRequest request]
    (-> this (.getSamplingTargets request))))

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

  request - `com.amazonaws.services.xray.model.PutTraceSegmentsRequest`

  returns: Result of the PutTraceSegments operation returned by the service. - `com.amazonaws.services.xray.model.PutTraceSegmentsResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.PutTraceSegmentsResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.PutTraceSegmentsRequest request]
    (-> this (.putTraceSegments request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSXRayClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn batch-get-traces
  "Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from
   a single request. Use GetTraceSummaries to get a list of trace IDs.

  request - `com.amazonaws.services.xray.model.BatchGetTracesRequest`

  returns: Result of the BatchGetTraces operation returned by the service. - `com.amazonaws.services.xray.model.BatchGetTracesResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.BatchGetTracesResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.BatchGetTracesRequest request]
    (-> this (.batchGetTraces request))))

(defn create-sampling-rule
  "Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with
   GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule
   matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports
   back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule
   contains a trace quota that the service can use instead of borrowing from the reservoir.

  request - `com.amazonaws.services.xray.model.CreateSamplingRuleRequest`

  returns: Result of the CreateSamplingRule operation returned by the service. - `com.amazonaws.services.xray.model.CreateSamplingRuleResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.CreateSamplingRuleResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.CreateSamplingRuleRequest request]
    (-> this (.createSamplingRule request))))

(defn get-group
  "Retrieves group resource details.

  request - `com.amazonaws.services.xray.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.xray.model.GetGroupResult`

  throws: com.amazonaws.services.xray.model.InvalidRequestException - The request is missing required parameters or has invalid parameters."
  (^com.amazonaws.services.xray.model.GetGroupResult [^AWSXRayClient this ^com.amazonaws.services.xray.model.GetGroupRequest request]
    (-> this (.getGroup request))))

