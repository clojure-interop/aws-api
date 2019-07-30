(ns com.amazonaws.services.cloudwatch.AmazonCloudWatch
  "Interface for accessing CloudWatch.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonCloudWatch instead.



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
  (:import [com.amazonaws.services.cloudwatch AmazonCloudWatch]))

(defn list-tags-for-resource
  "Displays the tags associated with a CloudWatch resource. Alarms support tagging.

  list-tags-for-resource-request - `com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudwatch.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.ListTagsForResourceResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn list-metrics
  "List the specified metrics. You can use the returned metrics with GetMetricData or
   GetMetricStatistics to obtain statistical data.


   Up to 500 results are returned for any one call. To retrieve additional results, use the returned token with
   subsequent calls.


   After you create a metric, allow up to fifteen minutes before the metric appears. Statistics about the metric,
   however, are available sooner using GetMetricData or GetMetricStatistics.

  list-metrics-request - `com.amazonaws.services.cloudwatch.model.ListMetricsRequest`

  returns: Result of the ListMetrics operation returned by the service. - `com.amazonaws.services.cloudwatch.model.ListMetricsResult`

  throws: com.amazonaws.services.cloudwatch.model.InternalServiceException - Request processing has failed due to some unknown error, exception, or failure."
  (^com.amazonaws.services.cloudwatch.model.ListMetricsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.ListMetricsRequest list-metrics-request]
    (-> this (.listMetrics list-metrics-request)))
  (^com.amazonaws.services.cloudwatch.model.ListMetricsResult [^AmazonCloudWatch this]
    (-> this (.listMetrics))))

(defn delete-dashboards
  "Deletes all dashboards that you specify. You may specify up to 100 dashboards to delete. If there is an error
   during this call, no dashboards are deleted.

  delete-dashboards-request - `com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest`

  returns: Result of the DeleteDashboards operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest delete-dashboards-request]
    (-> this (.deleteDashboards delete-dashboards-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonCloudWatch this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-alarm-history
  "Retrieves the history for the specified alarm. You can filter the results by date range or item type. If an alarm
   name is not specified, the histories for all alarms are returned.


   CloudWatch retains the history of an alarm even if you delete the alarm.

  describe-alarm-history-request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest`

  returns: Result of the DescribeAlarmHistory operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidNextTokenException - The next token specified is invalid."
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest describe-alarm-history-request]
    (-> this (.describeAlarmHistory describe-alarm-history-request)))
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult [^AmazonCloudWatch this]
    (-> this (.describeAlarmHistory))))

(defn waiters
  "returns: `com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters`"
  (^com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters [^AmazonCloudWatch this]
    (-> this (.waiters))))

(defn untag-resource
  "Removes one or more tags from the specified resource.

  untag-resource-request - `com.amazonaws.services.cloudwatch.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudwatch.model.UntagResourceResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.UntagResourceResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn describe-alarms-for-metric
  "Retrieves the alarms for the specified metric. To filter the results, specify a statistic, period, or unit.

  describe-alarms-for-metric-request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest`

  returns: Result of the DescribeAlarmsForMetric operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult`"
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest describe-alarms-for-metric-request]
    (-> this (.describeAlarmsForMetric describe-alarms-for-metric-request))))

(defn list-dashboards
  "Returns a list of the dashboards for your account. If you include DashboardNamePrefix, only those
   dashboards with names starting with the prefix are listed. Otherwise, all dashboards in your account are listed.


   ListDashboards returns up to 1000 results on one page. If there are more than 1000 dashboards, you
   can call ListDashboards again and include the value you received for NextToken in the
   first call, to receive the next 1000 results.

  list-dashboards-request - `com.amazonaws.services.cloudwatch.model.ListDashboardsRequest`

  returns: Result of the ListDashboards operation returned by the service. - `com.amazonaws.services.cloudwatch.model.ListDashboardsResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.ListDashboardsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.ListDashboardsRequest list-dashboards-request]
    (-> this (.listDashboards list-dashboards-request))))

