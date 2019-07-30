(ns com.amazonaws.util.AWSRequestMetricsFullSupport
  "In contrast to AWSRequestMetrics, which is intended to be a minimal
  support of AWS SDK request metrics, this class is the full support of AWS SDK
  request metrics including features such as properties and sub-events.

  This class is instantiated instead of AWSRequestMetrics when request
  metric collection is required during a particular service request/response
  cycle."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util AWSRequestMetricsFullSupport]))

(defn ->aws-request-metrics-full-support
  "Constructor.

  This constructor should be used in the case when AWS SDK metrics
   collector is enabled."
  (^AWSRequestMetricsFullSupport []
    (new AWSRequestMetricsFullSupport )))

(defn start-event
  "Start an event which will be timed. The startTime and endTime are added
   to timingInfo only after endEvent is called. For every startEvent there
   should be a corresponding endEvent. If you start the same event without
   ending it, this will overwrite the old event. i.e. There is no support
   for recursive events yet. Having said that, if you start and end an event
   in that sequence multiple times, all events are logged in timingInfo in
   that order.

   This feature is enabled if the system property
   \"com.amazonaws.sdk.enableRuntimeProfiling\" is set, or if a
   RequestMetricCollector is in use either at the request, web service
   client, or AWS SDK level.

  event-name - - The name of the event to start - `java.lang.String`"
  ([^AWSRequestMetricsFullSupport this ^java.lang.String event-name]
    (-> this (.startEvent event-name))))

(defn end-event
  "End an event which was previously started. Once ended, log how much time
   the event took. It is illegal to end an Event that was not started. It is
   good practice to endEvent in a finally block. See Also startEvent.

  event-name - - The name of the event to start - `java.lang.String`"
  ([^AWSRequestMetricsFullSupport this ^java.lang.String event-name]
    (-> this (.endEvent event-name))))

(defn increment-counter
  "Add 1 to an existing count for a given event. If the count for that event
   does not exist, then it creates one and initializes it to 1.

   This feature is enabled if the system property
   \"com.amazonaws.sdk.enableRuntimeProfiling\" is set, or if a
   RequestMetricCollector is in use either at the request, web service
   client, or AWS SDK level.

  event - - The name of the event to count - `java.lang.String`"
  ([^AWSRequestMetricsFullSupport this ^java.lang.String event]
    (-> this (.incrementCounter event))))

(defn set-counter
  "counter-name - `java.lang.String`
  count - `long`"
  ([^AWSRequestMetricsFullSupport this ^java.lang.String counter-name ^Long count]
    (-> this (.setCounter counter-name count))))

(defn add-property
  "Add a property. If you add the same property more than once, it stores
   all values a list.

   This feature is enabled if the system property
   \"com.amazonaws.sdk.enableRuntimeProfiling\" is set, or if a
   RequestMetricCollector is in use either at the request, web service
   client, or AWS SDK level.

  property-name - The name of the property - `java.lang.String`
  value - The property value - `java.lang.Object`"
  ([^AWSRequestMetricsFullSupport this ^java.lang.String property-name ^java.lang.Object value]
    (-> this (.addProperty property-name value))))

(defn log
  ""
  ([^AWSRequestMetricsFullSupport this]
    (-> this (.log))))

(defn get-property
  "property-name - `java.lang.String`

  returns: `java.util.List<java.lang.Object>`"
  (^java.util.List [^AWSRequestMetricsFullSupport this ^java.lang.String property-name]
    (-> this (.getProperty property-name))))

(defn enabled?
  "Always returns true.

  returns: `boolean`"
  (^Boolean [^AWSRequestMetricsFullSupport this]
    (-> this (.isEnabled))))

