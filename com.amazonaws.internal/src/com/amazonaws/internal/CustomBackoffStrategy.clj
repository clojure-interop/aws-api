(ns com.amazonaws.internal.CustomBackoffStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal CustomBackoffStrategy]))

(defn ->custom-backoff-strategy
  "Constructor."
  (^CustomBackoffStrategy []
    (new CustomBackoffStrategy )))

(defn get-backoff-period
  "retry-attempts - `int`

  returns: `int`"
  (^Integer [^CustomBackoffStrategy this ^Integer retry-attempts]
    (-> this (.getBackoffPeriod retry-attempts))))

