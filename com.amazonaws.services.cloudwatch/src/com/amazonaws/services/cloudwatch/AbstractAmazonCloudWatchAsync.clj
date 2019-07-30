(ns com.amazonaws.services.cloudwatch.AbstractAmazonCloudWatchAsync
  "Abstract implementation of AmazonCloudWatchAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatch AbstractAmazonCloudWatchAsync]))

(defn untag-resource-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn describe-anomaly-detectors-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAnomalyDetectors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAnomalyDetectorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest request]
    (-> this (.describeAnomalyDetectorsAsync request))))

(defn describe-alarms-for-metric-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlarmsForMetric operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlarmsForMetricAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest request]
    (-> this (.describeAlarmsForMetricAsync request))))

(defn get-metric-statistics-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricStatisticsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest request]
    (-> this (.getMetricStatisticsAsync request))))

(defn describe-alarms-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlarms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlarmsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest request]
    (-> this (.describeAlarmsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this]
    (-> this (.describeAlarmsAsync))))

(defn enable-alarm-actions-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAlarmActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAlarmActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest request]
    (-> this (.enableAlarmActionsAsync request))))

(defn get-metric-data-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetMetricDataResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetMetricDataRequest request]
    (-> this (.getMetricDataAsync request))))

(defn put-metric-data-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutMetricDataResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutMetricDataRequest request]
    (-> this (.putMetricDataAsync request))))

(defn describe-alarm-history-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlarmHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlarmHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest request]
    (-> this (.describeAlarmHistoryAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this]
    (-> this (.describeAlarmHistoryAsync))))

(defn delete-alarms-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlarms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAlarmsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest request]
    (-> this (.deleteAlarmsAsync request))))

(defn set-alarm-state-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetAlarmState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.SetAlarmStateResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setAlarmStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest request]
    (-> this (.setAlarmStateAsync request))))

(defn put-anomaly-detector-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAnomalyDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAnomalyDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest request]
    (-> this (.putAnomalyDetectorAsync request))))

(defn list-metrics-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.ListMetricsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMetrics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.ListMetricsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.ListMetricsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMetricsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.ListMetricsRequest request]
    (-> this (.listMetricsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this]
    (-> this (.listMetricsAsync))))

(defn disable-alarm-actions-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAlarmActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAlarmActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest request]
    (-> this (.disableAlarmActionsAsync request))))

(defn put-dashboard-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutDashboardRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDashboard operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutDashboardResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutDashboardRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDashboardAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutDashboardRequest request]
    (-> this (.putDashboardAsync request))))

(defn get-dashboard-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetDashboardRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDashboard operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetDashboardResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetDashboardRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDashboardAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetDashboardRequest request]
    (-> this (.getDashboardAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn put-metric-alarm-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutMetricAlarm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putMetricAlarmAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest request]
    (-> this (.putMetricAlarmAsync request))))

(defn list-dashboards-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.ListDashboardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDashboards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.ListDashboardsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.ListDashboardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDashboardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.ListDashboardsRequest request]
    (-> this (.listDashboardsAsync request))))

(defn delete-dashboards-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDashboards operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDashboardsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest request]
    (-> this (.deleteDashboardsAsync request))))

(defn delete-anomaly-detector-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAnomalyDetector operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAnomalyDetectorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest request]
    (-> this (.deleteAnomalyDetectorAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-metric-widget-image-async
  "Description copied from interface: AmazonCloudWatchAsync

  request - `com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetMetricWidgetImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getMetricWidgetImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonCloudWatchAsync this ^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest request]
    (-> this (.getMetricWidgetImageAsync request))))

