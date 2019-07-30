(ns com.amazonaws.monitoring.MonitoringListener
  "The abstract class for a system that consumes Monitoring Events."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.monitoring MonitoringListener]))

(defn ->monitoring-listener
  "Constructor."
  (^MonitoringListener []
    (new MonitoringListener )))

(defn handle-event
  "Handle a MonitoringEvent

  event - a monitoring event - `com.amazonaws.monitoring.MonitoringEvent`"
  ([^MonitoringListener this ^com.amazonaws.monitoring.MonitoringEvent event]
    (-> this (.handleEvent event))))

