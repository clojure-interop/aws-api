(ns com.amazonaws.event.DeliveryMode
  "Used to indicate whether it is safe to deliver progress events to the
  listener synchronously. In general, a progress listener should never block,
  which is a necessary condition for the safety for synchronous delivery."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event DeliveryMode]))

(defn sync-call-safe?
  "Returns true if it is safe to make a synchronous callback to the
   implementing listener without the risk of incurring undue latency; false
   otherwise.

  returns: `boolean`"
  (^Boolean [^DeliveryMode this]
    (-> this (.isSyncCallSafe))))

