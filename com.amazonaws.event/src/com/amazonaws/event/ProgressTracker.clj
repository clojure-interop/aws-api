(ns com.amazonaws.event.ProgressTracker
  "Default implementation for progress tracking."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressTracker]))

(defn ->progress-tracker
  "Constructor."
  (^ProgressTracker []
    (new ProgressTracker )))

(def *-noop
  "Static Constant.

  type: com.amazonaws.event.ProgressTracker"
  ProgressTracker/NOOP)

(defn progress-changed
  "Description copied from interface: ProgressListener

  progress-event - The event describing the progress change. - `com.amazonaws.event.ProgressEvent`"
  ([^ProgressTracker this ^com.amazonaws.event.ProgressEvent progress-event]
    (-> this (.progressChanged progress-event))))

(defn get-progress
  "returns: `com.amazonaws.event.request.Progress`"
  (^com.amazonaws.event.request.Progress [^ProgressTracker this]
    (-> this (.getProgress))))

