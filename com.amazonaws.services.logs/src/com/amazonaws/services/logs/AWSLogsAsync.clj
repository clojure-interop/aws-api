(ns com.amazonaws.services.logs.AWSLogsAsync
  "Interface for accessing Amazon CloudWatch Logs asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSLogsAsync instead.



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
  (:import [com.amazonaws.services.logs AWSLogsAsync]))

(defn describe-metric-filters-async
  "Lists the specified metric filters. You can list all the metric filters or filter the results by log name,
   prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.

  describe-metric-filters-request - `com.amazonaws.services.logs.model.DescribeMetricFiltersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMetricFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeMetricFiltersResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeMetricFiltersRequest describe-metric-filters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMetricFiltersAsync describe-metric-filters-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeMetricFiltersRequest describe-metric-filters-request]
    (-> this (.describeMetricFiltersAsync describe-metric-filters-request))))

(defn delete-subscription-filter-async
  "Deletes the specified subscription filter.

  delete-subscription-filter-request - `com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscriptionFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest delete-subscription-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriptionFilterAsync delete-subscription-filter-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest delete-subscription-filter-request]
    (-> this (.deleteSubscriptionFilterAsync delete-subscription-filter-request))))

(defn delete-metric-filter-async
  "Deletes the specified metric filter.

  delete-metric-filter-request - `com.amazonaws.services.logs.model.DeleteMetricFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMetricFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteMetricFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteMetricFilterRequest delete-metric-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMetricFilterAsync delete-metric-filter-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteMetricFilterRequest delete-metric-filter-request]
    (-> this (.deleteMetricFilterAsync delete-metric-filter-request))))

(defn describe-log-streams-async
  "Lists the log streams for the specified log group. You can list all the log streams or filter the results by
   prefix. You can also control how the results are ordered.


   This operation has a limit of five transactions per second, after which transactions are throttled.

  describe-log-streams-request - `com.amazonaws.services.logs.model.DescribeLogStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLogStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeLogStreamsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeLogStreamsRequest describe-log-streams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLogStreamsAsync describe-log-streams-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeLogStreamsRequest describe-log-streams-request]
    (-> this (.describeLogStreamsAsync describe-log-streams-request))))

(defn get-log-events-async
  "Lists log events from the specified log stream. You can list all the log events or filter using a time range.


   By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
   events). You can get additional log events by specifying one of the tokens in a subsequent call.

  get-log-events-request - `com.amazonaws.services.logs.model.GetLogEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLogEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetLogEventsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetLogEventsRequest get-log-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLogEventsAsync get-log-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetLogEventsRequest get-log-events-request]
    (-> this (.getLogEventsAsync get-log-events-request))))

(defn delete-log-stream-async
  "Deletes the specified log stream and permanently deletes all the archived log events associated with the log
   stream.

  delete-log-stream-request - `com.amazonaws.services.logs.model.DeleteLogStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLogStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteLogStreamResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteLogStreamRequest delete-log-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLogStreamAsync delete-log-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteLogStreamRequest delete-log-stream-request]
    (-> this (.deleteLogStreamAsync delete-log-stream-request))))

(defn start-query-async
  "Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to
   query, and the query string to use.


   For more information, see CloudWatch Logs Insights
   Query Syntax.


   Queries time out after 15 minutes of execution. If your queries are timing out, reduce the time range being
   searched, or partition your query into a number of queries.

  start-query-request - `com.amazonaws.services.logs.model.StartQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.StartQueryResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.StartQueryRequest start-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startQueryAsync start-query-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.StartQueryRequest start-query-request]
    (-> this (.startQueryAsync start-query-request))))

(defn describe-log-groups-async
  "Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are
   ASCII-sorted by log group name.

  describe-log-groups-request - `com.amazonaws.services.logs.model.DescribeLogGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLogGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeLogGroupsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeLogGroupsRequest describe-log-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLogGroupsAsync describe-log-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeLogGroupsRequest describe-log-groups-request]
    (-> this (.describeLogGroupsAsync describe-log-groups-request)))
  (^java.util.concurrent.Future [^AWSLogsAsync this]
    (-> this (.describeLogGroupsAsync))))

