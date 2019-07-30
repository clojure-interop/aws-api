(ns com.amazonaws.services.logs.AbstractAWSLogs
  "Abstract implementation of AWSLogs. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.logs AbstractAWSLogs]))

(defn get-log-group-fields
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.GetLogGroupFieldsRequest`

  returns: Result of the GetLogGroupFields operation returned by the service. - `com.amazonaws.services.logs.model.GetLogGroupFieldsResult`"
  (^com.amazonaws.services.logs.model.GetLogGroupFieldsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.GetLogGroupFieldsRequest request]
    (-> this (.getLogGroupFields request))))

(defn create-export-task
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.CreateExportTaskRequest`

  returns: Result of the CreateExportTask operation returned by the service. - `com.amazonaws.services.logs.model.CreateExportTaskResult`"
  (^com.amazonaws.services.logs.model.CreateExportTaskResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.CreateExportTaskRequest request]
    (-> this (.createExportTask request))))

(defn delete-log-stream
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DeleteLogStreamRequest`

  returns: Result of the DeleteLogStream operation returned by the service. - `com.amazonaws.services.logs.model.DeleteLogStreamResult`"
  (^com.amazonaws.services.logs.model.DeleteLogStreamResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DeleteLogStreamRequest request]
    (-> this (.deleteLogStream request))))

(defn disassociate-kms-key
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DisassociateKmsKeyRequest`

  returns: Result of the DisassociateKmsKey operation returned by the service. - `com.amazonaws.services.logs.model.DisassociateKmsKeyResult`"
  (^com.amazonaws.services.logs.model.DisassociateKmsKeyResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DisassociateKmsKeyRequest request]
    (-> this (.disassociateKmsKey request))))

(defn set-region
  "Description copied from interface: AWSLogs

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSLogs this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-metric-filter
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DeleteMetricFilterRequest`

  returns: Result of the DeleteMetricFilter operation returned by the service. - `com.amazonaws.services.logs.model.DeleteMetricFilterResult`"
  (^com.amazonaws.services.logs.model.DeleteMetricFilterResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DeleteMetricFilterRequest request]
    (-> this (.deleteMetricFilter request))))

(defn describe-subscription-filters
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest`

  returns: Result of the DescribeSubscriptionFilters operation returned by the service. - `com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult`"
  (^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest request]
    (-> this (.describeSubscriptionFilters request))))

(defn put-subscription-filter
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.PutSubscriptionFilterRequest`

  returns: Result of the PutSubscriptionFilter operation returned by the service. - `com.amazonaws.services.logs.model.PutSubscriptionFilterResult`"
  (^com.amazonaws.services.logs.model.PutSubscriptionFilterResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.PutSubscriptionFilterRequest request]
    (-> this (.putSubscriptionFilter request))))

(defn delete-resource-policy
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DeleteResourcePolicyRequest`

  returns: Result of the DeleteResourcePolicy operation returned by the service. - `com.amazonaws.services.logs.model.DeleteResourcePolicyResult`"
  (^com.amazonaws.services.logs.model.DeleteResourcePolicyResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicy request))))

(defn describe-log-groups
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeLogGroupsRequest`

  returns: Result of the DescribeLogGroups operation returned by the service. - `com.amazonaws.services.logs.model.DescribeLogGroupsResult`"
  (^com.amazonaws.services.logs.model.DescribeLogGroupsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeLogGroupsRequest request]
    (-> this (.describeLogGroups request)))
  (^com.amazonaws.services.logs.model.DescribeLogGroupsResult [^AbstractAWSLogs this]
    (-> this (.describeLogGroups))))

(defn associate-kms-key
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.AssociateKmsKeyRequest`

  returns: Result of the AssociateKmsKey operation returned by the service. - `com.amazonaws.services.logs.model.AssociateKmsKeyResult`"
  (^com.amazonaws.services.logs.model.AssociateKmsKeyResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.AssociateKmsKeyRequest request]
    (-> this (.associateKmsKey request))))

(defn list-tags-log-group
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.ListTagsLogGroupRequest`

  returns: Result of the ListTagsLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.ListTagsLogGroupResult`"
  (^com.amazonaws.services.logs.model.ListTagsLogGroupResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.ListTagsLogGroupRequest request]
    (-> this (.listTagsLogGroup request))))

(defn tag-log-group
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.TagLogGroupRequest`

  returns: Result of the TagLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.TagLogGroupResult`"
  (^com.amazonaws.services.logs.model.TagLogGroupResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.TagLogGroupRequest request]
    (-> this (.tagLogGroup request))))

