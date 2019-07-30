(ns com.amazonaws.services.logs.AWSLogsClient
  "Client for accessing Amazon CloudWatch Logs. All service calls made using this client are blocking, and will not
  return until the service call completes.


  You can use Amazon CloudWatch Logs to monitor, store, and access your log files from Amazon EC2 instances, AWS
  CloudTrail, or other sources. You can then retrieve the associated log data from CloudWatch Logs using the CloudWatch
  console, CloudWatch Logs commands in the AWS CLI, CloudWatch Logs API, or CloudWatch Logs SDK.


  You can use CloudWatch Logs to:




  Monitor logs from EC2 instances in real-time: You can use CloudWatch Logs to monitor applications and systems
  using log data. For example, CloudWatch Logs can track the number of errors that occur in your application logs and
  send you a notification whenever the rate of errors exceeds a threshold that you specify. CloudWatch Logs uses your
  log data for monitoring; so, no code changes are required. For example, you can monitor application logs for specific
  literal terms (such as \"NullReferenceException\") or count the number of occurrences of a literal term at a particular
  position in log data (such as \"404\" status codes in an Apache access log). When the term you are searching for is
  found, CloudWatch Logs reports the data to a CloudWatch metric that you specify.




  Monitor AWS CloudTrail logged events: You can create alarms in CloudWatch and receive notifications of
  particular API activity as captured by CloudTrail and use the notification to perform troubleshooting.




  Archive log data: You can use CloudWatch Logs to store your log data in highly durable storage. You can change
  the log retention setting so that any log events older than this setting are automatically deleted. The CloudWatch
  Logs agent makes it easy to quickly send both rotated and non-rotated log data off of a host and into the log
  service. You can then access the raw log data when you need it."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.logs AWSLogsClient]))

(defn ->aws-logs-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon CloudWatch Logs (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSLogsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSLogsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSLogsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSLogsClient aws-credentials client-configuration))
  (^AWSLogsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSLogsClient client-configuration))
  (^AWSLogsClient []
    (new AWSLogsClient )))

(defn *builder
  "returns: `com.amazonaws.services.logs.AWSLogsClientBuilder`"
  (^com.amazonaws.services.logs.AWSLogsClientBuilder []
    (AWSLogsClient/builder )))

(defn get-log-group-fields
  "Returns a list of the fields that are included in log events in the specified log group, along with the
   percentage of log events that contain each field. The search is limited to a time period that you specify.


   In the results, fields that start with @ are fields generated by CloudWatch Logs. For example,
   @timestamp is the timestamp of each log event.


   The response results are sorted by the frequency percentage, starting with the highest percentage.

  request - `com.amazonaws.services.logs.model.GetLogGroupFieldsRequest`

  returns: Result of the GetLogGroupFields operation returned by the service. - `com.amazonaws.services.logs.model.GetLogGroupFieldsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.GetLogGroupFieldsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.GetLogGroupFieldsRequest request]
    (-> this (.getLogGroupFields request))))

(defn create-export-task
  "Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket.


   This is an asynchronous call. If all the required information is provided, this operation initiates an export
   task and responds with the ID of the task. After the task has started, you can use DescribeExportTasks to
   get the status of the export task. Each account can only have one active (RUNNING or
   PENDING) export task at a time. To cancel an export task, use CancelExportTask.


   You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log
   data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported
   objects.


   Exporting to S3 buckets that are encrypted with AES-256 is supported. Exporting to S3 buckets encrypted with
   SSE-KMS is not supported.

  request - `com.amazonaws.services.logs.model.CreateExportTaskRequest`

  returns: Result of the CreateExportTask operation returned by the service. - `com.amazonaws.services.logs.model.CreateExportTaskResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.CreateExportTaskResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.CreateExportTaskRequest request]
    (-> this (.createExportTask request))))

(defn delete-log-stream
  "Deletes the specified log stream and permanently deletes all the archived log events associated with the log
   stream.

  request - `com.amazonaws.services.logs.model.DeleteLogStreamRequest`

  returns: Result of the DeleteLogStream operation returned by the service. - `com.amazonaws.services.logs.model.DeleteLogStreamResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DeleteLogStreamResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DeleteLogStreamRequest request]
    (-> this (.deleteLogStream request))))

(defn disassociate-kms-key
  "Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified
   log group.


   After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested
   data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
   permissions for the CMK whenever the encrypted data is requested.


   Note that it can take up to 5 minutes for this operation to take effect.

  request - `com.amazonaws.services.logs.model.DisassociateKmsKeyRequest`

  returns: Result of the DisassociateKmsKey operation returned by the service. - `com.amazonaws.services.logs.model.DisassociateKmsKeyResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DisassociateKmsKeyResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DisassociateKmsKeyRequest request]
    (-> this (.disassociateKmsKey request))))