(defn create-export-task-async
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

  create-export-task-request - `com.amazonaws.services.logs.model.CreateExportTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CreateExportTaskResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CreateExportTaskRequest create-export-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createExportTaskAsync create-export-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CreateExportTaskRequest create-export-task-request]
    (-> this (.createExportTaskAsync create-export-task-request))))

(defn stop-query-async
  "Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns
   an error indicating that the specified query is not running.

  stop-query-request - `com.amazonaws.services.logs.model.StopQueryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.StopQueryResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.StopQueryRequest stop-query-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopQueryAsync stop-query-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.StopQueryRequest stop-query-request]
    (-> this (.stopQueryAsync stop-query-request))))

(defn put-log-events-async
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

  put-log-events-request - `com.amazonaws.services.logs.model.PutLogEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLogEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutLogEventsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutLogEventsRequest put-log-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLogEventsAsync put-log-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutLogEventsRequest put-log-events-request]
    (-> this (.putLogEventsAsync put-log-events-request))))

(defn put-subscription-filter-async
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

  put-subscription-filter-request - `com.amazonaws.services.logs.model.PutSubscriptionFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSubscriptionFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutSubscriptionFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutSubscriptionFilterRequest put-subscription-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSubscriptionFilterAsync put-subscription-filter-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutSubscriptionFilterRequest put-subscription-filter-request]
    (-> this (.putSubscriptionFilterAsync put-subscription-filter-request))))

(defn cancel-export-task-async
  "Cancels the specified export task.


   The task must be in the PENDING or RUNNING state.

  cancel-export-task-request - `com.amazonaws.services.logs.model.CancelExportTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CancelExportTaskResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CancelExportTaskRequest cancel-export-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelExportTaskAsync cancel-export-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CancelExportTaskRequest cancel-export-task-request]
    (-> this (.cancelExportTaskAsync cancel-export-task-request))))

(defn get-query-results-async
  "Returns the results from the specified query.


   Only the fields requested in the query are returned, along with a @ptr field which is the identifier
   for the log record. You can use the value of @ptr in a operation to get the full log record.


   GetQueryResults does not start a query execution. To run a query, use .


   If the value of the Status field in the output is Running, this operation returns only
   partial results. If you see a value of Scheduled or Running for the status, you can
   retry the operation later to see the final results.

  get-query-results-request - `com.amazonaws.services.logs.model.GetQueryResultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetQueryResultsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetQueryResultsRequest get-query-results-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryResultsAsync get-query-results-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetQueryResultsRequest get-query-results-request]
    (-> this (.getQueryResultsAsync get-query-results-request))))

(defn delete-log-group-async
  "Deletes the specified log group and permanently deletes all the archived log events associated with the log
   group.

  delete-log-group-request - `com.amazonaws.services.logs.model.DeleteLogGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteLogGroupRequest delete-log-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLogGroupAsync delete-log-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteLogGroupRequest delete-log-group-request]
    (-> this (.deleteLogGroupAsync delete-log-group-request))))

(defn put-metric-filter-async
  "Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to
   configure rules to extract metric data from log events ingested through PutLogEvents.


   The maximum number of metric filters that can be associated with a log group is 100.

  put-metric-filter-request - `com.amazonaws.services.logs.model.PutMetricFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMetricFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutMetricFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutMetricFilterRequest put-metric-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMetricFilterAsync put-metric-filter-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutMetricFilterRequest put-metric-filter-request]
    (-> this (.putMetricFilterAsync put-metric-filter-request))))

