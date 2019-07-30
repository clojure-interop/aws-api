(ns com.amazonaws.auth.SdkClock$MockClock
  "Mock implementation used in tests."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SdkClock$MockClock]))

(defn ->mock-clock
  "Constructor.

  mocked-time - `java.util.Date`"
  (^SdkClock$MockClock [^java.util.Date mocked-time]
    (new SdkClock$MockClock mocked-time)))

(defn current-time-millis
  "returns: `long`"
  (^Long [^SdkClock$MockClock this]
    (-> this (.currentTimeMillis))))