(defn delete-metric-filter
  "Deletes the specified metric filter.

  request - `com.amazonaws.services.logs.model.DeleteMetricFilterRequest`

  returns: Result of the DeleteMetricFilter operation returned by the service. - `com.amazonaws.services.logs.model.DeleteMetricFilterResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DeleteMetricFilterResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DeleteMetricFilterRequest request]
    (-> this (.deleteMetricFilter request))))

(defn describe-subscription-filters
  "Lists the subscription filters for the specified log group. You can list all the subscription filters or filter
   the results by prefix. The results are ASCII-sorted by filter name.

  request - `com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest`

  returns: Result of the DescribeSubscriptionFilters operation returned by the service. - `com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest request]
    (-> this (.describeSubscriptionFilters request))))

(defn put-subscription-filter
  "Creates or updates a subscription filter and associates it with the specified log group. Subscription filters
   allow you to subscribe to a real-time stream of log events ingested through PutLogEvents and have them
   delivered to a specific destination. Currently, the supported destinations are:




   An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.




   A logical destination that belongs to a different account, for cross-account delivery.




   An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for
   same-account delivery.




   An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.




   There can only be one subscription filter associated with a log group. If you are updating an existing filter,
   you must specify the correct name in filterName. Otherwise, the call fails because you cannot
   associate a second filter with a log group.

  request - `com.amazonaws.services.logs.model.PutSubscriptionFilterRequest`

  returns: Result of the PutSubscriptionFilter operation returned by the service. - `com.amazonaws.services.logs.model.PutSubscriptionFilterResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.PutSubscriptionFilterResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.PutSubscriptionFilterRequest request]
    (-> this (.putSubscriptionFilter request))))

(defn delete-resource-policy
  "Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log
   events to this account.

  request - `com.amazonaws.services.logs.model.DeleteResourcePolicyRequest`

  returns: Result of the DeleteResourcePolicy operation returned by the service. - `com.amazonaws.services.logs.model.DeleteResourcePolicyResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DeleteResourcePolicyResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicy request))))

(defn describe-log-groups
  "Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are
   ASCII-sorted by log group name.

  request - `com.amazonaws.services.logs.model.DescribeLogGroupsRequest`

  returns: Result of the DescribeLogGroups operation returned by the service. - `com.amazonaws.services.logs.model.DescribeLogGroupsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeLogGroupsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeLogGroupsRequest request]
    (-> this (.describeLogGroups request)))
  (^com.amazonaws.services.logs.model.DescribeLogGroupsResult [^AWSLogsClient this]
    (-> this (.describeLogGroups))))

(defn associate-kms-key
  "Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log
   group.


   Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK.
   After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK.
   This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs.
   This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.


   Note that it can take up to 5 minutes for this operation to take effect.


   If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will
   receive an InvalidParameterException error.

  request - `com.amazonaws.services.logs.model.AssociateKmsKeyRequest`

  returns: Result of the AssociateKmsKey operation returned by the service. - `com.amazonaws.services.logs.model.AssociateKmsKeyResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.AssociateKmsKeyResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.AssociateKmsKeyRequest request]
    (-> this (.associateKmsKey request))))

(defn list-tags-log-group
  "Lists the tags for the specified log group.

  request - `com.amazonaws.services.logs.model.ListTagsLogGroupRequest`

  returns: Result of the ListTagsLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.ListTagsLogGroupResult`

  throws: com.amazonaws.services.logs.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.logs.model.ListTagsLogGroupResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.ListTagsLogGroupRequest request]
    (-> this (.listTagsLogGroup request))))

(defn tag-log-group
  "Adds or updates the specified tags for the specified log group.


   To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup.


   For more information about tags, see Tag Log Groups in Amazon
   CloudWatch Logs in the Amazon CloudWatch Logs User Guide.

  request - `com.amazonaws.services.logs.model.TagLogGroupRequest`

  returns: Result of the TagLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.TagLogGroupResult`

  throws: com.amazonaws.services.logs.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.logs.model.TagLogGroupResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.TagLogGroupRequest request]
    (-> this (.tagLogGroup request))))

(defn delete-subscription-filter
  "Deletes the specified subscription filter.

  request - `com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest`

  returns: Result of the DeleteSubscriptionFilter operation returned by the service. - `com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest request]
    (-> this (.deleteSubscriptionFilter request))))

(defn delete-retention-policy
  "Deletes the specified retention policy.


   Log events do not expire if they belong to log groups without a retention policy.

  request - `com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest`

  returns: Result of the DeleteRetentionPolicy operation returned by the service. - `com.amazonaws.services.logs.model.DeleteRetentionPolicyResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DeleteRetentionPolicyResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest request]
    (-> this (.deleteRetentionPolicy request))))