(defn put-metric-alarm
  "Creates or updates an alarm and associates it with the specified metric, metric math expression, or anomaly
   detection model.


   Alarms based on anomaly detection models cannot have Auto Scaling actions.


   When this operation creates an alarm, the alarm state is immediately set to INSUFFICIENT_DATA. The
   alarm is then evaluated and its state is set appropriately. Any actions associated with the new state are then
   executed.


   When you update an existing alarm, its state is left unchanged, but the update completely overwrites the previous
   configuration of the alarm.


   If you are an IAM user, you must have Amazon EC2 permissions for some alarm operations:




   iam:CreateServiceLinkedRole for all alarms with EC2 actions




   ec2:DescribeInstanceStatus and ec2:DescribeInstances for all alarms on EC2 instance
   status metrics




   ec2:StopInstances for alarms with stop actions




   ec2:TerminateInstances for alarms with terminate actions




   No specific permissions are needed for alarms with recover actions




   If you have read/write permissions for Amazon CloudWatch but not for Amazon EC2, you can still create an alarm,
   but the stop or terminate actions are not performed. However, if you are later granted the required permissions,
   the alarm actions that you created earlier are performed.


   If you are using an IAM role (for example, an EC2 instance profile), you cannot stop or terminate the instance
   using alarm actions. However, you can still see the alarm state and perform any other actions such as Amazon SNS
   notifications or Auto Scaling policies.


   If you are using temporary security credentials granted using AWS STS, you cannot stop or terminate an EC2
   instance using alarm actions.


   The first time you create an alarm in the AWS Management Console, the CLI, or by using the PutMetricAlarm API,
   CloudWatch creates the necessary service-linked role for you. The service-linked role is called
   AWSServiceRoleForCloudWatchEvents. For more information, see AWS service-linked role.

  put-metric-alarm-request - `com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest`

  returns: Result of the PutMetricAlarm operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult`

  throws: com.amazonaws.services.cloudwatch.model.LimitExceededException - The quota for alarms for this customer has already been reached."
  (^com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest put-metric-alarm-request]
    (-> this (.putMetricAlarm put-metric-alarm-request))))

(defn set-alarm-state
  "Temporarily sets the state of an alarm for testing purposes. When the updated state differs from the previous
   value, the action configured for the appropriate state is invoked. For example, if your alarm is configured to
   send an Amazon SNS message when an alarm is triggered, temporarily changing the alarm state to ALARM
   sends an SNS message. The alarm returns to its actual state (often within seconds). Because the alarm state
   change happens quickly, it is typically only visible in the alarm's History tab in the Amazon CloudWatch
   console or through DescribeAlarmHistory.

  set-alarm-state-request - `com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest`

  returns: Result of the SetAlarmState operation returned by the service. - `com.amazonaws.services.cloudwatch.model.SetAlarmStateResult`

  throws: com.amazonaws.services.cloudwatch.model.ResourceNotFoundException - The named resource does not exist."
  (^com.amazonaws.services.cloudwatch.model.SetAlarmStateResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest set-alarm-state-request]
    (-> this (.setAlarmState set-alarm-state-request))))

(defn delete-anomaly-detector
  "Deletes the specified anomaly detection model from your account.

  delete-anomaly-detector-request - `com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest`

  returns: Result of the DeleteAnomalyDetector operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorResult`

  throws: com.amazonaws.services.cloudwatch.model.ResourceNotFoundException - The named resource does not exist."
  (^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest delete-anomaly-detector-request]
    (-> this (.deleteAnomalyDetector delete-anomaly-detector-request))))

(defn enable-alarm-actions
  "Enables the actions for the specified alarms.

  enable-alarm-actions-request - `com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest`

  returns: Result of the EnableAlarmActions operation returned by the service. - `com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult`"
  (^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest enable-alarm-actions-request]
    (-> this (.enableAlarmActions enable-alarm-actions-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonCloudWatch this]
    (-> this (.shutdown))))

