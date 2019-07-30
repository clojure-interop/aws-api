(ns com.amazonaws.event.DeliveryMode$Check
  "Provides convenient method to check if a listener is safe to be invoked
  synchronously."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event DeliveryMode$Check]))

(defn ->check
  "Constructor."
  (^DeliveryMode$Check []
    (new DeliveryMode$Check )))

(defn *sync-call-safe?
  "listener - `com.amazonaws.event.ProgressListener`

  returns: `boolean`"
  (^Boolean [^com.amazonaws.event.ProgressListener listener]
    (DeliveryMode$Check/isSyncCallSafe listener)))

