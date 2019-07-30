(ns com.amazonaws.metrics.MetricAdmin
  "Administration of AwsSdkMetrics as an MBean."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics MetricAdmin]))

(defn ->metric-admin
  "Constructor."
  (^MetricAdmin []
    (new MetricAdmin )))

(defn single-metric-namespace?
  "Description copied from interface: MetricAdminMBean

  returns: `boolean`"
  (^Boolean [^MetricAdmin this]
    (-> this (.isSingleMetricNamespace))))

(defn set-metric-name-space
  "Description copied from interface: MetricAdminMBean

  metric-name-space - `java.lang.String`"
  ([^MetricAdmin this ^java.lang.String metric-name-space]
    (-> this (.setMetricNameSpace metric-name-space))))

(defn set-host-metric-name
  "Description copied from interface: MetricAdminMBean

  host-metric-name - `java.lang.String`"
  ([^MetricAdmin this ^java.lang.String host-metric-name]
    (-> this (.setHostMetricName host-metric-name))))

(defn set-region
  "Description copied from interface: MetricAdminMBean

  region - `java.lang.String`"
  ([^MetricAdmin this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn machine-metrics-excluded?
  "Description copied from interface: MetricAdminMBean

  returns: `boolean`"
  (^Boolean [^MetricAdmin this]
    (-> this (.isMachineMetricsExcluded))))

(defn set-queue-poll-timeout-milli
  "Description copied from interface: MetricAdminMBean

  timeout-milli - `java.lang.Integer`"
  ([^MetricAdmin this ^java.lang.Integer timeout-milli]
    (-> this (.setQueuePollTimeoutMilli timeout-milli))))

(defn get-host-metric-name
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdmin this]
    (-> this (.getHostMetricName))))

(defn per-host-metrics-included?
  "Description copied from interface: MetricAdminMBean

  returns: `boolean`"
  (^Boolean [^MetricAdmin this]
    (-> this (.isPerHostMetricsIncluded))))

(defn get-metric-queue-size
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MetricAdmin this]
    (-> this (.getMetricQueueSize))))

(defn get-jvm-metric-name
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdmin this]
    (-> this (.getJvmMetricName))))

(defn get-metric-name-space
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdmin this]
    (-> this (.getMetricNameSpace))))

(defn get-request-metric-collector
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdmin this]
    (-> this (.getRequestMetricCollector))))

(defn get-queue-poll-timeout-milli
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^MetricAdmin this]
    (-> this (.getQueuePollTimeoutMilli))))

(defn set-credential-file
  "Description copied from interface: MetricAdminMBean

  filepath - must be a valid path to an AWS credential property file. - `java.lang.String`

  throws: java.io.FileNotFoundException"
  ([^MetricAdmin this ^java.lang.String filepath]
    (-> this (.setCredentialFile filepath))))

(defn set-single-metric-namespace
  "Description copied from interface: MetricAdminMBean

  single-metric-namespace - `boolean`"
  ([^MetricAdmin this ^Boolean single-metric-namespace]
    (-> this (.setSingleMetricNamespace single-metric-namespace))))

(defn get-credential-file
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdmin this]
    (-> this (.getCredentialFile))))

(defn metrics-enabled?
  "Description copied from interface: MetricAdminMBean

  returns: `boolean`"
  (^Boolean [^MetricAdmin this]
    (-> this (.isMetricsEnabled))))

(defn get-service-metric-collector
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdmin this]
    (-> this (.getServiceMetricCollector))))

(defn set-metric-queue-size
  "Description copied from interface: MetricAdminMBean

  metric-queue-size - `java.lang.Integer`"
  ([^MetricAdmin this ^java.lang.Integer metric-queue-size]
    (-> this (.setMetricQueueSize metric-queue-size))))

(defn disable-metrics
  "Description copied from interface: MetricAdminMBean"
  ([^MetricAdmin this]
    (-> this (.disableMetrics))))

(defn set-per-host-metrics-included
  "Description copied from interface: MetricAdminMBean

  include-per-host-metrics - true if per-host metrics is to be included; false otherwise. - `boolean`"
  ([^MetricAdmin this ^Boolean include-per-host-metrics]
    (-> this (.setPerHostMetricsIncluded include-per-host-metrics))))

(defn set-jvm-metric-name
  "Description copied from interface: MetricAdminMBean

  jvm-metric-name - `java.lang.String`"
  ([^MetricAdmin this ^java.lang.String jvm-metric-name]
    (-> this (.setJvmMetricName jvm-metric-name))))

(defn enable-default-metrics
  "Description copied from interface: MetricAdminMBean

  returns: true if the default AWS SDK metric collector has been
           successfully started by this call; false otherwise. - `boolean`"
  (^Boolean [^MetricAdmin this]
    (-> this (.enableDefaultMetrics))))

(defn get-region
  "Description copied from interface: MetricAdminMBean

  returns: `java.lang.String`"
  (^java.lang.String [^MetricAdmin this]
    (-> this (.getRegion))))

(defn set-machine-metrics-excluded
  "Description copied from interface: MetricAdminMBean

  exclude-jvm-metrics - true if JVM metrics is to be excluded; false otherwise. - `boolean`"
  ([^MetricAdmin this ^Boolean exclude-jvm-metrics]
    (-> this (.setMachineMetricsExcluded exclude-jvm-metrics))))

