(ns com.amazonaws.metrics.AwsSdkMetrics
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.metrics AwsSdkMetrics]))

(def *-default-metric-namespace
  "Static Constant.

  type: java.lang.String"
  AwsSdkMetrics/DEFAULT_METRIC_NAMESPACE)

(def *-use-single-metric-namespace
  "Static Constant.

  Used to enable the use of a single metric namespace for all levels of SDK
   generated CloudWatch metrics such as JVM level, host level, etc.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=useSingleMetricNamespace

  type: java.lang.String"
  AwsSdkMetrics/USE_SINGLE_METRIC_NAMESPACE)

(def *-exclude-machine-metrics
  "Static Constant.

  Used to exclude the generation of JVM metrics when the AWS SDK default
   metrics is enabled.
   By default, jvm metrics is included.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=excludeJvmMetrics

  type: java.lang.String"
  AwsSdkMetrics/EXCLUDE_MACHINE_METRICS)

(def *-include-per-host-metrics
  "Static Constant.

  Used to generate per host level metrics when the AWS SDK default
   metrics is enabled.
   By default, per-host level metrics is excluded.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=includePerHostMetrics

  type: java.lang.String"
  AwsSdkMetrics/INCLUDE_PER_HOST_METRICS)

(def *-aws-credential-properties-file
  "Static Constant.

  Used to specify an AWS credential property file.
   By default, the DefaultAWSCredentialsProviderChain is used.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=credentialFile=/path/aws.properties

  type: java.lang.String"
  AwsSdkMetrics/AWS_CREDENTIAL_PROPERTIES_FILE)

(def *-aws-credentail-properties-file
  "Static Constant.

  Deprecated. in favor of AWS_CREDENTIAL_PROPERTIES_FILE

  type: java.lang.String"
  AwsSdkMetrics/AWS_CREDENTAIL_PROPERTIES_FILE)

(def *-cloudwatch-region
  "Static Constant.

  Used to specify the Amazon CloudWatch region for metrics uploading purposes.
   By default, metrics are uploaded to us-east-1.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=cloudwatchRegion=us-west-2

  type: java.lang.String"
  AwsSdkMetrics/CLOUDWATCH_REGION)

(def *-metric-queue-size
  "Static Constant.

  Used to specify the internal in-memory queue size for queuing metrics
   data points. The default size is 1,000.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=metricQueueSize=1000

  type: java.lang.String"
  AwsSdkMetrics/METRIC_QUEUE_SIZE)

(def *-queue-poll-timeout-milli
  "Static Constant.

  Used to specify the internal queue polling timeout in millisecond.
   The default timeout is 1 minute, which is optimal for the default
   CloudWatch implementation.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=getQueuePollTimeoutMilli=60000

  type: java.lang.String"
  AwsSdkMetrics/QUEUE_POLL_TIMEOUT_MILLI)

(def *-metric-name-space
  "Static Constant.

  Used to specify a custom metric name space.
   The default name space is DEFAULT_METRIC_NAMESPACE.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=metricNameSpace=MyNameSpace

  type: java.lang.String"
  AwsSdkMetrics/METRIC_NAME_SPACE)

(def *-jvm-metric-name
  "Static Constant.

  Used to generate per JVM level metrics when the AWS SDK default
   metrics is enabled.
   By default, JVM level metrics are not generated.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=jvmMetricName=Tomcat1

  type: java.lang.String"
  AwsSdkMetrics/JVM_METRIC_NAME)

(def *-host-metric-name
  "Static Constant.

  Used to explicitly specify the host name for metric purposes, instead of
   detecting the host name via InetAddress when the AWS SDK default
   metrics is enabled. Specifying the host name also has the side effecting
   of enabling per host level metrics.



   Example:
    -Dcom.amazonaws.sdk.enableDefaultMetrics=hostMetricName=MyHost

  type: java.lang.String"
  AwsSdkMetrics/HOST_METRIC_NAME)

(defn *add-all
  "Adds the given metric types to the registry of predefined metrics to be
   captured at the AWS SDK level.

  types - `java.util.Collection`

  returns: true if the set of predefined metric types gets changed as a
          result of the call - `<T extends com.amazonaws.metrics.MetricType> boolean`"
  ([^java.util.Collection types]
    (AwsSdkMetrics/addAll types)))

