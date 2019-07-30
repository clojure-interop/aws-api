(ns com.amazonaws.event.ProgressEvent
  "A progress event. Typically this is used to notify a chunk of bytes has been
  transferred. Also used to notify other types of progress events such as a
  transfer starting, or failing.

  The legacy Amazon S3 progress event
  com.amazonaws.services.s3.model.ProgressEvent has been deprecated in favor of
  this new class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressEvent]))

(defn ->progress-event
  "Constructor.

  Creates a ProgressEvent object.

  event-type - Type of the progress event. This parameter must not be null. - `com.amazonaws.event.ProgressEventType`
  bytes - Number of bytes involved. - `long`"
  (^ProgressEvent [^com.amazonaws.event.ProgressEventType event-type ^Long bytes]
    (new ProgressEvent event-type bytes))
  (^ProgressEvent [^Long bytes]
    (new ProgressEvent bytes)))

(def *-preparing-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_PREPARING_EVENT

  type: int"
  ProgressEvent/PREPARING_EVENT_CODE)

(def *-started-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_STARTED_EVENT

  type: int"
  ProgressEvent/STARTED_EVENT_CODE)

(def *-completed-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_COMPLETED_EVENT

  type: int"
  ProgressEvent/COMPLETED_EVENT_CODE)

(def *-failed-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_FAILED_EVENT

  type: int"
  ProgressEvent/FAILED_EVENT_CODE)

(def *-canceled-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_CANCELED_EVENT

  type: int"
  ProgressEvent/CANCELED_EVENT_CODE)

(def *-reset-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.HTTP_REQUEST_CONTENT_RESET_EVENT

  type: int"
  ProgressEvent/RESET_EVENT_CODE)

(def *-part-started-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_PART_STARTED_EVENT

  type: int"
  ProgressEvent/PART_STARTED_EVENT_CODE)

(def *-part-completed-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_PART_COMPLETED_EVENT

  type: int"
  ProgressEvent/PART_COMPLETED_EVENT_CODE)

(def *-part-failed-event-code
  "Static Constant.

  Deprecated. Replaced by ProgressEventType.TRANSFER_PART_FAILED_EVENT

  type: int"
  ProgressEvent/PART_FAILED_EVENT_CODE)

(defn get-bytes
  "Returns the number of bytes associated with the event. The number of
   bytes are not necessarily the same as the number of bytes transferred,
   and it's meaning depends on the specific event type. For example, the
   bytes of a ProgressEventType.REQUEST_CONTENT_LENGTH_EVENT refers
   to the expected number of bytes to be sent to AWS, not the actual number
   of bytes that have been transferred.

  returns: `long`"
  (^Long [^ProgressEvent this]
    (-> this (.getBytes))))

(defn get-bytes-transferred
  "Convenient method to returns the number of bytes transferred in this
   event, or the number of bytes reset (or discarded) if negative. In
   particular, bytes of a content-length event is excluded.

  returns: `long`"
  (^Long [^ProgressEvent this]
    (-> this (.getBytesTransferred))))

(defn get-event-code
  "Deprecated. Use getEventType() instead.

  returns: The unique event code that identifies what type of specific type
           of event this object represents. - `int`"
  (^Integer [^ProgressEvent this]
    (-> this (.getEventCode))))

(defn get-event-type
  "Returns the type of event this object represents. This method never
   returns null.

  returns: The type of event this object represents. - `com.amazonaws.event.ProgressEventType`"
  (^com.amazonaws.event.ProgressEventType [^ProgressEvent this]
    (-> this (.getEventType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProgressEvent this]
    (-> this (.toString))))