(defn disable-alarm-actions
  "Disables the actions for the specified alarms. When an alarm's actions are disabled, the alarm actions do not
   execute when the alarm state changes.

  disable-alarm-actions-request - `com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest`

  returns: Result of the DisableAlarmActions operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult`"
  (^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest disable-alarm-actions-request]
    (-> this (.disableAlarmActions disable-alarm-actions-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"monitoring.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://monitoring.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonCloudWatch this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-metric-statistics
  "Gets statistics for the specified metric.


   The maximum number of data points returned from a single call is 1,440. If you request more than 1,440 data
   points, CloudWatch returns an error. To reduce the number of data points, you can narrow the specified time range
   and make multiple requests across adjacent time ranges, or you can increase the specified period. Data points are
   not returned in chronological order.


   CloudWatch aggregates data points based on the length of the period that you specify. For example, if you request
   statistics with a one-hour period, CloudWatch aggregates all data points with time stamps that fall within each
   one-hour period. Therefore, the number of values aggregated by CloudWatch is larger than the number of data
   points returned.


   CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
   instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:




   The SampleCount value of the statistic set is 1.




   The Min and the Max values of the statistic set are equal.




   Percentile statistics are not available for metrics when any of the metric values are negative numbers.


   Amazon CloudWatch retains metric data as follows:




   Data points with a period of less than 60 seconds are available for 3 hours. These data points are
   high-resolution metrics and are available only for custom metrics that have been defined with a
   StorageResolution of 1.




   Data points with a period of 60 seconds (1-minute) are available for 15 days.




   Data points with a period of 300 seconds (5-minute) are available for 63 days.




   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).




   Data points that are initially published with a shorter period are aggregated together for long-term storage. For
   example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
   resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
   of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.


   CloudWatch started retaining 5-minute and 1-hour metric data as of July 9, 2016.


   For information about metrics and dimensions supported by AWS services, see the Amazon CloudWatch
   Metrics and Dimensions Reference in the Amazon CloudWatch User Guide.

  get-metric-statistics-request - `com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest`

  returns: Result of the GetMetricStatistics operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest get-metric-statistics-request]
    (-> this (.getMetricStatistics get-metric-statistics-request))))

(defn get-metric-widget-image
  "You can use the GetMetricWidgetImage API to retrieve a snapshot graph of one or more Amazon
   CloudWatch metrics as a bitmap image. You can then embed this image into your services and products, such as wiki
   pages, reports, and documents. You could also retrieve images regularly, such as every minute, and create your
   own custom live dashboard.


   The graph you retrieve can include all CloudWatch metric graph features, including metric math and horizontal and
   vertical annotations.


   There is a limit of 20 transactions per second for this API. Each GetMetricWidgetImage action has
   the following limits:




   As many as 100 metrics in the graph.




   Up to 100 KB uncompressed payload.

  get-metric-widget-image-request - `com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest`

  returns: Result of the GetMetricWidgetImage operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageResult`"
  (^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest get-metric-widget-image-request]
    (-> this (.getMetricWidgetImage get-metric-widget-image-request))))

(defn get-dashboard
  "Displays the details of the dashboard that you specify.


   To copy an existing dashboard, use GetDashboard, and then use the data returned within
   DashboardBody as the template for the new dashboard when you call PutDashboard to
   create the copy.

  get-dashboard-request - `com.amazonaws.services.cloudwatch.model.GetDashboardRequest`

  returns: Result of the GetDashboard operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetDashboardResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.GetDashboardResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetDashboardRequest get-dashboard-request]
    (-> this (.getDashboard get-dashboard-request))))