(defn *single-metric-namespace?
  "Returns true if a single metric name space is to be used for all
   levels of SDK generated CloudWatch metrics, including JVM level, host
   level, etc.; false otherwise.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isSingleMetricNamespace )))

(defn *set-metric-name-space
  "Sets the metric name space.

  metric-name-space - metric name space which must neither be null or blank. - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if the specified metric name space is either null or blank."
  ([^java.lang.String metric-name-space]
    (AwsSdkMetrics/setMetricNameSpace metric-name-space)))

(defn *set-host-metric-name
  "Sets the host name for generating per-host level metrics.

  host-metric-name - host name for generating per-host level metrics; or null or blank if the host is to be automatically detected via InetAddress. - `java.lang.String`"
  ([^java.lang.String host-metric-name]
    (AwsSdkMetrics/setHostMetricName host-metric-name)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AwsSdkMetrics c : AwsSdkMetrics.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.metrics.AwsSdkMetrics[]`"
  ([]
    (AwsSdkMetrics/values )))

(defn *set-region
  "Sets the region to be used for the default AWS SDK metric collector;
   or null if the default is to be used.

  region - `com.amazonaws.regions.Regions`"
  ([^com.amazonaws.regions.Regions region]
    (AwsSdkMetrics/setRegion region)))

(defn *enable-http-socket-read-metric
  "Used to enable AWSRequestMetrics.Field.HttpSocketReadTime metric since by default it is disabled."
  ([]
    (AwsSdkMetrics/enableHttpSocketReadMetric )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.metrics.AwsSdkMetrics`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.metrics.AwsSdkMetrics [^java.lang.String name]
    (AwsSdkMetrics/valueOf name)))

(defn *set-queue-poll-timeout-milli
  "Sets the queue poll time in millisecond to be used for the default AWS
   SDK metric collector; or null if the default is to be used.

  timeout-milli - `java.lang.Long`"
  ([^java.lang.Long timeout-milli]
    (AwsSdkMetrics/setQueuePollTimeoutMilli timeout-milli)))

(defn *get-host-metric-name
  "Returns the host name for generating per-host level metrics; or
   null or blank if the host is to be automatically detected via
   InetAddress.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsSdkMetrics/getHostMetricName )))

(defn *http-socket-read-metric-enabled?
  "Returns true if HttpSocketReadMetric is enabled; false otherwise.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isHttpSocketReadMetricEnabled )))

(defn *get-metric-queue-size
  "Returns the internal metric queue size to be used for the default AWS SDK
   metric collector; or null if the default is to be used.

  returns: `java.lang.Integer`"
  (^java.lang.Integer []
    (AwsSdkMetrics/getMetricQueueSize )))

(defn *unregister-metric-admin-m-bean
  "Unregisters the metric admin MBean from JMX for the current classloader.

  returns: true if the unregistration succeeded or if there is no admin
           MBean registered; false otherwise. - `boolean`"
  (^Boolean []
    (AwsSdkMetrics/unregisterMetricAdminMBean )))

(defn *get-jvm-metric-name
  "Returns the name of the JVM for generating per-JVM level metrics;
   or null or blank if per-JVM level metrics are disabled.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsSdkMetrics/getJvmMetricName )))

(defn *get-metric-name-space
  "Returns the metric name space, which is never null or blank.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsSdkMetrics/getMetricNameSpace )))

(defn *get-credentail-file
  "Deprecated. use getCredentialFile()

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsSdkMetrics/getCredentailFile )))

(defn *per-host-metric-included?
  "Returns true if the per-host metrics flag has been set; false otherwise.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isPerHostMetricIncluded )))

(defn *get-region-name
  "Returns the region name configured for the default AWS SDK metric collector;
   or null if the default is to be used.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsSdkMetrics/getRegionName )))

(defn *get-request-metric-collector
  "Returns a non-null request metric collector for the SDK. If no custom
   request metric collector has previously been specified via
   setMetricCollector(MetricCollector) and the
   SDKGlobalConfiguration.DEFAULT_METRICS_SYSTEM_PROPERTY has been set, then this method
   will initialize and return the default metric collector provided by the
   AWS SDK on a best-attempt basis.

  returns: `<T extends com.amazonaws.metrics.RequestMetricCollector> T`"
  ([]
    (AwsSdkMetrics/getRequestMetricCollector )))

