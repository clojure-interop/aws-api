(ns com.amazonaws.event.SDKProgressPublisher
  "This class is responsible for executing the callback method of
  ProgressListener; listener callbacks are executed sequentially in a separate
  single thread."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event SDKProgressPublisher]))

(defn ->sdk-progress-publisher
  "Constructor."
  (^SDKProgressPublisher []
    (new SDKProgressPublisher )))

(defn *publish-request-content-length
  "Convenient method to publish a request content length event to the given
   listener.

  listener - must not be null or else the publication will be skipped - `com.amazonaws.event.ProgressListener`
  bytes - must be non-negative or else the publication will be skipped - `long`

  returns: `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^Long bytes]
    (SDKProgressPublisher/publishRequestContentLength listener bytes)))

(defn *publish-request-reset
  "Convenient method to publish a request reset event to the given listener.

  listener - must not be null or else the publication will be skipped - `com.amazonaws.event.ProgressListener`
  bytes-reset - must be non-negative or else the publication will be skipped - `long`

  returns: `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^Long bytes-reset]
    (SDKProgressPublisher/publishRequestReset listener bytes-reset)))

(defn *publish-response-reset
  "Convenient method to publish a response reset event to the given listener.

  listener - `com.amazonaws.event.ProgressListener`
  bytes-reset - `long`

  returns: `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^Long bytes-reset]
    (SDKProgressPublisher/publishResponseReset listener bytes-reset)))

(defn *shutdown
  "Can be used to shutdown the (legacy) executor.

   However, the recommended best practice is to always make use of progress
   listeners that are short-lived (ie do not block) and are subclasses of
   either SyncProgressListener or
   S3SyncProgressListener. That way, the progress publisher
   (legacy) thread will never be activated in the first place.

  now - true if shutdown now; false otherwise. - `boolean`"
  ([^Boolean now]
    (SDKProgressPublisher/shutdown now)))

(defn *publish-response-content-length
  "Convenient method to publish a response content length event to the given
   listener.

  listener - must not be null or else the publication will be skipped - `com.amazonaws.event.ProgressListener`
  bytes - must be non-negative or else the publication will be skipped - `long`

  returns: `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^Long bytes]
    (SDKProgressPublisher/publishResponseContentLength listener bytes)))

(defn *publish-response-bytes-transferred
  "Convenient method to publish a response byte transfer event to the given
   listener.

  listener - must not be null or else the publication will be skipped - `com.amazonaws.event.ProgressListener`
  bytes - must be non-negative or else the publication will be skipped - `long`

  returns: `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^Long bytes]
    (SDKProgressPublisher/publishResponseBytesTransferred listener bytes)))

(defn *publish-response-bytes-discarded
  "Convenient method to publish a response bytes discard event to the given listener.

  listener - `com.amazonaws.event.ProgressListener`
  bytes-discarded - `long`

  returns: `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^Long bytes-discarded]
    (SDKProgressPublisher/publishResponseBytesDiscarded listener bytes-discarded)))

(defn *wait-till-completion
  "Deprecated.

  throws: java.lang.InterruptedException"
  ([]
    (SDKProgressPublisher/waitTillCompletion )))

(defn *publish-progress
  "Used to deliver a progress event to the given listener.

  listener - `com.amazonaws.event.ProgressListener`
  type - `com.amazonaws.event.ProgressEventType`

  returns: the future of a submitted task; or null if the delivery is
   synchronous with no future task involved.  Note a listener should never
   block, and therefore returning null is the typical case. - `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^com.amazonaws.event.ProgressEventType type]
    (SDKProgressPublisher/publishProgress listener type)))

(defn *publish-request-bytes-transferred
  "Convenient method to publish a request byte transfer event to the given
   listener.

  listener - must not be null or else the publication will be skipped - `com.amazonaws.event.ProgressListener`
  bytes - must be non-negative or else the publication will be skipped - `long`

  returns: `java.util.concurrent.Future<?>`"
  (^java.util.concurrent.Future [^com.amazonaws.event.ProgressListener listener ^Long bytes]
    (SDKProgressPublisher/publishRequestBytesTransferred listener bytes)))