(defn start-query
  "Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to
   query, and the query string to use.


   For more information, see CloudWatch Logs Insights
   Query Syntax.


   Queries time out after 15 minutes of execution. If your queries are timing out, reduce the time range being
   searched, or partition your query into a number of queries.

  request - `com.amazonaws.services.logs.model.StartQueryRequest`

  returns: Result of the StartQuery operation returned by the service. - `com.amazonaws.services.logs.model.StartQueryResult`

  throws: com.amazonaws.services.logs.model.MalformedQueryException - The query string is not valid. Details about this error are displayed in a QueryCompileError object. For more information, see . For more information about valid query syntax, see CloudWatch Logs Insights Query Syntax."
  (^com.amazonaws.services.logs.model.StartQueryResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.StartQueryRequest request]
    (-> this (.startQuery request))))

(defn put-resource-policy
  "Creates or updates a resource policy allowing other AWS services to put log events to this account, such as
   Amazon Route 53. An account can have up to 10 resource policies per region.

  request - `com.amazonaws.services.logs.model.PutResourcePolicyRequest`

  returns: Result of the PutResourcePolicy operation returned by the service. - `com.amazonaws.services.logs.model.PutResourcePolicyResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.PutResourcePolicyResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicy request))))

(defn get-log-record
  "Retrieves all the fields and values of a single log event. All fields are retrieved, even if the original query
   that produced the logRecordPointer retrieved only a subset of fields. Fields are returned as field
   name/field value pairs.


   Additionally, the entire unparsed log event is returned within @message.

  request - `com.amazonaws.services.logs.model.GetLogRecordRequest`

  returns: Result of the GetLogRecord operation returned by the service. - `com.amazonaws.services.logs.model.GetLogRecordResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.GetLogRecordResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.GetLogRecordRequest request]
    (-> this (.getLogRecord request))))

(defn put-log-events
  "Uploads a batch of log events to the specified log stream.


   You must include the sequence token obtained from the response of the previous call. An upload in a newly created
   log stream does not require a sequence token. You can also get the sequence token using
   DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same
   value for sequenceToken, both calls may be successful, or one may be rejected.


   The batch of events must satisfy the following constraints:




   The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8,
   plus 26 bytes for each log event.




   None of the log events in the batch can be more than 2 hours in the future.




   None of the log events in the batch can be older than 14 days or older than the retention period of the log
   group.




   The log events in the batch must be in chronological ordered by their timestamp. The timestamp is the time the
   event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for
   PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example,
   2017-09-15T13:45:30.)




   The maximum number of log events in a batch is 10,000.




   A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.




   If a call to PutLogEvents returns \"UnrecognizedClientException\" the most likely cause is an invalid AWS access
   key ID or secret key.

  request - `com.amazonaws.services.logs.model.PutLogEventsRequest`

  returns: Result of the PutLogEvents operation returned by the service. - `com.amazonaws.services.logs.model.PutLogEventsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.PutLogEventsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.PutLogEventsRequest request]
    (-> this (.putLogEvents request))))

(defn stop-query
  "Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns
   an error indicating that the specified query is not running.

  request - `com.amazonaws.services.logs.model.StopQueryRequest`

  returns: Result of the StopQuery operation returned by the service. - `com.amazonaws.services.logs.model.StopQueryResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.StopQueryResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.StopQueryRequest request]
    (-> this (.stopQuery request))))

(defn describe-metric-filters
  "Lists the specified metric filters. You can list all the metric filters or filter the results by log name,
   prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.

  request - `com.amazonaws.services.logs.model.DescribeMetricFiltersRequest`

  returns: Result of the DescribeMetricFilters operation returned by the service. - `com.amazonaws.services.logs.model.DescribeMetricFiltersResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeMetricFiltersResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeMetricFiltersRequest request]
    (-> this (.describeMetricFilters request))))

(defn untag-log-group
  "Removes the specified tags from the specified log group.


   To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.

  request - `com.amazonaws.services.logs.model.UntagLogGroupRequest`

  returns: Result of the UntagLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.UntagLogGroupResult`

  throws: com.amazonaws.services.logs.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.logs.model.UntagLogGroupResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.UntagLogGroupRequest request]
    (-> this (.untagLogGroup request))))