(defn *get-queue-poll-timeout-milli
  "Returns the internal metric queue timeout in millisecond to be used for
   the default AWS SDK metric collector; or null if the default is to be
   used.

  returns: `java.lang.Long`"
  (^java.lang.Long []
    (AwsSdkMetrics/getQueuePollTimeoutMilli )))

(defn *get-credential-provider
  "Returns the credential provider for the default AWS SDK metric implementation.
   This method is restricted to calls from the default AWS SDK metric implementation.

  returns: `com.amazonaws.auth.AWSCredentialsProvider`

  throws: java.lang.SecurityException - if called outside the default AWS SDK metric implementation."
  (^com.amazonaws.auth.AWSCredentialsProvider []
    (AwsSdkMetrics/getCredentialProvider )))

(defn *set-credential-file
  "Sets the AWS credential file to be used for accessing Amazon CloudWatch.
   Successfully calling this method would result in the AWS credential
   provider to make use of the given credential file.

  filepath - `java.lang.String`

  throws: java.io.FileNotFoundException"
  ([^java.lang.String filepath]
    (AwsSdkMetrics/setCredentialFile filepath)))

(defn *remove
  "Removes the given metric type from the registry of predefined metrics to
   be captured at the AWS SDK level.

  type - `com.amazonaws.metrics.MetricType`

  returns: true if the set of predefined metric types gets changed as a
          result of the call - `boolean`"
  (^Boolean [^com.amazonaws.metrics.MetricType type]
    (AwsSdkMetrics/remove type)))

(defn *get-predefined-metrics
  "Returns an unmodifiable set of the current predefined metrics.

  returns: `java.util.Set<com.amazonaws.metrics.MetricType>`"
  (^java.util.Set []
    (AwsSdkMetrics/getPredefinedMetrics )))

(defn *set-single-metric-namespace
  "Used to set whether a single metric name space is to be used for all
   levels of SDK generated CloudWatch metrics, including JVM level, host
   level, etc.

  single-metric-namespace - true if single metric name is to be used; false otherwise. - `boolean`"
  ([^Boolean single-metric-namespace]
    (AwsSdkMetrics/setSingleMetricNamespace single-metric-namespace)))

(defn *get-credential-file
  "Returns the last set AWS credential file, or null if there is none.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsSdkMetrics/getCredentialFile )))

(defn *metrics-enabled?
  "Returns true if metrics at the AWS SDK level is enabled; false
   if disabled.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isMetricsEnabled )))

(defn *get-metric-collector
  "returns: `<T extends com.amazonaws.metrics.MetricCollector> T`"
  ([]
    (AwsSdkMetrics/getMetricCollector )))

(defn *get-service-metric-collector
  "returns: `<T extends com.amazonaws.metrics.ServiceMetricCollector> T`"
  ([]
    (AwsSdkMetrics/getServiceMetricCollector )))

(defn *add
  "Adds the given metric type to the registry of predefined metrics to be
   captured at the AWS SDK level.

  type - `com.amazonaws.metrics.MetricType`

  returns: true if the set of predefined metric types gets changed as a
          result of the call - `boolean`"
  (^Boolean [^com.amazonaws.metrics.MetricType type]
    (AwsSdkMetrics/add type)))

(defn *set
  "Sets the given metric types to replace the registry of predefined metrics
   to be captured at the AWS SDK level.

  types - `java.util.Collection`

  returns: `<T extends com.amazonaws.metrics.MetricType> void`"
  ([^java.util.Collection types]
    (AwsSdkMetrics/set types)))

(defn *set-metric-collector
  "Sets the metric collector to be used by the AWS SDK, and stop the
   previously running collector used by the AWS SDK, if any. Note, however,
   a request metric collector specified at the web service client level or
   request level, if any, always takes precedence over the one specified at
   the AWS SDK level.

   Caller of this method is responsible for starting the new metric
   collector specified as the input parameter.

  mc - the metric collector to be used by the AWS SDK; or null if no metric collection is to be performed at the AWS SDK level. - `com.amazonaws.metrics.MetricCollector`"
  ([^com.amazonaws.metrics.MetricCollector mc]
    (AwsSdkMetrics/setMetricCollector mc)))

