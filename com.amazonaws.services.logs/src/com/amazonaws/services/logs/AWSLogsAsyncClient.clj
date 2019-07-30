(ns com.amazonaws.services.logs.AWSLogsAsyncClient
  "Client for accessing Amazon CloudWatch Logs asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.logs AWSLogsAsyncClient]))

(defn ->aws-logs-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSLogsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSLogsAsyncClient aws-credentials client-configuration executor-service))
  (^AWSLogsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSLogsAsyncClient aws-credentials executor-service))
  (^AWSLogsAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSLogsAsyncClient client-configuration))
  (^AWSLogsAsyncClient []
    (new AWSLogsAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.logs.AWSLogsAsyncClientBuilder`"
  (^com.amazonaws.services.logs.AWSLogsAsyncClientBuilder []
    (AWSLogsAsyncClient/asyncBuilder )))

(defn describe-metric-filters-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeMetricFiltersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMetricFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeMetricFiltersResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeMetricFiltersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMetricFiltersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeMetricFiltersRequest request]
    (-> this (.describeMetricFiltersAsync request))))

(defn delete-subscription-filter-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubscriptionFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteSubscriptionFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubscriptionFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteSubscriptionFilterRequest request]
    (-> this (.deleteSubscriptionFilterAsync request))))

(defn delete-metric-filter-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DeleteMetricFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteMetricFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteMetricFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteMetricFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMetricFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteMetricFilterRequest request]
    (-> this (.deleteMetricFilterAsync request))))

(defn describe-log-streams-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeLogStreamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLogStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeLogStreamsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeLogStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLogStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeLogStreamsRequest request]
    (-> this (.describeLogStreamsAsync request))))

(defn get-log-events-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.GetLogEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLogEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetLogEventsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetLogEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLogEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetLogEventsRequest request]
    (-> this (.getLogEventsAsync request))))

(defn delete-log-stream-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DeleteLogStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLogStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteLogStreamResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteLogStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLogStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteLogStreamRequest request]
    (-> this (.deleteLogStreamAsync request))))

(defn start-query-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.StartQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.StartQueryResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.StartQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.StartQueryRequest request]
    (-> this (.startQueryAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSLogsAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-log-groups-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeLogGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLogGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeLogGroupsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeLogGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLogGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeLogGroupsRequest request]
    (-> this (.describeLogGroupsAsync request)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this]
    (-> this (.describeLogGroupsAsync))))

(defn create-export-task-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.CreateExportTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CreateExportTaskResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CreateExportTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createExportTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CreateExportTaskRequest request]
    (-> this (.createExportTaskAsync request))))

(defn stop-query-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.StopQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.StopQueryResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.StopQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.StopQueryRequest request]
    (-> this (.stopQueryAsync request))))

(defn put-log-events-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.PutLogEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLogEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutLogEventsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutLogEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLogEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutLogEventsRequest request]
    (-> this (.putLogEventsAsync request))))

(defn put-subscription-filter-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.PutSubscriptionFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSubscriptionFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutSubscriptionFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutSubscriptionFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSubscriptionFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutSubscriptionFilterRequest request]
    (-> this (.putSubscriptionFilterAsync request))))

(defn cancel-export-task-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.CancelExportTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CancelExportTaskResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CancelExportTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelExportTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CancelExportTaskRequest request]
    (-> this (.cancelExportTaskAsync request))))

(defn get-query-results-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.GetQueryResultsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueryResults operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetQueryResultsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetQueryResultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueryResultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetQueryResultsRequest request]
    (-> this (.getQueryResultsAsync request))))

(defn delete-log-group-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DeleteLogGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteLogGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLogGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteLogGroupRequest request]
    (-> this (.deleteLogGroupAsync request))))

(defn put-metric-filter-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.PutMetricFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMetricFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutMetricFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutMetricFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMetricFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutMetricFilterRequest request]
    (-> this (.putMetricFilterAsync request))))

(defn create-log-group-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.CreateLogGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CreateLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CreateLogGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLogGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CreateLogGroupRequest request]
    (-> this (.createLogGroupAsync request))))

(defn associate-kms-key-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.AssociateKmsKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateKmsKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.AssociateKmsKeyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.AssociateKmsKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateKmsKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.AssociateKmsKeyRequest request]
    (-> this (.associateKmsKeyAsync request))))

(defn put-destination-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.PutDestinationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDestination operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutDestinationResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutDestinationRequest request]
    (-> this (.putDestinationAsync request))))

(defn get-log-record-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.GetLogRecordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLogRecord operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetLogRecordResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetLogRecordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLogRecordAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetLogRecordRequest request]
    (-> this (.getLogRecordAsync request))))

(defn test-metric-filter-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.TestMetricFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestMetricFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.TestMetricFilterResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.TestMetricFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testMetricFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.TestMetricFilterRequest request]
    (-> this (.testMetricFilterAsync request))))

(defn filter-log-events-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.FilterLogEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FilterLogEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.FilterLogEventsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.FilterLogEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.filterLogEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.FilterLogEventsRequest request]
    (-> this (.filterLogEventsAsync request))))

(defn get-log-group-fields-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.GetLogGroupFieldsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLogGroupFields operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.GetLogGroupFieldsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetLogGroupFieldsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLogGroupFieldsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.GetLogGroupFieldsRequest request]
    (-> this (.getLogGroupFieldsAsync request))))

(defn describe-export-tasks-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeExportTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeExportTasksResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeExportTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasksAsync request))))

(defn tag-log-group-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.TagLogGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.TagLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.TagLogGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagLogGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.TagLogGroupRequest request]
    (-> this (.tagLogGroupAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSLogsAsyncClient this]
    (-> this (.shutdown))))

(defn delete-retention-policy-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRetentionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteRetentionPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRetentionPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteRetentionPolicyRequest request]
    (-> this (.deleteRetentionPolicyAsync request))))

(defn list-tags-log-group-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.ListTagsLogGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.ListTagsLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.ListTagsLogGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsLogGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.ListTagsLogGroupRequest request]
    (-> this (.listTagsLogGroupAsync request))))

(defn delete-destination-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DeleteDestinationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDestination operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteDestinationResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteDestinationRequest request]
    (-> this (.deleteDestinationAsync request))))

(defn delete-resource-policy-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DeleteResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DeleteResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DeleteResourcePolicyRequest request]
    (-> this (.deleteResourcePolicyAsync request))))

(defn untag-log-group-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.UntagLogGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagLogGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.UntagLogGroupResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.UntagLogGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagLogGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.UntagLogGroupRequest request]
    (-> this (.untagLogGroupAsync request))))

(defn describe-destinations-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeDestinationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDestinations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeDestinationsResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeDestinationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDestinationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeDestinationsRequest request]
    (-> this (.describeDestinationsAsync request)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this]
    (-> this (.describeDestinationsAsync))))

(defn put-destination-policy-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.PutDestinationPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDestinationPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutDestinationPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutDestinationPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDestinationPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutDestinationPolicyRequest request]
    (-> this (.putDestinationPolicyAsync request))))

(defn put-resource-policy-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.PutResourcePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutResourcePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutResourcePolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutResourcePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putResourcePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutResourcePolicyRequest request]
    (-> this (.putResourcePolicyAsync request))))

(defn create-log-stream-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.CreateLogStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLogStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.CreateLogStreamResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CreateLogStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLogStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.CreateLogStreamRequest request]
    (-> this (.createLogStreamAsync request))))

(defn describe-resource-policies-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeResourcePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeResourcePoliciesResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeResourcePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeResourcePoliciesRequest request]
    (-> this (.describeResourcePoliciesAsync request))))

(defn describe-queries-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeQueriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeQueries operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeQueriesResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeQueriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeQueriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeQueriesRequest request]
    (-> this (.describeQueriesAsync request))))

(defn describe-subscription-filters-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscriptionFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DescribeSubscriptionFiltersResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscriptionFiltersAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DescribeSubscriptionFiltersRequest request]
    (-> this (.describeSubscriptionFiltersAsync request))))

(defn put-retention-policy-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.PutRetentionPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRetentionPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.PutRetentionPolicyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutRetentionPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRetentionPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.PutRetentionPolicyRequest request]
    (-> this (.putRetentionPolicyAsync request))))

(defn disassociate-kms-key-async
  "Description copied from interface: AWSLogsAsync

  request - `com.amazonaws.services.logs.model.DisassociateKmsKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateKmsKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.logs.model.DisassociateKmsKeyResult>`"
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DisassociateKmsKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateKmsKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSLogsAsyncClient this ^com.amazonaws.services.logs.model.DisassociateKmsKeyRequest request]
    (-> this (.disassociateKmsKeyAsync request))))

