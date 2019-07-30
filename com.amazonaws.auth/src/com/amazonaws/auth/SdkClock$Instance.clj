(ns com.amazonaws.auth.SdkClock$Instance
  "Container for Singleton instance of the SdkClock."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SdkClock$Instance]))

(defn ->instance
  "Constructor."
  (^SdkClock$Instance []
    (new SdkClock$Instance )))

(defn *get
  "returns: `com.amazonaws.auth.SdkClock`"
  (^com.amazonaws.auth.SdkClock []
    (SdkClock$Instance/get )))

(defn *set
  "Should only be used by tests to mock the clock.

  new-clock - New clock to use. - `com.amazonaws.auth.SdkClock`"
  ([^com.amazonaws.auth.SdkClock new-clock]
    (SdkClock$Instance/set new-clock)))

(defn *reset
  "Reset the clock to SdkClock.STANDARD. Should only be used by SDK tests."
  ([]
    (SdkClock$Instance/reset )))

