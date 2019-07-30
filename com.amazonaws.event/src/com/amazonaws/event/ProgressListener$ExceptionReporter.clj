(ns com.amazonaws.event.ProgressListener$ExceptionReporter
  "A utility class for capturing and reporting the first exception thrown by
  a given progress listener. Note once an exception is thrown by the
  underlying listener, all subsequent events will no longer be notified to
  the listener."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressListener$ExceptionReporter]))

(defn ->exception-reporter
  "Constructor.

  listener - `com.amazonaws.event.ProgressListener`"
  (^ProgressListener$ExceptionReporter [^com.amazonaws.event.ProgressListener listener]
    (new ProgressListener$ExceptionReporter listener)))

(defn *wrap
  "Returns a wrapper for the given listener to capture the first
   exception thrown.

  listener - `com.amazonaws.event.ProgressListener`

  returns: `com.amazonaws.event.ProgressListener$ExceptionReporter`"
  (^com.amazonaws.event.ProgressListener$ExceptionReporter [^com.amazonaws.event.ProgressListener listener]
    (ProgressListener$ExceptionReporter/wrap listener)))

(defn progress-changed
  "Delivers the progress event to the underlying listener but only if
   there has not been an exception previously thrown by the listener.

   Called when progress has changed, such as additional bytes transferred,
   transfer failed, etc. The execution of the callback of this listener is managed
   by SDKProgressPublisher.  Implementation of this interface
   should never block.

   If the implementation follows the best practice and doesn't block, it
   should then extends from SyncProgressListener.

   Note any exception thrown by the listener will get ignored.
   Should there be need to capture any such exception, you may consider
   wrapping the listener with wrap(ProgressListener).

  progress-event - The event describing the progress change. - `com.amazonaws.event.ProgressEvent`"
  ([^ProgressListener$ExceptionReporter this ^com.amazonaws.event.ProgressEvent progress-event]
    (-> this (.progressChanged progress-event))))

(defn throw-exception-if-any
  "Throws the underlying exception, if any, as an
   SdkClientException; or do nothing otherwise."
  ([^ProgressListener$ExceptionReporter this]
    (-> this (.throwExceptionIfAny))))

(defn get-cause
  "Returns the underlying exception, if any; or null otherwise.

  returns: `java.lang.Throwable`"
  (^java.lang.Throwable [^ProgressListener$ExceptionReporter this]
    (-> this (.getCause))))

(defn sync-call-safe?
  "Description copied from interface: DeliveryMode

  returns: `boolean`"
  (^Boolean [^ProgressListener$ExceptionReporter this]
    (-> this (.isSyncCallSafe))))