(defn describe-alarms
  "Retrieves the specified alarms. If no alarms are specified, all alarms are returned. Alarms can be retrieved by
   using only a prefix for the alarm name, the alarm state, or a prefix for any action.

  describe-alarms-request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest`

  returns: Result of the DescribeAlarms operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidNextTokenException - The next token specified is invalid."
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest describe-alarms-request]
    (-> this (.describeAlarms describe-alarms-request)))
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult [^AmazonCloudWatch this]
    (-> this (.describeAlarms))))

(defn describe-anomaly-detectors
  "Lists the anomaly detection models that you have created in your account. You can list all models in your account
   or filter the results to only the models that are related to a certain namespace, metric name, or metric
   dimension.

  describe-anomaly-detectors-request - `com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest`

  returns: Result of the DescribeAnomalyDetectors operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidNextTokenException - The next token specified is invalid."
  (^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest describe-anomaly-detectors-request]
    (-> this (.describeAnomalyDetectors describe-anomaly-detectors-request))))

(defn get-metric-data
  "You can use the GetMetricData API to retrieve as many as 100 different metrics in a single request,
   with a total of as many as 100,800 datapoints. You can also optionally perform math expressions on the values of
   the returned statistics, to create new time series that represent new insights into your data. For example, using
   Lambda metrics, you could divide the Errors metric by the Invocations metric to get an error rate time series.
   For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide.


   Calls to the GetMetricData API have a different pricing structure than calls to
   GetMetricStatistics. For more information about pricing, see Amazon CloudWatch Pricing.


   Amazon CloudWatch retains metric data as follows:




   Data points with a period of less than 60 seconds are available for 3 hours. These data points are
   high-resolution metrics and are available only for custom metrics that have been defined with a
   StorageResolution of 1.




   Data points with a period of 60 seconds (1-minute) are available for 15 days.




   Data points with a period of 300 seconds (5-minute) are available for 63 days.




   Data points with a period of 3600 seconds (1 hour) are available for 455 days (15 months).




   Data points that are initially published with a shorter period are aggregated together for long-term storage. For
   example, if you collect data using a period of 1 minute, the data remains available for 15 days with 1-minute
   resolution. After 15 days, this data is still available, but is aggregated and retrievable only with a resolution
   of 5 minutes. After 63 days, the data is further aggregated and is available with a resolution of 1 hour.

  get-metric-data-request - `com.amazonaws.services.cloudwatch.model.GetMetricDataRequest`

  returns: Result of the GetMetricData operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetMetricDataResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidNextTokenException - The next token specified is invalid."
  (^com.amazonaws.services.cloudwatch.model.GetMetricDataResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetMetricDataRequest get-metric-data-request]
    (-> this (.getMetricData get-metric-data-request))))

(defn put-anomaly-detector
  "Creates an anomaly detection model for a CloudWatch metric. You can use the model to display a band of expected
   normal values when the metric is graphed.


   For more information, see CloudWatch Anomaly Detection.

  put-anomaly-detector-request - `com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest`

  returns: Result of the PutAnomalyDetector operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorResult`

  throws: com.amazonaws.services.cloudwatch.model.LimitExceededException - The operation exceeded one or more limits."
  (^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest put-anomaly-detector-request]
    (-> this (.putAnomalyDetector put-anomaly-detector-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonCloudWatch this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-dashboard
  "Creates a dashboard if it does not already exist, or updates an existing dashboard. If you update a dashboard,
   the entire contents are replaced with what you specify here.


   All dashboards in your account are global, not region-specific.


   A simple way to create a dashboard using PutDashboard is to copy an existing dashboard. To copy an
   existing dashboard using the console, you can load the dashboard and then use the View/edit source command in the
   Actions menu to display the JSON block for that dashboard. Another way to copy a dashboard is to use
   GetDashboard, and then use the data returned within DashboardBody as the template for
   the new dashboard when you call PutDashboard.


   When you create a dashboard with PutDashboard, a good practice is to add a text widget at the top of
   the dashboard with a message that the dashboard was created by script and should not be changed in the console.
   This message could also point console users to the location of the DashboardBody script or the
   CloudFormation template used to create the dashboard.

  put-dashboard-request - `com.amazonaws.services.cloudwatch.model.PutDashboardRequest`

  returns: Result of the PutDashboard operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutDashboardResult`

  throws: com.amazonaws.services.cloudwatch.model.DashboardInvalidInputErrorException - Some part of the dashboard data is invalid."
  (^com.amazonaws.services.cloudwatch.model.PutDashboardResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutDashboardRequest put-dashboard-request]
    (-> this (.putDashboard put-dashboard-request))))

(defn tag-resource
  "Assigns one or more tags (key-value pairs) to the specified CloudWatch resource. Tags can help you organize and
   categorize your resources. You can also use them to scope user permissions, by granting a user permission to
   access or change only resources with certain tag values. In CloudWatch, alarms can be tagged.


   Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.


   You can use the TagResource action with a resource that already has tags. If you specify a new tag
   key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag
   key that is already associated with the resource, the new tag value that you specify replaces the previous value
   for that tag.


   You can associate as many as 50 tags with a resource.

  tag-resource-request - `com.amazonaws.services.cloudwatch.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudwatch.model.TagResourceResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.TagResourceResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn put-metric-data
  "Publishes metric data points to Amazon CloudWatch. CloudWatch associates the data points with the specified
   metric. If the specified metric does not exist, CloudWatch creates the metric. When CloudWatch creates a metric,
   it can take up to fifteen minutes for the metric to appear in calls to ListMetrics.


   You can publish either individual data points in the Value field, or arrays of values and the number
   of times each value occurred during the period by using the Values and Counts fields in
   the MetricDatum structure. Using the Values and Counts method enables you
   to publish up to 150 values per metric with one PutMetricData request, and supports retrieving
   percentile statistics on this data.


   Each PutMetricData request is limited to 40 KB in size for HTTP POST requests. You can send a
   payload compressed by gzip. Each request is also limited to no more than 20 different metrics.


   Although the Value parameter accepts numbers of type Double, CloudWatch rejects values
   that are either too small or too large. Values must be in the range of 8.515920e-109 to 1.174271e+108 (Base 10)
   or 2e-360 to 2e360 (Base 2). In addition, special values (for example, NaN, Infinity, -Infinity) are not
   supported.


   You can use up to 10 dimensions per metric to further clarify what data the metric collects. Each dimension
   consists of a Name and Value pair. For more information about specifying dimensions, see Publishing
   Metrics in the Amazon CloudWatch User Guide.


   Data points with time stamps from 24 hours ago or longer can take at least 48 hours to become available for
   GetMetricData or GetMetricStatistics from the time they are submitted.


   CloudWatch needs raw data points to calculate percentile statistics. If you publish data using a statistic set
   instead, you can only retrieve percentile statistics for this data if one of the following conditions is true:




   The SampleCount value of the statistic set is 1 and Min, Max, and
   Sum are all equal.




   The Min and Max are equal, and Sum is equal to Min multiplied
   by SampleCount.

  put-metric-data-request - `com.amazonaws.services.cloudwatch.model.PutMetricDataRequest`

  returns: Result of the PutMetricData operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutMetricDataResult`

  throws: com.amazonaws.services.cloudwatch.model.InvalidParameterValueException - The value of an input parameter is bad or out-of-range."
  (^com.amazonaws.services.cloudwatch.model.PutMetricDataResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutMetricDataRequest put-metric-data-request]
    (-> this (.putMetricData put-metric-data-request))))

(defn delete-alarms
  "Deletes the specified alarms. In the event of an error, no alarms are deleted.

  delete-alarms-request - `com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest`

  returns: Result of the DeleteAlarms operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult`

  throws: com.amazonaws.services.cloudwatch.model.ResourceNotFoundException - The named resource does not exist."
  (^com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult [^AmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest delete-alarms-request]
    (-> this (.deleteAlarms delete-alarms-request))))

