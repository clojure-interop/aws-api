(ns com.amazonaws.services.cloudwatch.AbstractAmazonCloudWatch
  "Abstract implementation of AmazonCloudWatch. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudwatch AbstractAmazonCloudWatch]))

(defn list-tags-for-resource
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudwatch.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.cloudwatch.model.ListTagsForResourceResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn list-metrics
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.ListMetricsRequest`

  returns: Result of the ListMetrics operation returned by the service. - `com.amazonaws.services.cloudwatch.model.ListMetricsResult`"
  (^com.amazonaws.services.cloudwatch.model.ListMetricsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.ListMetricsRequest request]
    (-> this (.listMetrics request)))
  (^com.amazonaws.services.cloudwatch.model.ListMetricsResult [^AbstractAmazonCloudWatch this]
    (-> this (.listMetrics))))

(defn delete-dashboards
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest`

  returns: Result of the DeleteDashboards operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult`"
  (^com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest request]
    (-> this (.deleteDashboards request))))

(defn set-region
  "Description copied from interface: AmazonCloudWatch

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonCloudWatch this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-alarm-history
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest`

  returns: Result of the DescribeAlarmHistory operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult`"
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest request]
    (-> this (.describeAlarmHistory request)))
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult [^AbstractAmazonCloudWatch this]
    (-> this (.describeAlarmHistory))))

(defn waiters
  "returns: `com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters`"
  (^com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters [^AbstractAmazonCloudWatch this]
    (-> this (.waiters))))

(defn untag-resource
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.cloudwatch.model.UntagResourceResult`"
  (^com.amazonaws.services.cloudwatch.model.UntagResourceResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn describe-alarms-for-metric
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest`

  returns: Result of the DescribeAlarmsForMetric operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult`"
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest request]
    (-> this (.describeAlarmsForMetric request))))

(defn list-dashboards
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.ListDashboardsRequest`

  returns: Result of the ListDashboards operation returned by the service. - `com.amazonaws.services.cloudwatch.model.ListDashboardsResult`"
  (^com.amazonaws.services.cloudwatch.model.ListDashboardsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.ListDashboardsRequest request]
    (-> this (.listDashboards request))))

(defn put-metric-alarm
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest`

  returns: Result of the PutMetricAlarm operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult`"
  (^com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest request]
    (-> this (.putMetricAlarm request))))

(defn set-alarm-state
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest`

  returns: Result of the SetAlarmState operation returned by the service. - `com.amazonaws.services.cloudwatch.model.SetAlarmStateResult`"
  (^com.amazonaws.services.cloudwatch.model.SetAlarmStateResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest request]
    (-> this (.setAlarmState request))))

(defn delete-anomaly-detector
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest`

  returns: Result of the DeleteAnomalyDetector operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorResult`"
  (^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DeleteAnomalyDetectorRequest request]
    (-> this (.deleteAnomalyDetector request))))

(defn enable-alarm-actions
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest`

  returns: Result of the EnableAlarmActions operation returned by the service. - `com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult`"
  (^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest request]
    (-> this (.enableAlarmActions request))))

(defn shutdown
  "Description copied from interface: AmazonCloudWatch"
  ([^AbstractAmazonCloudWatch this]
    (-> this (.shutdown))))

(defn disable-alarm-actions
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest`

  returns: Result of the DisableAlarmActions operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult`"
  (^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest request]
    (-> this (.disableAlarmActions request))))

(defn set-endpoint
  "Description copied from interface: AmazonCloudWatch

  endpoint - The endpoint (ex: \"monitoring.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://monitoring.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonCloudWatch this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-metric-statistics
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest`

  returns: Result of the GetMetricStatistics operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult`"
  (^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest request]
    (-> this (.getMetricStatistics request))))

(defn get-metric-widget-image
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest`

  returns: Result of the GetMetricWidgetImage operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageResult`"
  (^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest request]
    (-> this (.getMetricWidgetImage request))))

(defn get-dashboard
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.GetDashboardRequest`

  returns: Result of the GetDashboard operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetDashboardResult`"
  (^com.amazonaws.services.cloudwatch.model.GetDashboardResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetDashboardRequest request]
    (-> this (.getDashboard request))))

(defn describe-alarms
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest`

  returns: Result of the DescribeAlarms operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult`"
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest request]
    (-> this (.describeAlarms request)))
  (^com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult [^AbstractAmazonCloudWatch this]
    (-> this (.describeAlarms))))

(defn describe-anomaly-detectors
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest`

  returns: Result of the DescribeAnomalyDetectors operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsResult`"
  (^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DescribeAnomalyDetectorsRequest request]
    (-> this (.describeAnomalyDetectors request))))

(defn get-metric-data
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.GetMetricDataRequest`

  returns: Result of the GetMetricData operation returned by the service. - `com.amazonaws.services.cloudwatch.model.GetMetricDataResult`"
  (^com.amazonaws.services.cloudwatch.model.GetMetricDataResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.GetMetricDataRequest request]
    (-> this (.getMetricData request))))

(defn put-anomaly-detector
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest`

  returns: Result of the PutAnomalyDetector operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorResult`"
  (^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutAnomalyDetectorRequest request]
    (-> this (.putAnomalyDetector request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonCloudWatch

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonCloudWatch this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn put-dashboard
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.PutDashboardRequest`

  returns: Result of the PutDashboard operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutDashboardResult`"
  (^com.amazonaws.services.cloudwatch.model.PutDashboardResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutDashboardRequest request]
    (-> this (.putDashboard request))))

(defn tag-resource
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.cloudwatch.model.TagResourceResult`"
  (^com.amazonaws.services.cloudwatch.model.TagResourceResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn put-metric-data
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.PutMetricDataRequest`

  returns: Result of the PutMetricData operation returned by the service. - `com.amazonaws.services.cloudwatch.model.PutMetricDataResult`"
  (^com.amazonaws.services.cloudwatch.model.PutMetricDataResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.PutMetricDataRequest request]
    (-> this (.putMetricData request))))

(defn delete-alarms
  "Description copied from interface: AmazonCloudWatch

  request - `com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest`

  returns: Result of the DeleteAlarms operation returned by the service. - `com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult`"
  (^com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult [^AbstractAmazonCloudWatch this ^com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest request]
    (-> this (.deleteAlarms request))))

