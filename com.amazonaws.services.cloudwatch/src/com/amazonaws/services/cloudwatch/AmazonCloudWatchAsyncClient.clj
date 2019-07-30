(ns com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClient
  "Client for accessing CloudWatch asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon CloudWatch monitors your Amazon Web Services (AWS) resources and the applications you run on AWS in real time.
  You can use CloudWatch to collect and track metrics, which are the variables you want to measure for your resources
  and applications.


  CloudWatch alarms send notifications or automatically change the resources you are monitoring based on rules that you
  define. For example, you can monitor the CPU usage and disk reads and writes of your Amazon EC2 instances. Then, use
  this data to determine whether you should launch additional instances to handle increased load. You can also use this
  data to stop under-used instances to save money.


  In addition to monitoring the built-in metrics that come with AWS, you can monitor your own custom metrics. With
  CloudWatch, you gain system-wide visibility into resource utilization, application performance, and operational
  health."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatch AmazonCloudWatchAsyncClient]))

(defn ->amazon-cloud-watch-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonCloudWatchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudWatchAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonCloudWatchAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonCloudWatchAsyncClient aws-credentials executor-service))
  (^AmazonCloudWatchAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonCloudWatchAsyncClient client-configuration))
  (^AmazonCloudWatchAsyncClient []
    (new AmazonCloudWatchAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClientBuilder`"
  (^com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClientBuilder []
    (AmazonCloudWatchAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn describe-anomaly-detectors-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAnomalyDetectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAnomalyDetectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest request]
    (-> this (.describeAnomalyDetectorsAsync request))))

(defn describe-alarms-for-metric-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlarmsForMetric operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlarmsForMetricAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest request]
    (-> this (.describeAlarmsForMetricAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonCloudWatchAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-metric-statistics-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricStatisticsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest request]
    (-> this (.getMetricStatisticsAsync request))))

(defn describe-alarms-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlarms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlarmsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest request]
    (-> this (.describeAlarmsAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this]
    (-> this (.describeAlarmsAsync))))

(defn enable-alarm-actions-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAlarmActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAlarmActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest request]
    (-> this (.enableAlarmActionsAsync request))))

(defn get-metric-data-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetMetricDataRequest request]
    (-> this (.getMetricDataAsync request))))

(defn put-metric-data-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutMetricDataRequest request]
    (-> this (.putMetricDataAsync request))))

(defn describe-alarm-history-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlarmHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlarmHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest request]
    (-> this (.describeAlarmHistoryAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this]
    (-> this (.describeAlarmHistoryAsync))))

(defn delete-alarms-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlarms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAlarmsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest request]
    (-> this (.deleteAlarmsAsync request))))

(defn set-alarm-state-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetAlarmState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.SetAlarmStateResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setAlarmStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest request]
    (-> this (.setAlarmStateAsync request))))

(defn put-anomaly-detector-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAnomalyDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAnomalyDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest request]
    (-> this (.putAnomalyDetectorAsync request))))

(defn list-metrics-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.ListMetricsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.ListMetricsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.ListMetricsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMetricsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.ListMetricsRequest request]
    (-> this (.listMetricsAsync request)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this]
    (-> this (.listMetricsAsync))))

(defn disable-alarm-actions-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAlarmActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAlarmActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest request]
    (-> this (.disableAlarmActionsAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonCloudWatchAsyncClient this]
    (-> this (.shutdown))))

(defn put-dashboard-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutDashboardRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDashboard operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutDashboardResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutDashboardRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDashboardAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutDashboardRequest request]
    (-> this (.putDashboardAsync request))))

(defn get-dashboard-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetDashboardRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDashboard operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetDashboardResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetDashboardRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDashboardAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetDashboardRequest request]
    (-> this (.getDashboardAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn put-metric-alarm-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMetricAlarm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMetricAlarmAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest request]
    (-> this (.putMetricAlarmAsync request))))

(defn list-dashboards-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.ListDashboardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDashboards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.ListDashboardsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.ListDashboardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDashboardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.ListDashboardsRequest request]
    (-> this (.listDashboardsAsync request))))

(defn delete-dashboards-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDashboards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDashboardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest request]
    (-> this (.deleteDashboardsAsync request))))

(defn delete-anomaly-detector-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAnomalyDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAnomalyDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest request]
    (-> this (.deleteAnomalyDetectorAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-metric-widget-image-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricWidgetImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageResult>`"
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricWidgetImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonCloudWatchAsyncClient this ^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest request]
    (-> this (.getMetricWidgetImageAsync request))))

