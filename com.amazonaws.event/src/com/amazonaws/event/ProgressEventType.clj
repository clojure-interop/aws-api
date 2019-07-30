(ns com.amazonaws.event.ProgressEventType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.event ProgressEventType]))

(def BYTE_TRANSFER_EVENT
  "Enum Constant.

  Deprecated.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/BYTE_TRANSFER_EVENT)

(def REQUEST_CONTENT_LENGTH_EVENT
  "Enum Constant.

  Event of the content length to be sent in a request.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/REQUEST_CONTENT_LENGTH_EVENT)

(def RESPONSE_CONTENT_LENGTH_EVENT
  "Enum Constant.

  Event of the content length received in a response.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/RESPONSE_CONTENT_LENGTH_EVENT)

(def REQUEST_BYTE_TRANSFER_EVENT
  "Enum Constant.

  Used to indicate the number of bytes to be sent to AWS.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/REQUEST_BYTE_TRANSFER_EVENT)

(def RESPONSE_BYTE_TRANSFER_EVENT
  "Enum Constant.

  Used to indicate the number of bytes received from AWS.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/RESPONSE_BYTE_TRANSFER_EVENT)

(def RESPONSE_BYTE_DISCARD_EVENT
  "Enum Constant.

  Used to indicate the number of bytes discarded after being received from AWS.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/RESPONSE_BYTE_DISCARD_EVENT)

(def CLIENT_REQUEST_STARTED_EVENT
  "Enum Constant.

  Event indicating that the client has started sending the AWS API request.
   This type of event is guaranteed to be only fired once during a
   request-response cycle, even when the request is retried.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/CLIENT_REQUEST_STARTED_EVENT)

(def HTTP_REQUEST_STARTED_EVENT
  "Enum Constant.

  Event indicating that the client has started sending the HTTP request.
   The request progress listener will be notified of multiple instances of
   this type of event if the request gets retried.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/HTTP_REQUEST_STARTED_EVENT)

(def HTTP_REQUEST_COMPLETED_EVENT
  "Enum Constant.

  Event indicating that the client has finished sending the HTTP request.
   The request progress listener will be notified of multiple instances of
   this type of event if the request gets retried.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/HTTP_REQUEST_COMPLETED_EVENT)

(def HTTP_REQUEST_CONTENT_RESET_EVENT
  "Enum Constant.

  Event indicating that the HTTP request content is reset, which may or may not
   be caused by the retry of the request.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/HTTP_REQUEST_CONTENT_RESET_EVENT)

(def CLIENT_REQUEST_RETRY_EVENT
  "Enum Constant.

  Event indicating that a failed request is detected as retryable and is
   ready for the next retry.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/CLIENT_REQUEST_RETRY_EVENT)

(def HTTP_RESPONSE_STARTED_EVENT
  "Enum Constant.

  Event indicating that the client has started reading the HTTP response.
   The request progress listener will be notified of this event only if the
   client receives a successful service response (i.e. 2XX status code).

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/HTTP_RESPONSE_STARTED_EVENT)

(def HTTP_RESPONSE_COMPLETED_EVENT
  "Enum Constant.

  Event indicating that the client has finished reading the HTTP response.
   The request progress listener will be notified of this event only if the
   client receives a successful service response (i.e. 2XX status code).

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/HTTP_RESPONSE_COMPLETED_EVENT)

(def HTTP_RESPONSE_CONTENT_RESET_EVENT
  "Enum Constant.

  Event indicating that the HTTP response content is reset.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/HTTP_RESPONSE_CONTENT_RESET_EVENT)

(def CLIENT_REQUEST_SUCCESS_EVENT
  "Enum Constant.

  Event indicating that the client has received a successful service
   response and has finished parsing the response data.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/CLIENT_REQUEST_SUCCESS_EVENT)

(def CLIENT_REQUEST_FAILED_EVENT
  "Enum Constant.

  Event indicating that a client request has failed (after retries have
   been conducted).

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/CLIENT_REQUEST_FAILED_EVENT)

(def TRANSFER_PREPARING_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_PREPARING_EVENT)

(def TRANSFER_STARTED_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_STARTED_EVENT)

(def TRANSFER_COMPLETED_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_COMPLETED_EVENT)

(def TRANSFER_FAILED_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_FAILED_EVENT)

(def TRANSFER_CANCELED_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_CANCELED_EVENT)

(def TRANSFER_PART_STARTED_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_PART_STARTED_EVENT)

(def TRANSFER_PART_COMPLETED_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_PART_COMPLETED_EVENT)

(def TRANSFER_PART_FAILED_EVENT
  "Enum Constant.

  type: com.amazonaws.event.ProgressEventType"
  ProgressEventType/TRANSFER_PART_FAILED_EVENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ProgressEventType c : ProgressEventType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.event.ProgressEventType[]`"
  ([]
    (ProgressEventType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.event.ProgressEventType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.event.ProgressEventType [^java.lang.String name]
    (ProgressEventType/valueOf name)))

(defn transfer-event?
  "Returns true if this event type is a transfer event, which may involve
   multiple request cycle events.

  returns: `boolean`"
  (^Boolean [^ProgressEventType this]
    (-> this (.isTransferEvent))))

(defn request-cycle-event?
  "Returns true if this event type is related to the execution of a
   single http request-response to AWS; false otherwise.

  returns: `boolean`"
  (^Boolean [^ProgressEventType this]
    (-> this (.isRequestCycleEvent))))

(defn byte-count-event?
  "Returns true if this even type is associated with some number of bytes;
   false otherwise.

  returns: `boolean`"
  (^Boolean [^ProgressEventType this]
    (-> this (.isByteCountEvent))))

