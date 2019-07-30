(ns com.amazonaws.event.ProgressListener
  "Listener interface for transfer progress events.

  This class could be used for both Amazon S3 and Amazon Glacier clients. The
  legacy Amazon S3 progress listener
  com.amazonaws.services.s3.model.ProgressListener has been deprecated in favor
  of this new class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressListener]))

(defn progress-changed
  "Called when progress has changed, such as additional bytes transferred,
   transfer failed, etc. The execution of the callback of this listener is managed
   by SDKProgressPublisher.  Implementation of this interface
   should never block.

   If the implementation follows the best practice and doesn't block, it
   should then extends from SyncProgressListener.

   Note any exception thrown by the listener will get ignored.
   Should there be need to capture any such exception, you may consider
   wrapping the listener with ProgressListener.ExceptionReporter.wrap(ProgressListener).

  progress-event - The event describing the progress change. - `com.amazonaws.event.ProgressEvent`"
  ([^ProgressListener this ^com.amazonaws.event.ProgressEvent progress-event]
    (-> this (.progressChanged progress-event))))

