(ns com.amazonaws.util.AWSRequestMetrics
  "Used as both a base class and a minimal support of AWS SDK request metrics.
  The base class of supporting AWS SDK request metrics.

  In contrast to AWSRequestMetricsFullSupport, which is intended to be
  a full support of AWS SDK request metrics, this class only provides access to
  a TimingInfo instance that only has minimal support for start and end
  time (ie with no-ops for sub-event measurements) for backward compatibility
  reason. The other methods related to properties and counters in this class
  are effectively no-ops.

  This class is instantiated instead of AWSRequestMetricsFullSupport
  when request metric collection is not required during a particular service
  request/response cycle."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util AWSRequestMetrics]))

(defn ->aws-request-metrics
  "Constructor.

  This constructor should be used only in the case when AWS SDK metrics
   collector is disabled, when minimal timing info is supported for backward
   compatibility reasons."
  (^AWSRequestMetrics []
    (new AWSRequestMetrics )))

(def *-simple-name
  "Static Constant.

  If the class name is required for logging and metrics we should use this
    constant version instead of the expensive function call.

  type: java.lang.String"
  AWSRequestMetrics/SIMPLE_NAME)

(defn increment-counter
  "event - `java.lang.String`"
  ([^AWSRequestMetrics this ^java.lang.String event]
    (-> this (.incrementCounter event))))

(defn start-event
  "event-name - `java.lang.String`"
  ([^AWSRequestMetrics this ^java.lang.String event-name]
    (-> this (.startEvent event-name))))

(defn add-property-with
  "Fluent API of addProperty(String, Object)

  property-name - `java.lang.String`
  value - `java.lang.Object`

  returns: `com.amazonaws.util.AWSRequestMetrics`"
  (^com.amazonaws.util.AWSRequestMetrics [^AWSRequestMetrics this ^java.lang.String property-name ^java.lang.Object value]
    (-> this (.addPropertyWith property-name value))))

(defn log
  ""
  ([^AWSRequestMetrics this]
    (-> this (.log))))

(defn get-property
  "property-name - `java.lang.String`

  returns: `java.util.List<java.lang.Object>`"
  (^java.util.List [^AWSRequestMetrics this ^java.lang.String property-name]
    (-> this (.getProperty property-name))))

(defn increment-counter-with
  "Fluent API of incrementCounter(String)

  event - `java.lang.String`

  returns: `com.amazonaws.util.AWSRequestMetrics`"
  (^com.amazonaws.util.AWSRequestMetrics [^AWSRequestMetrics this ^java.lang.String event]
    (-> this (.incrementCounterWith event))))

(defn set-counter
  "counter-name - `java.lang.String`
  count - `long`"
  ([^AWSRequestMetrics this ^java.lang.String counter-name ^Long count]
    (-> this (.setCounter counter-name count))))

(defn end-event
  "event-name - `java.lang.String`"
  ([^AWSRequestMetrics this ^java.lang.String event-name]
    (-> this (.endEvent event-name))))

(defn add-property
  "property-name - `java.lang.String`
  value - `java.lang.Object`"
  ([^AWSRequestMetrics this ^java.lang.String property-name ^java.lang.Object value]
    (-> this (.addProperty property-name value))))

(defn get-timing-info
  "returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo [^AWSRequestMetrics this]
    (-> this (.getTimingInfo))))

(defn with-counter
  "Fluent API of setCounter(String, long)

  counter-name - `java.lang.String`
  count - `long`

  returns: `com.amazonaws.util.AWSRequestMetrics`"
  (^com.amazonaws.util.AWSRequestMetrics [^AWSRequestMetrics this ^java.lang.String counter-name ^Long count]
    (-> this (.withCounter counter-name count))))

(defn enabled?
  "Returns true if this metrics is enabled; false otherwise.
   Returns false by default.

  returns: `boolean`"
  (^Boolean [^AWSRequestMetrics this]
    (-> this (.isEnabled))))