(defn create-log-group-async
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

  create-log-group-request - `com.amazonaws.services.logs.model.CreateLogGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CreateLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CreateLogGroupRequest create-log-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLogGroupAsync create-log-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CreateLogGroupRequest create-log-group-request]
    (-> this (.createLogGroupAsync create-log-group-request))))

(defn associate-kms-key-async
  "Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log
   group.


   Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK.
   After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK.
   This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs.
   This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.


   Note that it can take up to 5 minutes for this operation to take effect.


   If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will
   receive an InvalidParameterException error.

  associate-kms-key-request - `com.amazonaws.services.logs.model.AssociateKmsKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateKmsKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.AssociateKmsKeyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.AssociateKmsKeyRequest associate-kms-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateKmsKeyAsync associate-kms-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.AssociateKmsKeyRequest associate-kms-key-request]
    (-> this (.associateKmsKeyAsync associate-kms-key-request))))

(defn put-destination-async
  "Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis
   stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using
   PutLogEvents. A destination can be an Amazon Kinesis stream, Amazon Kinesis Data Firehose strea, or an AWS
   Lambda function.


   Through an access policy, a destination controls what is written to it. By default, PutDestination
   does not set any access policy with the destination, which means a cross-account user cannot call
   PutSubscriptionFilter against this destination. To enable this, the destination owner must call
   PutDestinationPolicy after PutDestination.

  put-destination-request - `com.amazonaws.services.logs.model.PutDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDestination operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutDestinationResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutDestinationRequest put-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDestinationAsync put-destination-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutDestinationRequest put-destination-request]
    (-> this (.putDestinationAsync put-destination-request))))

(defn get-log-record-async
  "Retrieves all the fields and values of a single log event. All fields are retrieved, even if the original query
   that produced the logRecordPointer retrieved only a subset of fields. Fields are returned as field
   name/field value pairs.


   Additionally, the entire unparsed log event is returned within @message.

  get-log-record-request - `com.amazonaws.services.logs.model.GetLogRecordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLogRecord operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetLogRecordResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetLogRecordRequest get-log-record-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLogRecordAsync get-log-record-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetLogRecordRequest get-log-record-request]
    (-> this (.getLogRecordAsync get-log-record-request))))

(defn test-metric-filter-async
  "Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
   validate the correctness of a metric filter pattern.

  test-metric-filter-request - `com.amazonaws.services.logs.model.TestMetricFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestMetricFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.TestMetricFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.TestMetricFilterRequest test-metric-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testMetricFilterAsync test-metric-filter-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.TestMetricFilterRequest test-metric-filter-request]
    (-> this (.testMetricFilterAsync test-metric-filter-request))))

(defn filter-log-events-async
  "Lists log events from the specified log group. You can list all the log events or filter the results using a
   filter pattern, a time range, and the name of the log stream.


   By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the
   events found within the time range that you specify. If the results include a token, then there are more log
   events available, and you can get additional results by specifying the token in a subsequent call.

  filter-log-events-request - `com.amazonaws.services.logs.model.FilterLogEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FilterLogEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.FilterLogEventsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.FilterLogEventsRequest filter-log-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.filterLogEventsAsync filter-log-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.FilterLogEventsRequest filter-log-events-request]
    (-> this (.filterLogEventsAsync filter-log-events-request))))

(defn get-log-group-fields-async
  "Returns a list of the fields that are included in log events in the specified log group, along with the
   percentage of log events that contain each field. The search is limited to a time period that you specify.


   In the results, fields that start with @ are fields generated by CloudWatch Logs. For example,
   @timestamp is the timestamp of each log event.


   The response results are sorted by the frequency percentage, starting with the highest percentage.

  get-log-group-fields-request - `com.amazonaws.services.logs.model.GetLogGroupFieldsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLogGroupFields operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetLogGroupFieldsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetLogGroupFieldsRequest get-log-group-fields-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLogGroupFieldsAsync get-log-group-fields-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.GetLogGroupFieldsRequest get-log-group-fields-request]
    (-> this (.getLogGroupFieldsAsync get-log-group-fields-request))))

(defn describe-export-tasks-async
  "Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or
   task status.

  describe-export-tasks-request - `com.amazonaws.services.logs.model.DescribeExportTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeExportTasksResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeExportTasksRequest describe-export-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportTasksAsync describe-export-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeExportTasksRequest describe-export-tasks-request]
    (-> this (.describeExportTasksAsync describe-export-tasks-request))))

