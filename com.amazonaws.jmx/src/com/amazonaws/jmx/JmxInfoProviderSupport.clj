(ns com.amazonaws.jmx.JmxInfoProviderSupport
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.jmx JmxInfoProviderSupport]))

(defn ->jmx-info-provider-support
  "Constructor."
  (^JmxInfoProviderSupport []
    (new JmxInfoProviderSupport )))

(defn get-file-decriptor-info
  "returns: `long[]`"
  ([^JmxInfoProviderSupport this]
    (-> this (.getFileDecriptorInfo))))

(defn get-thread-count
  "returns: `int`"
  (^Integer [^JmxInfoProviderSupport this]
    (-> this (.getThreadCount))))

(defn get-daemon-thread-count
  "returns: `int`"
  (^Integer [^JmxInfoProviderSupport this]
    (-> this (.getDaemonThreadCount))))

(defn get-peak-thread-count
  "returns: `int`"
  (^Integer [^JmxInfoProviderSupport this]
    (-> this (.getPeakThreadCount))))

(defn get-total-started-thread-count
  "returns: `long`"
  (^Long [^JmxInfoProviderSupport this]
    (-> this (.getTotalStartedThreadCount))))

(defn find-deadlocked-threads
  "returns: `long[]`"
  ([^JmxInfoProviderSupport this]
    (-> this (.findDeadlockedThreads))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^JmxInfoProviderSupport this]
    (-> this (.isEnabled))))

