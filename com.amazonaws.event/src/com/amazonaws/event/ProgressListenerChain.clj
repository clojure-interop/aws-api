(ns com.amazonaws.event.ProgressListenerChain
  "An implementation of ProgressListener interface that delegates
  progressChanged callback to multiple listeners. It also takes
  an optional ProgressEventFilter to filter incoming events before
  passing them to the listeners.

  This class could be used for both Amazon S3 and Amazon Glacier clients. The
  legacy Amazon S3 progress listener chain
  com.amazonaws.services.s3.transfer.internal.ProgressListenerChain has been
  deprecated in favor of this new class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressListenerChain]))

(defn ->progress-listener-chain
  "Constructor.

  Create a listener chain with a ProgressEventFilter.

  progress-event-filter - `com.amazonaws.event.ProgressEventFilter`
  listeners - `com.amazonaws.event.ProgressListener`"
  (^ProgressListenerChain [^com.amazonaws.event.ProgressEventFilter progress-event-filter ^com.amazonaws.event.ProgressListener listeners]
    (new ProgressListenerChain progress-event-filter listeners))
  (^ProgressListenerChain [^com.amazonaws.event.ProgressListener listeners]
    (new ProgressListenerChain listeners)))

(defn add-progress-listener
  "listener - `com.amazonaws.event.ProgressListener`"
  ([^ProgressListenerChain this ^com.amazonaws.event.ProgressListener listener]
    (-> this (.addProgressListener listener))))

(defn remove-progress-listener
  "listener - `com.amazonaws.event.ProgressListener`"
  ([^ProgressListenerChain this ^com.amazonaws.event.ProgressListener listener]
    (-> this (.removeProgressListener listener))))

(defn progress-changed
  "Description copied from interface: ProgressListener

  progress-event - The event describing the progress change. - `com.amazonaws.event.ProgressEvent`"
  ([^ProgressListenerChain this ^com.amazonaws.event.ProgressEvent progress-event]
    (-> this (.progressChanged progress-event))))

(defn sync-call-safe?
  "Description copied from interface: DeliveryMode

  returns: `boolean`"
  (^Boolean [^ProgressListenerChain this]
    (-> this (.isSyncCallSafe))))

