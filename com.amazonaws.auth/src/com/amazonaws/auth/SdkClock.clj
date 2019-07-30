(ns com.amazonaws.auth.SdkClock
  "Clock interface to prevent static coupling to System.currentTimeMillis()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SdkClock]))

(defn current-time-millis
  "returns: `long`"
  (^Long [^SdkClock this]
    (-> this (.currentTimeMillis))))