(defn tag-log-group-async
  "Adds or updates the specified tags for the specified log group.


   To list the tags for a log group, use ListTagsLogGroup. To remove tags, use UntagLogGroup.


   For more information about tags, see Tag Log Groups in Amazon
   CloudWatch Logs in the Amazon CloudWatch Logs User Guide.

  tag-log-group-request - `com.amazonaws.services.logs.model.TagLogGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.TagLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.TagLogGroupRequest tag-log-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagLogGroupAsync tag-log-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.TagLogGroupRequest tag-log-group-request]
    (-> this (.tagLogGroupAsync tag-log-group-request))))

(defn delete-retention-policy-async
  "Deletes the specified retention policy.


   Log events do not expire if they belong to log groups without a retention policy.

  delete-retention-policy-request - `com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteRetentionPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest delete-retention-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRetentionPolicyAsync delete-retention-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest delete-retention-policy-request]
    (-> this (.deleteRetentionPolicyAsync delete-retention-policy-request))))

(defn list-tags-log-group-async
  "Lists the tags for the specified log group.

  list-tags-log-group-request - `com.amazonaws.services.logs.model.ListTagsLogGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.ListTagsLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.ListTagsLogGroupRequest list-tags-log-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsLogGroupAsync list-tags-log-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.ListTagsLogGroupRequest list-tags-log-group-request]
    (-> this (.listTagsLogGroupAsync list-tags-log-group-request))))

(defn delete-destination-async
  "Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This
   operation does not delete the physical resource encapsulated by the destination.

  delete-destination-request - `com.amazonaws.services.logs.model.DeleteDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDestination operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteDestinationResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteDestinationRequest delete-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDestinationAsync delete-destination-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteDestinationRequest delete-destination-request]
    (-> this (.deleteDestinationAsync delete-destination-request))))

(defn delete-resource-policy-async
  "Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log
   events to this account.

  delete-resource-policy-request - `com.amazonaws.services.logs.model.DeleteResourcePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteResourcePolicyRequest delete-resource-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourcePolicyAsync delete-resource-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DeleteResourcePolicyRequest delete-resource-policy-request]
    (-> this (.deleteResourcePolicyAsync delete-resource-policy-request))))

(defn untag-log-group-async
  "Removes the specified tags from the specified log group.


   To list the tags for a log group, use ListTagsLogGroup. To add tags, use UntagLogGroup.

  untag-log-group-request - `com.amazonaws.services.logs.model.UntagLogGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.UntagLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.UntagLogGroupRequest untag-log-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagLogGroupAsync untag-log-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.UntagLogGroupRequest untag-log-group-request]
    (-> this (.untagLogGroupAsync untag-log-group-request))))

(defn describe-destinations-async
  "Lists all your destinations. The results are ASCII-sorted by destination name.

  describe-destinations-request - `com.amazonaws.services.logs.model.DescribeDestinationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDestinations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeDestinationsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeDestinationsRequest describe-destinations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDestinationsAsync describe-destinations-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeDestinationsRequest describe-destinations-request]
    (-> this (.describeDestinationsAsync describe-destinations-request)))
  (^java.util.concurrent.Future [^AWSLogsAsync this]
    (-> this (.describeDestinationsAsync))))

(defn put-destination-policy-async
  "Creates or updates an access policy associated with an existing destination. An access policy is an IAM policy document that is
   used to authorize claims to register a subscription filter against a given destination.

  put-destination-policy-request - `com.amazonaws.services.logs.model.PutDestinationPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDestinationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutDestinationPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutDestinationPolicyRequest put-destination-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDestinationPolicyAsync put-destination-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutDestinationPolicyRequest put-destination-policy-request]
    (-> this (.putDestinationPolicyAsync put-destination-policy-request))))

