(ns com.amazonaws.event.ProgressListener$NoOpProgressListener
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressListener$NoOpProgressListener]))

(defn ->no-op-progress-listener
  "Constructor."
  (^ProgressListener$NoOpProgressListener []
    (new ProgressListener$NoOpProgressListener )))

(defn sync-call-safe?
  "Description copied from interface: DeliveryMode

  returns: `boolean`"
  (^Boolean [^ProgressListener$NoOpProgressListener this]
    (-> this (.isSyncCallSafe))))

(defn progress-changed
  "Description copied from interface: ProgressListener

  progress-event - The event describing the progress change. - `com.amazonaws.event.ProgressEvent`"
  ([^ProgressListener$NoOpProgressListener this ^com.amazonaws.event.ProgressEvent progress-event]
    (-> this (.progressChanged progress-event))))

