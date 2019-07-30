(ns com.amazonaws.endpointdiscovery.DaemonThreadFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.endpointdiscovery DaemonThreadFactory]))

(defn ->daemon-thread-factory
  "Constructor."
  (^DaemonThreadFactory []
    (new DaemonThreadFactory )))

(def *-instance
  "Static Constant.

  type: java.util.concurrent.ThreadFactory"
  DaemonThreadFactory/INSTANCE)

(defn new-thread
  "r - `java.lang.Runnable`

  returns: `java.lang.Thread`"
  (^java.lang.Thread [^DaemonThreadFactory this ^java.lang.Runnable r]
    (-> this (.newThread r))))

