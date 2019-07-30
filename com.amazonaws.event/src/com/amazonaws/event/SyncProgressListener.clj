(ns com.amazonaws.event.SyncProgressListener
  "Abstract adapter class for a progress listener that is delivered with
  progress event synchronously."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event SyncProgressListener]))

(defn ->sync-progress-listener
  "Constructor."
  (^SyncProgressListener []
    (new SyncProgressListener )))

(defn sync-call-safe?
  "Always returns true.

  returns: `boolean`"
  (^Boolean [^SyncProgressListener this]
    (-> this (.isSyncCallSafe))))