(defn put-resource-policy-async
  "Creates or updates a resource policy allowing other AWS services to put log events to this account, such as
   Amazon Route 53. An account can have up to 10 resource policies per region.

  put-resource-policy-request - `com.amazonaws.services.logs.model.PutResourcePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutResourcePolicyRequest put-resource-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourcePolicyAsync put-resource-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutResourcePolicyRequest put-resource-policy-request]
    (-> this (.putResourcePolicyAsync put-resource-policy-request))))

(defn create-log-stream-async
  "Creates a log stream for the specified log group.


   There is no limit on the number of log streams that you can create for a log group.


   You must use the following guidelines when naming a log stream:




   Log stream names must be unique within the log group.




   Log stream names can be between 1 and 512 characters long.




   The ':' (colon) and '*' (asterisk) characters are not allowed.

  create-log-stream-request - `com.amazonaws.services.logs.model.CreateLogStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLogStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CreateLogStreamResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CreateLogStreamRequest create-log-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLogStreamAsync create-log-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.CreateLogStreamRequest create-log-stream-request]
    (-> this (.createLogStreamAsync create-log-stream-request))))

(defn describe-resource-policies-async
  "Lists the resource policies in this account.

  describe-resource-policies-request - `com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourcePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeResourcePoliciesResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest describe-resource-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourcePoliciesAsync describe-resource-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest describe-resource-policies-request]
    (-> this (.describeResourcePoliciesAsync describe-resource-policies-request))))

(defn describe-queries-async
  "Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently
   in this account. You can request all queries, or limit it to queries of a specific log group or queries with a
   certain status.

  describe-queries-request - `com.amazonaws.services.logs.model.DescribeQueriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeQueries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeQueriesResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeQueriesRequest describe-queries-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeQueriesAsync describe-queries-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeQueriesRequest describe-queries-request]
    (-> this (.describeQueriesAsync describe-queries-request))))

(defn describe-subscription-filters-async
  "Lists the subscription filters for the specified log group. You can list all the subscription filters or filter
   the results by prefix. The results are ASCII-sorted by filter name.

  describe-subscription-filters-request - `com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscriptionFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest describe-subscription-filters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscriptionFiltersAsync describe-subscription-filters-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest describe-subscription-filters-request]
    (-> this (.describeSubscriptionFiltersAsync describe-subscription-filters-request))))

(defn put-retention-policy-async
  "Sets the retention of the specified log group. A retention policy allows you to configure the number of days for
   which to retain log events in the specified log group.

  put-retention-policy-request - `com.amazonaws.services.logs.model.PutRetentionPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRetentionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutRetentionPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutRetentionPolicyRequest put-retention-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRetentionPolicyAsync put-retention-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.PutRetentionPolicyRequest put-retention-policy-request]
    (-> this (.putRetentionPolicyAsync put-retention-policy-request))))

(defn disassociate-kms-key-async
  "Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified
   log group.


   After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested
   data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
   permissions for the CMK whenever the encrypted data is requested.


   Note that it can take up to 5 minutes for this operation to take effect.

  disassociate-kms-key-request - `com.amazonaws.services.logs.model.DisassociateKmsKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateKmsKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DisassociateKmsKeyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DisassociateKmsKeyRequest disassociate-kms-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateKmsKeyAsync disassociate-kms-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsync this ^com.amazonaws.services.logs.model.DisassociateKmsKeyRequest disassociate-kms-key-request]
    (-> this (.disassociateKmsKeyAsync disassociate-kms-key-request))))