(defn delete-subscription-filter
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest`

  returns: Result of the DeleteSubscriptionFilter operation returned by the service. - `com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult`"
  (^com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest request]
    (-> this (.deleteSubscriptionFilter request))))

(defn delete-retention-policy
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest`

  returns: Result of the DeleteRetentionPolicy operation returned by the service. - `com.amazonaws.services.logs.model.DeleteRetentionPolicyResult`"
  (^com.amazonaws.services.logs.model.DeleteRetentionPolicyResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest request]
    (-> this (.deleteRetentionPolicy request))))

(defn start-query
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.StartQueryRequest`

  returns: Result of the StartQuery operation returned by the service. - `com.amazonaws.services.logs.model.StartQueryResult`"
  (^com.amazonaws.services.logs.model.StartQueryResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.StartQueryRequest request]
    (-> this (.startQuery request))))

(defn put-resource-policy
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.PutResourcePolicyRequest`

  returns: Result of the PutResourcePolicy operation returned by the service. - `com.amazonaws.services.logs.model.PutResourcePolicyResult`"
  (^com.amazonaws.services.logs.model.PutResourcePolicyResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicy request))))

(defn get-log-record
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.GetLogRecordRequest`

  returns: Result of the GetLogRecord operation returned by the service. - `com.amazonaws.services.logs.model.GetLogRecordResult`"
  (^com.amazonaws.services.logs.model.GetLogRecordResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.GetLogRecordRequest request]
    (-> this (.getLogRecord request))))

(defn put-log-events
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.PutLogEventsRequest`

  returns: Result of the PutLogEvents operation returned by the service. - `com.amazonaws.services.logs.model.PutLogEventsResult`"
  (^com.amazonaws.services.logs.model.PutLogEventsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.PutLogEventsRequest request]
    (-> this (.putLogEvents request))))

(defn shutdown
  "Description copied from interface: AWSLogs"
  ([^AbstractAWSLogs this]
    (-> this (.shutdown))))

(defn stop-query
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.StopQueryRequest`

  returns: Result of the StopQuery operation returned by the service. - `com.amazonaws.services.logs.model.StopQueryResult`"
  (^com.amazonaws.services.logs.model.StopQueryResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.StopQueryRequest request]
    (-> this (.stopQuery request))))

(defn describe-metric-filters
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeMetricFiltersRequest`

  returns: Result of the DescribeMetricFilters operation returned by the service. - `com.amazonaws.services.logs.model.DescribeMetricFiltersResult`"
  (^com.amazonaws.services.logs.model.DescribeMetricFiltersResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeMetricFiltersRequest request]
    (-> this (.describeMetricFilters request))))

(defn untag-log-group
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.UntagLogGroupRequest`

  returns: Result of the UntagLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.UntagLogGroupResult`"
  (^com.amazonaws.services.logs.model.UntagLogGroupResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.UntagLogGroupRequest request]
    (-> this (.untagLogGroup request))))

(defn set-endpoint
  "Description copied from interface: AWSLogs

  endpoint - The endpoint (ex: \"logs.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://logs.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSLogs this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-export-task
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.CancelExportTaskRequest`

  returns: Result of the CancelExportTask operation returned by the service. - `com.amazonaws.services.logs.model.CancelExportTaskResult`"
  (^com.amazonaws.services.logs.model.CancelExportTaskResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.CancelExportTaskRequest request]
    (-> this (.cancelExportTask request))))

(defn get-log-events
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.GetLogEventsRequest`

  returns: Result of the GetLogEvents operation returned by the service. - `com.amazonaws.services.logs.model.GetLogEventsResult`"
  (^com.amazonaws.services.logs.model.GetLogEventsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.GetLogEventsRequest request]
    (-> this (.getLogEvents request))))

(defn create-log-stream
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.CreateLogStreamRequest`

  returns: Result of the CreateLogStream operation returned by the service. - `com.amazonaws.services.logs.model.CreateLogStreamResult`"
  (^com.amazonaws.services.logs.model.CreateLogStreamResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.CreateLogStreamRequest request]
    (-> this (.createLogStream request))))

(defn put-destination
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.PutDestinationRequest`

  returns: Result of the PutDestination operation returned by the service. - `com.amazonaws.services.logs.model.PutDestinationResult`"
  (^com.amazonaws.services.logs.model.PutDestinationResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.PutDestinationRequest request]
    (-> this (.putDestination request))))

(defn put-retention-policy
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.PutRetentionPolicyRequest`

  returns: Result of the PutRetentionPolicy operation returned by the service. - `com.amazonaws.services.logs.model.PutRetentionPolicyResult`"
  (^com.amazonaws.services.logs.model.PutRetentionPolicyResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.PutRetentionPolicyRequest request]
    (-> this (.putRetentionPolicy request))))

(defn test-metric-filter
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.TestMetricFilterRequest`

  returns: Result of the TestMetricFilter operation returned by the service. - `com.amazonaws.services.logs.model.TestMetricFilterResult`"
  (^com.amazonaws.services.logs.model.TestMetricFilterResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.TestMetricFilterRequest request]
    (-> this (.testMetricFilter request))))