(defn cancel-export-task
  "Cancels the specified export task.


   The task must be in the PENDING or RUNNING state.

  request - `com.amazonaws.services.logs.model.CancelExportTaskRequest`

  returns: Result of the CancelExportTask operation returned by the service. - `com.amazonaws.services.logs.model.CancelExportTaskResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.CancelExportTaskResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.CancelExportTaskRequest request]
    (-> this (.cancelExportTask request))))

(defn get-log-events
  "Lists log events from the specified log stream. You can list all the log events or filter using a time range.


   By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
   events). You can get additional log events by specifying one of the tokens in a subsequent call.

  request - `com.amazonaws.services.logs.model.GetLogEventsRequest`

  returns: Result of the GetLogEvents operation returned by the service. - `com.amazonaws.services.logs.model.GetLogEventsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.GetLogEventsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.GetLogEventsRequest request]
    (-> this (.getLogEvents request))))

(defn create-log-stream
  "Creates a log stream for the specified log group.


   There is no limit on the number of log streams that you can create for a log group.


   You must use the following guidelines when naming a log stream:




   Log stream names must be unique within the log group.




   Log stream names can be between 1 and 512 characters long.




   The ':' (colon) and '*' (asterisk) characters are not allowed.

  request - `com.amazonaws.services.logs.model.CreateLogStreamRequest`

  returns: Result of the CreateLogStream operation returned by the service. - `com.amazonaws.services.logs.model.CreateLogStreamResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.CreateLogStreamResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.CreateLogStreamRequest request]
    (-> this (.createLogStream request))))

(defn put-destination
  "Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis
   stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using
   PutLogEvents. A destination can be an Amazon Kinesis stream, Amazon Kinesis Data Firehose strea, or an AWS
   Lambda function.


   Through an access policy, a destination controls what is written to it. By default, PutDestination
   does not set any access policy with the destination, which means a cross-account user cannot call
   PutSubscriptionFilter against this destination. To enable this, the destination owner must call
   PutDestinationPolicy after PutDestination.

  request - `com.amazonaws.services.logs.model.PutDestinationRequest`

  returns: Result of the PutDestination operation returned by the service. - `com.amazonaws.services.logs.model.PutDestinationResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.PutDestinationResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.PutDestinationRequest request]
    (-> this (.putDestination request))))

(defn put-retention-policy
  "Sets the retention of the specified log group. A retention policy allows you to configure the number of days for
   which to retain log events in the specified log group.

  request - `com.amazonaws.services.logs.model.PutRetentionPolicyRequest`

  returns: Result of the PutRetentionPolicy operation returned by the service. - `com.amazonaws.services.logs.model.PutRetentionPolicyResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.PutRetentionPolicyResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.PutRetentionPolicyRequest request]
    (-> this (.putRetentionPolicy request))))

(defn test-metric-filter
  "Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
   validate the correctness of a metric filter pattern.

  request - `com.amazonaws.services.logs.model.TestMetricFilterRequest`

  returns: Result of the TestMetricFilter operation returned by the service. - `com.amazonaws.services.logs.model.TestMetricFilterResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.TestMetricFilterResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.TestMetricFilterRequest request]
    (-> this (.testMetricFilter request))))

(defn get-query-results
  "Returns the results from the specified query.


   Only the fields requested in the query are returned, along with a @ptr field which is the identifier
   for the log record. You can use the value of @ptr in a operation to get the full log record.


   GetQueryResults does not start a query execution. To run a query, use .


   If the value of the Status field in the output is Running, this operation returns only
   partial results. If you see a value of Scheduled or Running for the status, you can
   retry the operation later to see the final results.

  request - `com.amazonaws.services.logs.model.GetQueryResultsRequest`

  returns: Result of the GetQueryResults operation returned by the service. - `com.amazonaws.services.logs.model.GetQueryResultsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.GetQueryResultsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.GetQueryResultsRequest request]
    (-> this (.getQueryResults request))))

(defn put-destination-policy
  "Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is
   used to authorize claims to register a subscription filter against a given destination.

  request - `com.amazonaws.services.logs.model.PutDestinationPolicyRequest`

  returns: Result of the PutDestinationPolicy operation returned by the service. - `com.amazonaws.services.logs.model.PutDestinationPolicyResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.PutDestinationPolicyResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.PutDestinationPolicyRequest request]
    (-> this (.putDestinationPolicy request))))

