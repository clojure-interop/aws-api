(ns com.amazonaws.util.TimingInfo
  "Used both as a base class and a minimal support of timing info.

  In contrast to TimingInfoFullSupport, which is intended to be a full
  support of the timing info, this class only provides a minimal support of
  start and end time (ie with no-ops for sub-event measurements) for backward
  compatiblity reasons.

  This class is instantiated instead of TimingInfoFullSupport when
  request metric collection is not required during a particular service
  request/response cycle."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util TimingInfo]))

(defn *start-timing
  "Captures the current wall clock time (since epoch in millisecond)
   and the current time (in nanosecond) used for timing measurement.
   For more info, see:
   https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks

  returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo []
    (TimingInfo/startTiming )))

(defn *start-timing-full-support
  "Captures the given wall clock time and start time in nanosecond

  start-time-millis - start time since epoch in millisecond - `long`
  start-time-nano - start time in nanosecond - `long`

  returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo [^Long start-time-millis ^Long start-time-nano]
    (TimingInfo/startTimingFullSupport start-time-millis start-time-nano))
  (^com.amazonaws.util.TimingInfo [^Long start-time-nano]
    (TimingInfo/startTimingFullSupport start-time-nano))
  (^com.amazonaws.util.TimingInfo []
    (TimingInfo/startTimingFullSupport )))

(defn *new-timing-info-full-support
  "Returns a TimingInfoFullSupport based on the given
   start time since epoch in millisecond,
   and the given start and end time in nanosecond.

  start-epoch-time-milli - start time since epoch in millisecond - `long`
  start-time-nano - start time in nanosecond - `long`
  end-time-nano - end time in nanosecond - `long`

  returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo [^Long start-epoch-time-milli ^Long start-time-nano ^Long end-time-nano]
    (TimingInfo/newTimingInfoFullSupport start-epoch-time-milli start-time-nano end-time-nano))
  (^com.amazonaws.util.TimingInfo [^Long start-time-nano ^Long end-time-nano]
    (TimingInfo/newTimingInfoFullSupport start-time-nano end-time-nano)))

(defn *unmodifiable-timing-info
  "Returns an instance of TimingInfo that is not modifiable.

  start-epoch-time-milli - start time since epoch in millisecond - `long`
  start-time-nano - start time in nanosecond - `long`
  end-time-nano - end time in nanosecond; or null if not known - `java.lang.Long`

  returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo [^Long start-epoch-time-milli ^Long start-time-nano ^java.lang.Long end-time-nano]
    (TimingInfo/unmodifiableTimingInfo start-epoch-time-milli start-time-nano end-time-nano))
  (^com.amazonaws.util.TimingInfo [^Long start-time-nano ^java.lang.Long end-time-nano]
    (TimingInfo/unmodifiableTimingInfo start-time-nano end-time-nano)))

(defn *duration-milli-of
  "Returns the duration in milliseconds as double, preserving the decimal
   precision as necessary, for the given start and end time in nanoseconds.

  start-time-nano - `long`
  end-time-nano - `long`

  returns: `double`"
  (^Double [^Long start-time-nano ^Long end-time-nano]
    (TimingInfo/durationMilliOf start-time-nano end-time-nano)))

(defn increment-counter
  "key - `java.lang.String`"
  ([^TimingInfo this ^java.lang.String key]
    (-> this (.incrementCounter key))))

(defn get-sub-measurements-by-name
  "returns: `java.util.Map<java.lang.String,java.util.List<com.amazonaws.util.TimingInfo>>`"
  (^java.util.Map [^TimingInfo this]
    (-> this (.getSubMeasurementsByName))))

(defn get-time-taken-millis-if-known
  "returns: `java.lang.Double`"
  (^java.lang.Double [^TimingInfo this]
    (-> this (.getTimeTakenMillisIfKnown))))

(defn get-end-time-nano-if-known
  "returns: `java.lang.Long`"
  (^java.lang.Long [^TimingInfo this]
    (-> this (.getEndTimeNanoIfKnown))))

(defn get-start-time
  "Deprecated.

  returns: `long`"
  (^Long [^TimingInfo this]
    (-> this (.getStartTime))))

(defn get-all-counters
  "returns: `java.util.Map<java.lang.String,java.lang.Number>`"
  (^java.util.Map [^TimingInfo this]
    (-> this (.getAllCounters))))

