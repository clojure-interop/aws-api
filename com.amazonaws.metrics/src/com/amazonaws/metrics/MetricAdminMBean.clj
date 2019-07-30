(ns com.amazonaws.metrics.MetricAdminMBean
  "MBean interface for AwsSdkMetrics administration."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics MetricAdminMBean]))

(defn single-metric-namespace?
  "Returns true if single metric name space is to be used; false otherwise.

  returns: `boolean`"
  (^Boolean [^MetricAdminMBean this]
    (-> this (.isSingleMetricNamespace))))

(defn set-metric-name-space
  "Sets the metric name space.

  metric-name-space - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if the given name space is either null or blank."
  ([^MetricAdminMBean this ^java.lang.String metric-name-space]
    (-> this (.setMetricNameSpace metric-name-space))))

(defn set-host-metric-name
  "Sets the host name to enable per-host level metrics generation. If
   the given value is either null or blank but the per-host metric is
   enabled, the host name will be automatically detected via
   InetAddress.

  host-metric-name - `java.lang.String`"
  ([^MetricAdminMBean this ^java.lang.String host-metric-name]
    (-> this (.setHostMetricName host-metric-name))))

(defn set-region
  "Sets the region to be used for the default AWS SDK metric collector; or
   null if the default is to be used.

  region - `java.lang.String`"
  ([^MetricAdminMBean this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn machine-metrics-excluded?
  "Returns true if machine metrics is to be excluded; false otherwise.

  returns: `boolean`"
  (^Boolean [^MetricAdminMBean this]
    (-> this (.isMachineMetricsExcluded))))

(defn set-queue-poll-timeout-milli
  "Sets the queue poll time in millisecond to be used for the default AWS
   SDK metric collector; or null if the default is to be used. Use Integer
   instead of Long as it seems jconsole does not handle Long properly.

  timeout-milli - `java.lang.Integer`"
  ([^MetricAdminMBean this ^java.lang.Integer timeout-milli]
    (-> this (.setQueuePollTimeoutMilli timeout-milli))))

(defn get-host-metric-name
  "Returns the host name for metric purposes. If the returned value is
   either null or blank, the host name will be automatically detected via
   InetAddress.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdminMBean this]
    (-> this (.getHostMetricName))))

(defn per-host-metrics-included?
  "Returns true if per-host metrics is to be included; false otherwise.

  returns: `boolean`"
  (^Boolean [^MetricAdminMBean this]
    (-> this (.isPerHostMetricsIncluded))))

(defn get-metric-queue-size
  "Returns the internal metric queue size to be used for the default AWS SDK
   metric collector; or null if the default is to be used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MetricAdminMBean this]
    (-> this (.getMetricQueueSize))))

(defn get-jvm-metric-name
  "Returns the JVM metric name. If the returned value is either null or
   blank, no JVM level metrics will be generated.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdminMBean this]
    (-> this (.getJvmMetricName))))

(defn get-metric-name-space
  "Returns the metric name space.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdminMBean this]
    (-> this (.getMetricNameSpace))))

(defn get-request-metric-collector
  "Returns the name of the request metric collector set at the AWS SDK
   level, or NONE if there is none.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdminMBean this]
    (-> this (.getRequestMetricCollector))))

(defn get-queue-poll-timeout-milli
  "Returns the internal metric queue timeout in millisecond to be used for
   the default AWS SDK metric collector; or null if the default is to be
   used. Use Integer instead of Long as it seems jconsole does not handle
   Long properly.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MetricAdminMBean this]
    (-> this (.getQueuePollTimeoutMilli))))

(defn set-credential-file
  "Sets the AWS credential file used by the default AWS SDK metric collector
   for accessing CloudWatch.

  filepath - must be a valid path to an AWS credential property file. - `java.lang.String`

  throws: java.io.FileNotFoundException"
  ([^MetricAdminMBean this ^java.lang.String filepath]
    (-> this (.setCredentialFile filepath))))

(defn set-single-metric-namespace
  "Used to set whether a single metric name space is to be used.

  single-metric-namespace - `boolean`"
  ([^MetricAdminMBean this ^Boolean single-metric-namespace]
    (-> this (.setSingleMetricNamespace single-metric-namespace))))

(defn get-credential-file
  "Returns the last set AWS credential file; or null if there is none.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdminMBean this]
    (-> this (.getCredentialFile))))

(defn metrics-enabled?
  "Returns true if metrics at the AWS SDK level is enabled; false if
   disabled.

  returns: `boolean`"
  (^Boolean [^MetricAdminMBean this]
    (-> this (.isMetricsEnabled))))

(defn get-service-metric-collector
  "Returns the name of the service metric collector set at the AWS SDK
   level, or NONE if there is none.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdminMBean this]
    (-> this (.getServiceMetricCollector))))

(defn set-metric-queue-size
  "Sets the metric queue size to be used for the default AWS SDK metric
   collector; or null if the default is to be used.

  metric-queue-size - `java.lang.Integer`"
  ([^MetricAdminMBean this ^java.lang.Integer metric-queue-size]
    (-> this (.setMetricQueueSize metric-queue-size))))

(defn disable-metrics
  "Disables the metric collector at the AWS SDK level."
  ([^MetricAdminMBean this]
    (-> this (.disableMetrics))))

(defn set-per-host-metrics-included
  "Used to set whether the per-host metrics is to be included.

  include-per-host-metrics - true if per-host metrics is to be included; false otherwise. - `boolean`"
  ([^MetricAdminMBean this ^Boolean include-per-host-metrics]
    (-> this (.setPerHostMetricsIncluded include-per-host-metrics))))

(defn set-jvm-metric-name
  "Sets the JVM metric name to enable per-JVM level metrics generation. If
   the given value is either null or blank, no JVM level metrics will be
   generated.

  jvm-metric-name - `java.lang.String`"
  ([^MetricAdminMBean this ^java.lang.String jvm-metric-name]
    (-> this (.setJvmMetricName jvm-metric-name))))

(defn enable-default-metrics
  "Starts the default AWS SDK metric collector, but only if no metric
   collector is currently in use at the AWS SDK level.

  returns: true if the default AWS SDK metric collector has been
           successfully started by this call; false otherwise. - `boolean`"
  (^Boolean [^MetricAdminMBean this]
    (-> this (.enableDefaultMetrics))))

(defn get-region
  "Returns the region configured for the default AWS SDK metric collector;
   or null if the default is to be used.

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdminMBean this]
    (-> this (.getRegion))))

(defn set-machine-metrics-excluded
  "Used to set whether the JVM metrics is to be excluded.

  exclude-machine-metrics - true if JVM metrics is to be excluded; false otherwise. - `boolean`"
  ([^MetricAdminMBean this ^Boolean exclude-machine-metrics]
    (-> this (.setMachineMetricsExcluded exclude-machine-metrics))))

