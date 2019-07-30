(ns com.amazonaws.event.ProgressEventFilter
  "An interface that filters the incoming events before passing
  them into the registered listeners."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressEventFilter]))

(defn filter
  "Returns the filtered event object that will be actually passed into
   the listeners. Returns null if the event should be completely blocked.

  progress-event - `com.amazonaws.event.ProgressEvent`

  returns: `com.amazonaws.event.ProgressEvent`"
  (^com.amazonaws.event.ProgressEvent [^ProgressEventFilter this ^com.amazonaws.event.ProgressEvent progress-event]
    (-> this (.filter progress-event))))