(defn describe-export-tasks
  "Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or
   task status.

  request - `com.amazonaws.services.logs.model.DescribeExportTasksRequest`

  returns: Result of the DescribeExportTasks operation returned by the service. - `com.amazonaws.services.logs.model.DescribeExportTasksResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeExportTasksResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasks request))))

(defn delete-log-group
  "Deletes the specified log group and permanently deletes all the archived log events associated with the log
   group.

  request - `com.amazonaws.services.logs.model.DeleteLogGroupRequest`

  returns: Result of the DeleteLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.DeleteLogGroupResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DeleteLogGroupResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DeleteLogGroupRequest request]
    (-> this (.deleteLogGroup request))))

(defn describe-log-streams
  "Lists the log streams for the specified log group. You can list all the log streams or filter the results by
   prefix. You can also control how the results are ordered.


   This operation has a limit of five transactions per second, after which transactions are throttled.

  request - `com.amazonaws.services.logs.model.DescribeLogStreamsRequest`

  returns: Result of the DescribeLogStreams operation returned by the service. - `com.amazonaws.services.logs.model.DescribeLogStreamsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeLogStreamsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeLogStreamsRequest request]
    (-> this (.describeLogStreams request))))

(defn delete-destination
  "Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This
   operation does not delete the physical resource encapsulated by the destination.

  request - `com.amazonaws.services.logs.model.DeleteDestinationRequest`

  returns: Result of the DeleteDestination operation returned by the service. - `com.amazonaws.services.logs.model.DeleteDestinationResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DeleteDestinationResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DeleteDestinationRequest request]
    (-> this (.deleteDestination request))))

(defn put-metric-filter
  "Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to
   configure rules to extract metric data from log events ingested through PutLogEvents.


   The maximum number of metric filters that can be associated with a log group is 100.

  request - `com.amazonaws.services.logs.model.PutMetricFilterRequest`

  returns: Result of the PutMetricFilter operation returned by the service. - `com.amazonaws.services.logs.model.PutMetricFilterResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.PutMetricFilterResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.PutMetricFilterRequest request]
    (-> this (.putMetricFilter request))))

(defn create-log-group
  "Creates a log group with the specified name.


   You can create up to 5000 log groups per account.


   You must use the following guidelines when naming a log group:




   Log group names must be unique within a region for an AWS account.




   Log group names can be between 1 and 512 characters long.




   Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward
   slash), and '.' (period).




   If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested
   data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still
   within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.


   If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will
   receive an InvalidParameterException error.

  request - `com.amazonaws.services.logs.model.CreateLogGroupRequest`

  returns: Result of the CreateLogGroup operation returned by the service. - `com.amazonaws.services.logs.model.CreateLogGroupResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.CreateLogGroupResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.CreateLogGroupRequest request]
    (-> this (.createLogGroup request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSLogsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-resource-policies
  "Lists the resource policies in this account.

  request - `com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest`

  returns: Result of the DescribeResourcePolicies operation returned by the service. - `com.amazonaws.services.logs.model.DescribeResourcePoliciesResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeResourcePoliciesResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest request]
    (-> this (.describeResourcePolicies request))))

(defn describe-queries
  "Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently
   in this account. You can request all queries, or limit it to queries of a specific log group or queries with a
   certain status.

  request - `com.amazonaws.services.logs.model.DescribeQueriesRequest`

  returns: Result of the DescribeQueries operation returned by the service. - `com.amazonaws.services.logs.model.DescribeQueriesResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeQueriesResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeQueriesRequest request]
    (-> this (.describeQueries request))))

(defn describe-destinations
  "Lists all your destinations. The results are ASCII-sorted by destination name.

  request - `com.amazonaws.services.logs.model.DescribeDestinationsRequest`

  returns: Result of the DescribeDestinations operation returned by the service. - `com.amazonaws.services.logs.model.DescribeDestinationsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.DescribeDestinationsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.DescribeDestinationsRequest request]
    (-> this (.describeDestinations request)))
  (^com.amazonaws.services.logs.model.DescribeDestinationsResult [^AWSLogsClient this]
    (-> this (.describeDestinations))))

(defn filter-log-events
  "Lists log events from the specified log group. You can list all the log events or filter the results using a
   filter pattern, a time range, and the name of the log stream.


   By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the
   events found within the time range that you specify. If the results include a token, then there are more log
   events available, and you can get additional results by specifying the token in a subsequent call.

  request - `com.amazonaws.services.logs.model.FilterLogEventsRequest`

  returns: Result of the FilterLogEvents operation returned by the service. - `com.amazonaws.services.logs.model.FilterLogEventsResult`

  throws: com.amazonaws.services.logs.model.InvalidParameterException - A parameter is specified incorrectly."
  (^com.amazonaws.services.logs.model.FilterLogEventsResult [^AWSLogsClient this ^com.amazonaws.services.logs.model.FilterLogEventsRequest request]
    (-> this (.filterLogEvents request))))