(defn get-end-epoch-time-milli-if-known
  "returns: `java.lang.Long`"
  (^java.lang.Long [^TimingInfo this]
    (-> this (.getEndEpochTimeMilliIfKnown))))

(defn get-elapsed-time-millis
  "Deprecated.

  returns: `long`"
  (^Long [^TimingInfo this]
    (-> this (.getElapsedTimeMillis))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TimingInfo this]
    (-> this (.toString))))

(defn end-time-known?
  "returns: `boolean`"
  (^Boolean [^TimingInfo this]
    (-> this (.isEndTimeKnown))))

(defn get-counter
  "key - `java.lang.String`

  returns: `java.lang.Number`"
  (^java.lang.Number [^TimingInfo this ^java.lang.String key]
    (-> this (.getCounter key))))

(defn start-epoch-time-milli-known?
  "returns: `boolean`"
  (^Boolean [^TimingInfo this]
    (-> this (.isStartEpochTimeMilliKnown))))

(defn set-end-time
  "Deprecated.

  end-time-milli - `long`"
  ([^TimingInfo this ^Long end-time-milli]
    (-> this (.setEndTime end-time-milli))))

(defn get-time-taken-millis
  "Deprecated.

  returns: `double`"
  (^Double [^TimingInfo this]
    (-> this (.getTimeTakenMillis))))

(defn get-sub-measurement
  "sub-mesurement-name - `java.lang.String`
  index - `int`

  returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo [^TimingInfo this ^java.lang.String sub-mesurement-name ^Integer index]
    (-> this (.getSubMeasurement sub-mesurement-name index)))
  (^com.amazonaws.util.TimingInfo [^TimingInfo this ^java.lang.String sub-measurement-name]
    (-> this (.getSubMeasurement sub-measurement-name))))

(defn get-start-time-nano
  "returns: `long`"
  (^Long [^TimingInfo this]
    (-> this (.getStartTimeNano))))

(defn get-end-time
  "Deprecated.

  returns: `long`"
  (^Long [^TimingInfo this]
    (-> this (.getEndTime))))

(defn set-end-time-nano
  "end-time-nano - `long`"
  ([^TimingInfo this ^Long end-time-nano]
    (-> this (.setEndTimeNano end-time-nano))))

(defn get-start-epoch-time-milli-if-known
  "returns: `java.lang.Long`"
  (^java.lang.Long [^TimingInfo this]
    (-> this (.getStartEpochTimeMilliIfKnown))))

(defn get-end-epoch-time-milli
  "Deprecated.

  returns: `long`"
  (^Long [^TimingInfo this]
    (-> this (.getEndEpochTimeMilli))))

(defn get-end-time-nano
  "returns: `long`"
  (^Long [^TimingInfo this]
    (-> this (.getEndTimeNano))))

(defn end-timing
  "returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo [^TimingInfo this]
    (-> this (.endTiming))))

(defn set-counter
  "key - `java.lang.String`
  count - `long`"
  ([^TimingInfo this ^java.lang.String key ^Long count]
    (-> this (.setCounter key count))))

(defn get-all-sub-measurements
  "sub-measurement-name - `java.lang.String`

  returns: `java.util.List<com.amazonaws.util.TimingInfo>`"
  (^java.util.List [^TimingInfo this ^java.lang.String sub-measurement-name]
    (-> this (.getAllSubMeasurements sub-measurement-name))))

(defn add-sub-measurement
  "sub-measurement-name - `java.lang.String`
  timing-info - `com.amazonaws.util.TimingInfo`"
  ([^TimingInfo this ^java.lang.String sub-measurement-name ^com.amazonaws.util.TimingInfo timing-info]
    (-> this (.addSubMeasurement sub-measurement-name timing-info))))

(defn get-last-sub-measurement
  "sub-measurement-name - `java.lang.String`

  returns: `com.amazonaws.util.TimingInfo`"
  (^com.amazonaws.util.TimingInfo [^TimingInfo this ^java.lang.String sub-measurement-name]
    (-> this (.getLastSubMeasurement sub-measurement-name))))

(defn get-start-epoch-time-milli
  "Deprecated.

  returns: `long`"
  (^Long [^TimingInfo this]
    (-> this (.getStartEpochTimeMilli))))