(defn *set-credential-provider
  "Sets the credential provider for the default AWS SDK metric
   implementation; or null if the default is to be used. Calling this method
   may result in the credential provider being different from the credential
   file property.

  provider - `com.amazonaws.auth.AWSCredentialsProvider`"
  ([^com.amazonaws.auth.AWSCredentialsProvider provider]
    (AwsSdkMetrics/setCredentialProvider provider)))

(defn *set-metric-queue-size
  "Sets the metric queue size to be used for the default AWS SDK metric collector;
   or null if the default is to be used.

  size - `java.lang.Integer`"
  ([^java.lang.Integer size]
    (AwsSdkMetrics/setMetricQueueSize size)))

(defn *disable-metrics
  "Convenient method to disable the metric collector at the AWS SDK
   level."
  ([]
    (AwsSdkMetrics/disableMetrics )))

(defn *get-registered-admin-mbean-name
  "Returns the name of the registered admin mbean; or null if the admin
   mbean is not currently registered.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AwsSdkMetrics/getRegisteredAdminMbeanName )))

(defn *set-per-host-metrics-included
  "Used to set whether the per-host metrics is to be included.

  include-per-host-metrics - true if per-host metrics is to be included; false otherwise. - `boolean`"
  ([^Boolean include-per-host-metrics]
    (AwsSdkMetrics/setPerHostMetricsIncluded include-per-host-metrics)))

(defn *set-jvm-metric-name
  "Sets the name of the JVM for generating per-JVM level metrics.

  jvm-metric-name - name of the JVM for generating per-JVM level metrics; or null or blank if per-JVM level metrics are to be disabled. - `java.lang.String`"
  ([^java.lang.String jvm-metric-name]
    (AwsSdkMetrics/setJvmMetricName jvm-metric-name)))

(defn *machine-metric-excluded?
  "Returns true if machine metrics is to be excluded.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isMachineMetricExcluded )))

(defn *metric-admin-m-bean-registered?
  "Returns true if the metric admin MBean is currently registered for JMX
   access; false otherwise.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isMetricAdminMBeanRegistered )))

(defn *enable-default-metrics
  "Starts the default AWS SDK metric collector, but
   only if no metric collector is currently in use at the AWS SDK
   level.

  returns: true if the default AWS SDK metric collector has been
           successfully started by this call; false otherwise. - `boolean`"
  (^Boolean []
    (AwsSdkMetrics/enableDefaultMetrics )))

(defn *default-metrics-enabled?
  "Returns true if the system property
   SDKGlobalConfiguration.DEFAULT_METRICS_SYSTEM_PROPERTY has been
   set; false otherwise.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isDefaultMetricsEnabled )))

(defn *get-region
  "Deprecated. Use getRegionName()

  returns: `com.amazonaws.regions.Regions`

  throws: java.lang.IllegalArgumentException - when using a region not included in Regions"
  (^com.amazonaws.regions.Regions []
    (AwsSdkMetrics/getRegion )))

(defn *per-host-metric-enabled?
  "Returns true if per-host metrics is enabled; false otherwise.

  returns: `boolean`"
  (^Boolean []
    (AwsSdkMetrics/isPerHostMetricEnabled )))

(defn *register-metric-admin-m-bean
  "Registers the metric admin MBean for JMX access for the current
   classloader. If an AdminMbean is found to have been registered under a
   different class loader, the AdminMBean of the current class loader would
   be registered under the same name MBEAN_OBJECT_NAME but with an
   additional suffix in the format of \"/\", where count is a counter
   incrementing from 1.

  returns: true if the registeration succeeded; false otherwise. - `boolean`"
  (^Boolean []
    (AwsSdkMetrics/registerMetricAdminMBean )))

(defn *set-machine-metrics-excluded
  "Used to set whether the machine metrics is to be excluded.

  exclude-machine-metrics - true if machine metrics is to be excluded; false otherwise. - `boolean`"
  ([^Boolean exclude-machine-metrics]
    (AwsSdkMetrics/setMachineMetricsExcluded exclude-machine-metrics)))