(defn get-query-results
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.GetQueryResultsRequest`

  returns: Result of the GetQueryResults operation returned by the service. - `com.amazonaws.services.logs.model.GetQueryResultsResult`"
  (^com.amazonaws.services.logs.model.GetQueryResultsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.GetQueryResultsRequest request]
    (-> this (.getQueryResults request))))

(defn put-destination-policy
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.PutDestinationPolicyRequest`

  returns: Result of the PutDestinationPolicy operation returned by the service. - `com.amazonaws.services.logs.model.PutDestinationPolicyResult`"
  (^com.amazonaws.services.logs.model.PutDestinationPolicyResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.PutDestinationPolicyRequest request]
    (-> this (.putDestinationPolicy request))))

(defn describe-export-tasks
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeExportTasksRequest`

  returns: Result of the DescribeExportTasks operation returned by the service. - `com.amazonaws.services.logs.model.DescribeExportTasksResult`"
  (^com.amazonaws.services.logs.model.DescribeExportTasksResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasks request))))

(defn delete-log-group
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DeleteLogGroupRequest`

  returns: Result of the DeleteLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.DeleteLogGroupResult`"
  (^com.amazonaws.services.logs.model.DeleteLogGroupResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DeleteLogGroupRequest request]
    (-> this (.deleteLogGroup request))))

(defn describe-log-streams
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeLogStreamsRequest`

  returns: Result of the DescribeLogStreams operation returned by the service. - `com.amazonaws.services.logs.model.DescribeLogStreamsResult`"
  (^com.amazonaws.services.logs.model.DescribeLogStreamsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeLogStreamsRequest request]
    (-> this (.describeLogStreams request))))

(defn delete-destination
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DeleteDestinationRequest`

  returns: Result of the DeleteDestination operation returned by the service. - `com.amazonaws.services.logs.model.DeleteDestinationResult`"
  (^com.amazonaws.services.logs.model.DeleteDestinationResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DeleteDestinationRequest request]
    (-> this (.deleteDestination request))))

(defn put-metric-filter
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.PutMetricFilterRequest`

  returns: Result of the PutMetricFilter operation returned by the service. - `com.amazonaws.services.logs.model.PutMetricFilterResult`"
  (^com.amazonaws.services.logs.model.PutMetricFilterResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.PutMetricFilterRequest request]
    (-> this (.putMetricFilter request))))

(defn create-log-group
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.CreateLogGroupRequest`

  returns: Result of the CreateLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.CreateLogGroupResult`"
  (^com.amazonaws.services.logs.model.CreateLogGroupResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.CreateLogGroupRequest request]
    (-> this (.createLogGroup request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSLogs

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSLogs this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-resource-policies
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest`

  returns: Result of the DescribeResourcePolicies operation returned by the service. - `com.amazonaws.services.logs.model.DescribeResourcePoliciesResult`"
  (^com.amazonaws.services.logs.model.DescribeResourcePoliciesResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest request]
    (-> this (.describeResourcePolicies request))))

(defn describe-queries
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeQueriesRequest`

  returns: Result of the DescribeQueries operation returned by the service. - `com.amazonaws.services.logs.model.DescribeQueriesResult`"
  (^com.amazonaws.services.logs.model.DescribeQueriesResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeQueriesRequest request]
    (-> this (.describeQueries request))))

(defn describe-destinations
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.DescribeDestinationsRequest`

  returns: Result of the DescribeDestinations operation returned by the service. - `com.amazonaws.services.logs.model.DescribeDestinationsResult`"
  (^com.amazonaws.services.logs.model.DescribeDestinationsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.DescribeDestinationsRequest request]
    (-> this (.describeDestinations request)))
  (^com.amazonaws.services.logs.model.DescribeDestinationsResult [^AbstractAWSLogs this]
    (-> this (.describeDestinations))))

(defn filter-log-events
  "Description copied from interface: AWSLogs

  request - `com.amazonaws.services.logs.model.FilterLogEventsRequest`

  returns: Result of the FilterLogEvents operation returned by the service. - `com.amazonaws.services.logs.model.FilterLogEventsResult`"
  (^com.amazonaws.services.logs.model.FilterLogEventsResult [^AbstractAWSLogs this ^com.amazonaws.services.logs.model.FilterLogEventsRequest request]
    (-> this (.filterLogEvents request))))

